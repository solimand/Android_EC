package org.project.droolsDSL.interpreter

import com.google.inject.Inject
import org.project.droolsDSL.typing.ExpressionTypeProvider
import org.project.droolsDSL.ddsl.Expression
import org.project.droolsDSL.ddsl.IntConstant
import org.project.droolsDSL.ddsl.BoolConstant
import org.project.droolsDSL.ddsl.FloatConstant
import org.project.droolsDSL.ddsl.Not
import org.project.droolsDSL.ddsl.MulOrDiv
import org.project.droolsDSL.ddsl.Minus
import org.project.droolsDSL.ddsl.Plus
import org.project.droolsDSL.ddsl.Equality
import org.project.droolsDSL.ddsl.And
import org.project.droolsDSL.ddsl.Or
import org.project.droolsDSL.ddsl.Comparison
//import org.project.droolsDSL.ddsl.EventFeature

class ExpressionInterpreter {
	@Inject extension ExpressionTypeProvider
	
//	int resExp	float resFloatExp
	
	def Object interpret(Expression e) {
		switch (e) {
			IntConstant: e.value
			FloatConstant: e.value			
			BoolConstant: Boolean::parseBoolean(e.value)
			Not: !(e.expression.interpret as Boolean)
			
			//case float or int
			MulOrDiv: {
				//return Float
				if(e.left.typeFor.isFloat || e.left.typeFor.isFloat){
					if(e.left.typeFor.isFloat && e.right.typeFor.isInt){
						val left = e.left.interpret as Float
						val right = e.right.interpret as Integer
						if (e.op == '*')
							left * right
						else if (e.op == '/')
							left / right 
						else if (e.op == '%')
							left % right 
//						else if (e.op == '^'){
//							for(i:0..right)	{resFloatExp = resFloatExp*left}
//							resFloatExp
//						}
					}
					else if (e.left.typeFor.isInt && e.right.typeFor.isFloat){
						val left = e.left.interpret as Integer
						val right = e.right.interpret as Float
						if (e.op == '*')
							left * right 
						else if (e.op == '/')
							left / right 
						else if (e.op == '%')
							left % right 
					}					
					else{
						val left = e.left.interpret as Float
						val right = e.right.interpret as Float
						if (e.op == '*')
							left * right 
						else if (e.op == '/')
							left / right 
						else if (e.op == '%')
							left % right
					}
				}
				
				//return Int
				else{
					val left = e.left.interpret as Integer
					val right = e.right.interpret as Integer
					if (e.op == '*')
						left * right
					else if (e.op == '/')
						left / right
					else if (e.op == '%')
						left % right
				}				
				
			}//mulORdiv
			
			Not: !(e.expression.interpret as Boolean)
			
			Minus: {
				if (e.left.typeFor.float || e.left.typeFor.float){
					if (e.left.typeFor.float){
						if(e.right.typeFor.float) 	
							(e.left.interpret as Float) - (e.right.interpret as Float)
						else (e.left.interpret as Float) - (e.right.interpret as Integer)
					}
					else (e.left.interpret as Integer) - (e.right.interpret as Float)
				}
				
				else 
					(e.left.interpret as Integer) - (e.right.interpret as Integer)
			}
			
			Plus: {
				if (e.left.typeFor.float || e.left.typeFor.float){
					if (e.left.typeFor.float){
						if(e.right.typeFor.float) 	
							(e.left.interpret as Float) + (e.right.interpret as Float)
						else (e.left.interpret as Float) + (e.right.interpret as Integer)
					}
					else (e.left.interpret as Integer) + (e.right.interpret as Float)
				}
				
				else 
					(e.left.interpret as Integer) + (e.right.interpret as Integer)
			}			
			
			Equality: {
				if (e.op == '==')
					e.left.interpret == e.right.interpret
				else
					e.left.interpret != e.right.interpret
			}
			
			And: {
				(e.left.interpret as Boolean) && (e.right.interpret as Boolean)
			}
			
			Or: {
				(e.left.interpret as Boolean) || (e.right.interpret as Boolean)
			}
			
			Comparison: {
				if (e.left.typeFor.float || e.left.typeFor.float){
					if (e.left.typeFor.float){
						if(e.right.typeFor.float){
							switch (e.op){
								case '<':(e.left.interpret as Float) < (e.right.interpret as Float)
								case '>':(e.left.interpret as Float) > (e.right.interpret as Float)
								case '<=':(e.left.interpret as Float) <= (e.right.interpret as Float)
								case '>=':(e.left.interpret as Float) >= (e.right.interpret as Float)								
							}	
						}
						else {
							switch (e.op){
								case '<':(e.left.interpret as Float) < (e.right.interpret as Integer)
								case '>':(e.left.interpret as Float) > (e.right.interpret as Integer)
								case '<=':(e.left.interpret as Float) <= (e.right.interpret as Integer)
								case '>=':(e.left.interpret as Float) >= (e.right.interpret as Integer)								
							}
						}
					}
					else {
						switch (e.op){
							case '<':(e.left.interpret as Integer) < (e.right.interpret as Float)
							case '>':(e.left.interpret as Integer) > (e.right.interpret as Float)
							case '<=':(e.left.interpret as Integer) <= (e.right.interpret as Float)
							case '>=':(e.left.interpret as Integer) >= (e.right.interpret as Float)								
						}
					}
				}
				
				else{
					switch (e.op){
						case '<':(e.left.interpret as Integer) < (e.right.interpret as Integer)
						case '>':(e.left.interpret as Integer) > (e.right.interpret as Integer)
						case '<=':(e.left.interpret as Integer) <= (e.right.interpret as Integer)
						case '>=':(e.left.interpret as Integer) >= (e.right.interpret as Integer)								
					}
				}
			}//comparison
			
			

//			EventFeature:{
//		
//			}



		}//switch types
	}//interpret method
}