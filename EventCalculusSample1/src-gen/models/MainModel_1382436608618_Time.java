package models;

//IMPORTs
import it.bragaglia.freckles.model.*;

public class MainModel_1382436608618_Time {

	public static void main (String[] args) {
		public List<Effect> effect_List_0= new ArrayList<Effect>();
			effect_List_0.clear();
		public List<Effect> effect_List_1= new ArrayList<Effect>();
			effect_List_1.clear();

		public Model model = new ModelImpl();

		// Parameters MAP 
		
		private static Map<Int, ParameterDescr[]> allEventParams = new HashMap<Int, ParameterDescr[]>();
		 
		[Ljava.lang.String;@7dfa35d0
		ParameterDescr paramsOfStatement_0[] = new ParameterDescr[3];
		paramsOfStatement_0[0] = new ParameterDescr("x");
		paramsOfStatement_0[1] = new ParameterDescr("y");
		paramsOfStatement_0[2] = new ParameterDescr("z");
		allEventParams.put(0, paramsOfStatement_0);
		 
		[Ljava.lang.String;@35e32b4d
		ParameterDescr paramsOfStatement_1[] = new ParameterDescr[2];
		paramsOfStatement_1[0] = new ParameterDescr("foo");
		paramsOfStatement_1[1] = new ParameterDescr("bar");
		allEventParams.put(1, paramsOfStatement_1);
		 
		
		// Statement 0 proceed...
			ExpressionDescr _e1_F1_0_ToValue_EventFeature = paramsOfStatement_0[1];
			ConditionDescr _e1_F1_0_CondValue_Less =  new LessDescr(new SampleDescr("F1")
			,
			new TimesDescr(new NumberDescr(3),
			paramsOfStatement_0[2]
			)
			);
			
			Context _e1_F1_Context_0 = new ContextImpl(paramsOfStatement_0, _e1_F1_0_ToValue_EventFeature, _e1_F1_0_CondValue_Less);
			
			Effect _e1_F1_0 = new EffectImpl("F1", _e1_F1_Context_0);
				effect_List_0.add(_e1_F1_0);
			 
		// Statement 0 Finish
		
		// Statement 1 proceed...
			ExpressionDescr _e2_F2_1_ToValue_Int = new NumberDescr(2);
			
			Context _e2_F2_Context_1 = new ContextImpl(paramsOfStatement_1, _e2_F2_1_ToValue_Int,  null);
			
			Effect _e2_F2_1 = new EffectImpl("F2", _e2_F2_Context_1);
				effect_List_1.add(_e2_F2_1);
			 
		// Statement 1 Finish

		// model.add("EventName", effects);
		model.add("E1",effect_List_0);
		model.add("E2",effect_List_1);

		System.out.println("Done.");

	}
}
