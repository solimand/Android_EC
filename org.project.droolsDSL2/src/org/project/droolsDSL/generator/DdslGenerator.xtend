/*
 * generated by Xtext
 */
package org.project.droolsDSL.generator

import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.IGenerator
import org.eclipse.xtext.generator.IFileSystemAccess
import org.project.droolsDSL.ddsl.Statement
import java.util.Map
import java.util.HashMap
import java.util.List
import java.util.ArrayList

import org.project.droolsDSL.ddsl.impl.ExpressionImpl
import org.project.droolsDSL.ddsl.impl.IntConstantImpl
import org.project.droolsDSL.ddsl.impl.FloatConstantImpl
import org.project.droolsDSL.ddsl.impl.PlusImpl
import org.project.droolsDSL.ddsl.impl.BoolConstantImpl
import org.project.droolsDSL.ddsl.ConditionRule
import org.project.droolsDSL.utils.Statement_Context
import org.project.droolsDSL.ddsl.impl.MinusImpl
import org.project.droolsDSL.ddsl.impl.MulOrDivImpl
import org.project.droolsDSL.ddsl.impl.OrImpl
import org.project.droolsDSL.ddsl.impl.AndImpl
import org.project.droolsDSL.ddsl.impl.EqualityImpl
import org.project.droolsDSL.ddsl.impl.ComparisonImpl
import org.project.droolsDSL.ddsl.impl.ReferenceImpl
import org.project.droolsDSL.ddsl.impl.NotImpl
import org.project.droolsDSL.ddsl.impl.ReferenceTypeImpl
import org.project.droolsDSL.ddsl.impl.FluentImpl
import org.project.droolsDSL.ddsl.impl.EventFeatureImpl

/**
 * Generates code from your model files on save.
 * 
 * see http://www.eclipse.org/Xtext/documentation.html#TutorialCodeGeneration
 */
class DdslGenerator implements IGenerator {
	
	var List<Statement_Context> statement_List= new ArrayList<Statement_Context>();
	var Map<Integer, String[]> allEventParams = new HashMap<Integer, String[]>();
	
	override void doGenerate(Resource resource, IFileSystemAccess fsa) {
		statement_List.clear	
		for (e: resource.allContents.toIterable.filter(typeof(Statement))){
			var List<String> fluents = new ArrayList<String>();
			fluents.clear
			
			var List<String> params = new ArrayList<String>();
			params.clear		
			
			var String eventNameTemp = "";
			eventNameTemp = e.event.eventName;
			
			if (e.event.param != null){
			for(p:e.event.param) {params.add(p.name)}}
				
			var Map <String, Object[]> fluentContextTemp = new HashMap<String, Object[]>()
			for (f:e.fluent) {
				
				var toValueTemp = f.valuePart
				
//				if time=0 --> NO TIME
//				var Expression timeTemp =null
//				if (f.timePart!=null){ timeTemp =f.timePart as InExpr} 
				
				//if cond=null ---> NO CONDITION
				var ConditionRule condTemp = null
				if (f.condPart!=null){condTemp =f.condPart}
				
				var List<Object> contextTemp = new ArrayList<Object>();
				contextTemp.clear
				contextTemp.add(toValueTemp)
//				contextTemp.add(timeTemp)
				contextTemp.add(1000)
				contextTemp.add(condTemp)
				
				fluentContextTemp.put(f.name, contextTemp)
			}
			
			statement_List.add(new Statement_Context(eventNameTemp,params, fluentContextTemp))
		}

		// Move To The End
		fsa.generateFile('''models/MainModel_«System.currentTimeMillis.toString»_Time.java''', compileMain)

	}

