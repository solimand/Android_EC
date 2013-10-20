package models;

//IMPORTs
import it.bragaglia.freckles.model.*;

public class MainModel_1382288867075_Time {

	public static void main (String[] args) {
		public List<Effect> effect_List_0= new ArrayList<Effect>();
			effect_List_0.clear();
		public List<Effect> effect_List_1= new ArrayList<Effect>();
			effect_List_1.clear();
		public List<Effect> effect_List_2= new ArrayList<Effect>();
			effect_List_2.clear();
		
		public Model model = new ModelImpl();
		
		//PRINT_MAPs
		
		//Class StateContext
		/*
		EventCompleted --> params:score, 
					LastUpdate: TO= org.project.droolsDSL.ddsl.impl.ExpressionImpl@16e0e993; IN=; IF=
					Performance: TO= org.project.droolsDSL.ddsl.impl.ExpressionImpl@2af3453c; IN=; IF=org.project.droolsDSL.ddsl.impl.ExpressionImpl@328210a2
		*/
		
		/*
		EventCompleted --> params:
					Message: TO= org.project.droolsDSL.ddsl.impl.ExpressionImpl@64822ee9; IN=; IF=org.project.droolsDSL.ddsl.impl.ExpressionImpl@712d7124
		*/
		
		/*
		EventCompleted --> params:
					Message: TO= org.project.droolsDSL.ddsl.impl.ExpressionImpl@462079c1; IN=; IF=org.project.droolsDSL.ddsl.impl.ExpressionImpl@40b7c67f
		*/
		
		
		
		// Statement 0 proceed...
		String paramsOfStatement_0[] = new String[1];
		paramsOfStatement_0[0] = new ParameterDescr("score");
			ExpressionDescr _eventCompleted_LastUpdate_0_ToValue_EventFeature = new ParameterDescr("score");
			
			Context _eventCompleted_LastUpdate_Context_0 = new ContextImpl(paramsOfStatement_0, _eventCompleted_LastUpdate_0_ToValue_EventFeature,  null);
			
			Effect _eventCompleted_LastUpdate_0 = new EffectImpl("LastUpdate", _eventCompleted_LastUpdate_Context_0);
				effect_List_0.add(_eventCompleted_LastUpdate_0);
			 
			ExpressionDescr _eventCompleted_Performance_0_ToValue_EventFeature = new ParameterDescr("score");
			
			ConditionDescr _eventCompleted_Performance_0_CondValue_Less =  new LessDescr(new ParameterDescr("score")
			,
			new NumberDescr(10000));
			
			Context _eventCompleted_Performance_Context_0 = new ContextImpl(paramsOfStatement_0, _eventCompleted_Performance_0_ToValue_EventFeature, _eventCompleted_Performance_0_CondValue_Less);
			
			Effect _eventCompleted_Performance_0 = new EffectImpl("Performance", _eventCompleted_Performance_Context_0);
				effect_List_0.add(_eventCompleted_Performance_0);
			 
		// Statement 0 Finish
		
		// Statement 1 proceed...
		String paramsOfStatement_1[] = new String[0];
			ExpressionDescr _eventCompleted_Message_1_ToValue_Int = new NumberDescr(1);
			
			ConditionDescr _eventCompleted_Message_1_CondValue_MoreEquals =  new MoreEqualsDescr(new SampleDescr("Performance")
			,
			new ParameterDescr("score")
			);
			
			Context _eventCompleted_Message_Context_1 = new ContextImpl(paramsOfStatement_1, _eventCompleted_Message_1_ToValue_Int, _eventCompleted_Message_1_CondValue_MoreEquals);
			
			Effect _eventCompleted_Message_1 = new EffectImpl("Message", _eventCompleted_Message_Context_1);
				effect_List_1.add(_eventCompleted_Message_1);
			 
		// Statement 1 Finish
		
		// Statement 2 proceed...
		String paramsOfStatement_2[] = new String[0];
			ExpressionDescr _eventCompleted_Message_2_ToValue_Int = new NumberDescr(2);
			
			ConditionDescr _eventCompleted_Message_2_CondValue_Less =  new LessDescr(new SampleDescr("Performance")
			,
			new ParameterDescr("score")
			);
			
			Context _eventCompleted_Message_Context_2 = new ContextImpl(paramsOfStatement_2, _eventCompleted_Message_2_ToValue_Int, _eventCompleted_Message_2_CondValue_Less);
			
			Effect _eventCompleted_Message_2 = new EffectImpl("Message", _eventCompleted_Message_Context_2);
				effect_List_2.add(_eventCompleted_Message_2);
			 
		// Statement 2 Finish

		// model.add("turnOn", effects);
		model.add("EventCompleted",effect_List_0);
		model.add("EventCompleted",effect_List_1);
		model.add("EventCompleted",effect_List_2);

		System.out.println("Done.");

	}
}