	/**_____Compile Method_____**/
	def compileMain() {
		'''
		package models;
		
		//IMPORTs
		import it.bragaglia.freckles.model.*;
		
		public class MainModel_«System.currentTimeMillis»_Time {

			public static void main (String[] args) {

				public Model model = new ModelImpl();

				public ExpressionDescr exprContainer;
				public ConditionDescr condContainer;
				public Context contextContainer;
				public Effect effectContainer;
				public List<Effect> effects = new ArrayList<Effect>();

				«compileParams»
				«FOR statementCurr: statement_List»
				
				// Statement «statement_List.indexOf(statementCurr)» proceed...
					«FOR f:statementCurr.fluents»
						«var ExpressionImpl exprImplTemp =  statementCurr.getExpression(f) as ExpressionImpl»
						«compileExpr(statementCurr.eventName, statement_List.indexOf(statementCurr), f, exprImplTemp)»
					«ENDFOR»
				// Statement «statement_List.indexOf(statementCurr)» Finish
				«ENDFOR»	

				System.out.println("Done.");

			}
		}
		'''
	}


/*________________________________________________________________________________________*/
	/**_____Parameter Instance_____**/
	def compileParams(){
		'''
		// Parameters MAP 
		
		private static Map<Int, ParameterDescr[]> allEventParams = new HashMap<Int, ParameterDescr[]>();
		 
		«FOR statementCurr: statement_List»
			«IF statementCurr.params!=null»
				«allEventParams.put(statement_List.indexOf(statementCurr), statementCurr.params)»
				ParameterDescr paramsOfStatement_«statement_List.indexOf(statementCurr)»[] = new ParameterDescr[«statement_List.get(statement_List.indexOf(statementCurr)).params.length»];
				«FOR p: statement_List.get(statement_List.indexOf(statementCurr)).params»
						paramsOfStatement_«statement_List.indexOf(statementCurr)»[«statement_List.get(statement_List.indexOf(statementCurr)).params.indexOf(p)»] = new ParameterDescr("«p»");
				«ENDFOR»
				allEventParams.put(«statement_List.indexOf(statementCurr)», paramsOfStatement_«statement_List.indexOf(statementCurr)»);
				 
			«ENDIF»
		«ENDFOR»
		'''
	}
	def int retrieveParam(int statementNum, String paramName){
		var paramNumTemp = 100
		for (s: allEventParams.get(statementNum)){
			if (s.equals(paramName))
				paramNumTemp = allEventParams.get(statementNum).indexOf(s)
		}				
		return paramNumTemp;
	}
	

/*________________________________________________________________________________________*/
	/**_____Simple Expression Case_____**/
	def dispatch compileTerminalRight(int statementNum, ExpressionImpl term){
		switch term{
			IntConstantImpl:{'''new NumberDescr(«term.value»)'''}
			FloatConstantImpl:{'''new NumberDescr(«term.value»)'''}
			BoolConstantImpl:{'''new NumberDescr(«term.value»)'''}
		}				
	}
	def dispatch compileTerminalLeft(int statementNum, ExpressionImpl term){
		switch term{
			IntConstantImpl:{'''new NumberDescr(«term.value»)'''}
			FloatConstantImpl:{'''new NumberDescr(«term.value»)'''}
			BoolConstantImpl:{'''new NumberDescr(«term.value»)'''}
		}				
	}
	def dispatch compileTerminalRight(int statementNum, ReferenceTypeImpl term){
		switch term{
			EventFeatureImpl:{
				'''
				paramsOfStatement_«statementNum»[«retrieveParam(statementNum,term.name)»]«
				»'''
			}
			FluentImpl:{'''new SampleDescr("«term.name»")'''}
		}				
	}
	def dispatch compileTerminalLeft(int statementNum, ReferenceTypeImpl term){
		switch term{
			EventFeatureImpl:{
				'''
				paramsOfStatement_«statementNum»[«retrieveParam(statementNum,term.name)»]«
				»'''
			}
			FluentImpl:{'''new SampleDescr(«term.name»)'''}
		}				
	}
	
/*________________________________________________________________________________________*/
	/** HARD Expression Case */		
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, IntConstantImpl conditionExpr){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, FloatConstantImpl conditionExpr){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, BoolConstantImpl conditionExpr){
		'''new NumberDescr(«conditionExpr.value»)'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, ReferenceImpl conditionExpr){
		'''
		«IF conditionExpr.ref.eClass.name.contains("Feature")»
			paramsOfStatement_«statementNum»[«retrieveParam(statementNum,conditionExpr.ref.name)»]
		«ELSE»
			new SampleDescr("«conditionExpr.ref.name»")
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, PlusImpl conditionExpr){
		'''
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new PlusDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new PlusDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new PlusDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		'''	
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, MinusImpl conditionExpr){
		'''
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MinusDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MinusDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MinusDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, MulOrDivImpl conditionExpr){
		'''
			«IF conditionExpr.op.equals("*")»
				«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
					new TimesDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
				«ELSE»
					«IF conditionExpr.left.eClass.name.contains("Constant")»
						new TimesDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
					«ENDIF»
					«IF !conditionExpr.left.eClass.name.contains("Constant")»
						new TimesDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
					»«ENDIF»
				«ENDIF»
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
					new ObelusDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
				«ELSE»
					«IF conditionExpr.left.eClass.name.contains("Constant")»
						new ObelusDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
					«ENDIF»
					«IF !conditionExpr.left.eClass.name.contains("Constant")»
						new ObelusDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
					»«ENDIF»
				«ENDIF»
			«ENDIF»
		'''
	}
	
	
	
/*________________________________________________________________________________________*/	
	/** FIRST compile call Case */	
	def /*dispatch*/ compileExpr (String eventName, int statementNum, String fluentName, ExpressionImpl conditionExpr){
		var espr = conditionExpr.expression
		switch espr{
			ReferenceImpl:{
				'''
				«IF espr.ref.eClass.name.contains("Feature")»
					exprContainer = paramsOfStatement_«statementNum»[«retrieveParam(statementNum,espr.ref.name)»];
					
					«IF statement_List.get(statementNum).getCondition(fluentName) != null»
						«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "EventFeature")»
					«ELSE»
						«compileContextEffect(eventName, statementNum, fluentName, "EventFeature", null)»
					«ENDIF»
				«ELSE»
					exprContainer = new SampleDescr("«espr.ref.name»");
					
					«IF statement_List.get(statementNum).getCondition(fluentName) != null»
						«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Fluent")»
					«ELSE»
						«compileContextEffect(eventName, statementNum, fluentName, "Fluent", null)»
					«ENDIF»
				«ENDIF»				
				'''
			}
			IntConstantImpl:{
				'''
				exprContainer = new NumberDescr(«espr.value»);

				«IF statement_List.get(statementNum).getCondition(fluentName) != null»
					«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Int")»
				«ELSE»
					«compileContextEffect(eventName, statementNum, fluentName, "Int", null)»
				«ENDIF»
				'''
			}
			FloatConstantImpl:{
				'''
				exprContainer = new NumberDescr(«espr.value»);
				
				«IF statement_List.get(statementNum).getCondition(fluentName) != null»
					«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Float")»
				«ELSE»
					«compileContextEffect(eventName, statementNum, fluentName, "Float", null)»
				«ENDIF»
				'''
			}
			PlusImpl:{	
				'''
«««				Simple case 1+2				
				«IF espr.left.eClass.name.contains("Constant") && espr.right.eClass.name.contains("Constant")»

					exprContainer = new PlusDescr( «compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
						»«compileTerminalRight(statementNum,espr.right as ExpressionImpl)»);
				«ELSE»
«««					Case 1+(2+3)
					«IF espr.left.eClass.name.contains("Constant")»
						exprContainer = new PlusDescr(«compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
					«ENDIF»
«««					Case 1+2+3
					«IF !espr.left.eClass.name.contains("Constant")»
						exprContainer = new PlusDescr(«compileRecExpr(eventName, statementNum,fluentName,espr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
					«ENDIF»
				«ENDIF»
				
				«IF statement_List.get(statementNum).getCondition(fluentName) != null»
					«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Plus")»
				«ELSE»
					«compileContextEffect(eventName, statementNum, fluentName, "Plus", null)»
				«ENDIF»
				'''			
			}
			
			MinusImpl:{
				'''
				«IF espr.left.eClass.name.contains("Constant") && espr.right.eClass.name.contains("Constant")»

					exprContainer =  new MinusDescr( «compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
						»«compileTerminalRight(statementNum,espr.right as ExpressionImpl)»);
				«ELSE»
					«IF espr.left.eClass.name.contains("Constant")»
						exprContainer = new MinusDescr(«compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
					«ENDIF»
					«IF !espr.left.eClass.name.contains("Constant")»
						exprContainer = new MinusDescr(«compileRecExpr(eventName, statementNum,fluentName,espr.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
					«ENDIF»
				«ENDIF»

				«IF statement_List.get(statementNum).getCondition(fluentName) != null»
					«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Minus")»
				«ELSE»
					«compileContextEffect(eventName, statementNum, fluentName, "Minus", null)»
				«ENDIF»
				'''
			}

			MulOrDivImpl: {
				'''
				«IF espr.op.equals("*")»
					«IF espr.left.eClass.name.contains("Constant") && espr.right.eClass.name.contains("Constant")»

						exprContainer = new TimesDescr( «compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,espr.right as ExpressionImpl)»);
					«ELSE»
						«IF espr.left.eClass.name.contains("Constant")»
							exprContainer = new TimesDescr(«compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
						«ENDIF»
						«IF !espr.left.eClass.name.contains("Constant")»
							exprContainer = new TimesDescr(«compileRecExpr(eventName, statementNum,fluentName,espr.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
					
					«IF statement_List.get(statementNum).getCondition(fluentName) != null»
						«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Times")»
					«ELSE»
						«compileContextEffect(eventName, statementNum, fluentName, "Times", null)»
					«ENDIF»
				«ELSE»
					«IF espr.left.eClass.name.contains("Constant") && espr.right.eClass.name.contains("Constant")»

						exprContainer = new ObelusDescr( «compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,espr.right as ExpressionImpl)»);
					«ELSE»
						«IF espr.left.eClass.name.contains("Constant")»
							exprContainer = new ObelusDescr(«compileTerminalLeft(statementNum,espr.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
						«ENDIF»
						«IF !espr.left.eClass.name.contains("Constant")»
							exprContainer = new ObelusDescr(«compileRecExpr(eventName, statementNum,fluentName,espr.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,espr.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
					
					«IF statement_List.get(statementNum).getCondition(fluentName) != null»
						«compileCond(eventName,statementNum, fluentName, statement_List.get(statementNum).getCondition(fluentName) as ExpressionImpl, "Obelus")»
					«ELSE»
						«compileContextEffect(eventName, statementNum, fluentName, "Obelus", null)»
					«ENDIF»					
				«ENDIF»
				'''
			}
			default: '''//default compileExpr «espr.eClass»'''
		}
	}//compileExpr

	def compileContextEffect (String eventName, int statementNum, String fluentName, String opExpr, String opCond){
		'''
		«IF opCond!=null»
				contextContainer = new ContextImpl(paramsOfStatement_«statementNum», exprContainer, condContainer );
		«ELSE»
				contextContainer = new ContextImpl(paramsOfStatement_«statementNum»,exprContainer , null);
		«ENDIF»
		
		effectContainer = new EffectImpl("«fluentName»", contextContainer);
			effects.add(effectContainer);
			
		model.add("«eventName»", effects);
		effects.clear;
		 
		'''
	}


/*________________________________________________________________________________________*/	
	/**FIRST Condition Compile */
	def compileCond (String eventName, int statementNum, String fluentName, ExpressionImpl conditionExpr, String exprOp){
		var cond = conditionExpr.condition
		switch cond{
			NotImpl:{
				'''
				«IF cond.expression.eClass.name.equals("Constant")»
						condContainer = new NotDescr( «compileTerminalLeft(statementNum,cond.expression as ExpressionImpl)»);
				«ELSE»
						condContainer = new NotDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.expression as ExpressionImpl)»);
				«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"Not")»
				'''
			}
			OrImpl:{
				'''
				«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new OrDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
						»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
				«ELSE»
					«IF cond.left.eClass.name.contains("Constant")»
						condContainer = new OrDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
					«ENDIF»
					«IF !cond.left.eClass.name.contains("Constant")»
						condContainer = new OrDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
					«ENDIF»
				«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"Or")»
				'''
			}
			AndImpl:{
				'''
				«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
					condContainer = new AndDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
						»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
				«ELSE»
					«IF cond.left.eClass.name.contains("Constant")»
						condContainer = new AndDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
					«ENDIF»
					«IF !cond.left.eClass.name.contains("Constant")»
						condContainer = new AndDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
						»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
					«ENDIF»
				«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"And")»
				
				'''
			}
			EqualityImpl:{
				'''
				«IF cond.op.equals("==")»					««««==
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new SameDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new SameDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new SameDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"Same")»
				«ELSE» 										««««!=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new DifferentDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new DifferentDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new DifferentDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"Different")»
				«ENDIF»
				'''
			}
			ComparisonImpl:{
				'''
				«IF cond.op.equals(">=")»					««««>=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new MoreEqualsDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreEqualsDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreEqualsDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"MoreEquals")»
				«ELSEIF cond.op.equals("<=")» 				««««<=
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new LessEqualsDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new LessEqualsDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new LessEqualsDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"LessEquals")»
				«ELSEIF cond.op.equals(">")»				««««>
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new MoreDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new MoreDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"More")»
				«ELSE» 										««««<
					«IF cond.left.eClass.name.contains("Constant") && cond.right.eClass.name.contains("Constant")»
						condContainer = new LessDescr( «compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileTerminalRight(statementNum,cond.right as ExpressionImpl)»);
					«ELSE»
						«IF cond.left.eClass.name.contains("Constant")»
							condContainer = new LessDescr(«compileTerminalLeft(statementNum,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
						«IF !cond.left.eClass.name.contains("Constant")»
							condContainer = new LessDescr(«compileRecExpr(eventName, statementNum,fluentName,cond.left as ExpressionImpl)»,«
							»«compileRecExpr(eventName, statementNum,fluentName,cond.right as ExpressionImpl)»);
						«ENDIF»
					«ENDIF»
				
				«compileContextEffect(eventName,statementNum,fluentName,exprOp,"Less")»
				«ENDIF»
				'''
			}
			default: '''//default compileCond'''
		}
	}

/*________________________________________________________________________________________*/
	/** HARD Condition Case */
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, NotImpl conditionExpr){
		'''
		«IF conditionExpr.expression.eClass.name.contains("Constant")»
			new NotDescr( «compileTerminalLeft(statementNum,conditionExpr.expression as ExpressionImpl)»)
		«ELSE»
			new NotDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.expression as ExpressionImpl)»)
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, OrImpl conditionExpr){
		'''
		«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
			new OrDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
			»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
		«ELSE»
			«IF conditionExpr.left.eClass.name.contains("Constant")»
				new OrDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
			«ENDIF»
			«IF !conditionExpr.left.eClass.name.contains("Constant")»
				new OrDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
				»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
			»«ENDIF»
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, AndImpl conditionExpr){
		'''
		«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
			new AndDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
			»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
		«ELSE»
			«IF conditionExpr.left.eClass.name.contains("Constant")»
				new AndDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
			«ENDIF»
			«IF !conditionExpr.left.eClass.name.contains("Constant")»
				new AndDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
				»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
			»«ENDIF»
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, EqualityImpl conditionExpr){
		'''
		«IF conditionExpr.op.equals("==")»						««««==
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new SameDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new SameDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new SameDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals("!=")»					««««!=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new DifferentDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new DifferentDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new DifferentDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,«
					»«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ENDIF»
		'''
	}
	def dispatch compileRecExpr (String eventName, int statementNum, String fluentName, ComparisonImpl conditionExpr){
		'''
		«IF conditionExpr.op.equals(">=")»						««««>=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MoreEqualsDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MoreEqualsDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MoreEqualsDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals("<=")»					««««<=
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new LessEqualsDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new LessEqualsDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new LessEqualsDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ELSEIF conditionExpr.op.equals(">")»					««««>
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new MoreDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new MoreDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new MoreDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ELSE»													««««<
			«IF conditionExpr.left.eClass.name.contains("Constant") && conditionExpr.right.eClass.name.contains("Constant")»
				new LessDescr( «compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,«
				»«compileTerminalLeft(statementNum,conditionExpr.right as ExpressionImpl)»)
			«ELSE»
				«IF conditionExpr.left.eClass.name.contains("Constant")»
					new LessDescr(«compileTerminalLeft(statementNum,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)
				«ENDIF»
				«IF !conditionExpr.left.eClass.name.contains("Constant")»
					new LessDescr(«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.left as ExpressionImpl)»,
					«compileRecExpr(eventName, statementNum,fluentName,conditionExpr.right as ExpressionImpl)»)«
				»«ENDIF»
			«ENDIF»
		«ENDIF»
		'''
	}
			

	


}
/**
 * 
 * ALL Expression Type -->
 * 
 */
//			switch expr{
//				Plus:{}
//				IntConstant:{compileExpr(expr)}
//				BoolConstant:{'''//some1'''}
//				FloatConstant:{'''//some2'''}
//				And:{'''//some3'''}
//				Or:{'''//some3.1'''}			
//				Equality:{'''//some4'''}
//				Comparison:{'''//some5'''}
//				Minus:{'''//some6'''}
//				MulOrDiv:{'''//some7'''}
//				Not:{'''//some8'''}
//				FeatureRef: {'''//some9'''}
//				default: compileExpr(expr as IntConstant)
//			}//Switch