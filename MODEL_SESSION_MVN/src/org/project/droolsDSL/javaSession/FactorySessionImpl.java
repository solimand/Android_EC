package org.project.droolsDSL.javaSession;

import java.util.HashMap;
import java.util.Map;

import org.project.droolsDSL.javaModel.ContextDescr;
import org.project.droolsDSL.javaModel.FactorySessionDescr;
import org.project.droolsDSL.javaSession.conditions.Condition;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;
import org.project.droolsDSL.javaSession.expressions.ExpressionImpl;

public class FactorySessionImpl implements FactorySessionDescr {

	@Override
	public SessionDescr createSession(Map<String, Map<String, ContextDescr>> statements) {
		if (statements == null)
            throw new IllegalArgumentException(
                            "Illegal 'statements' argument in createSession: " + statements);
		
		Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> mapSession = 
				new HashMap<Event, Map<Condition, Map<Fluent, ContextImplSession>>>();
		
		ExpressionVisitor expressionVisitor = new ExpressionVisitorImpl();
		ConditionVisitor conditionVisitor = new ConditionVisitorImpl();

		//getting Cond--->Fluents--->Context MAP		
	    for (String event : statements.keySet()) {
	    	
			Map<Condition, Map<Fluent, ContextImplSession>> mapConditionFluentS_Context = 
					new HashMap<Condition, Map<Fluent, ContextImplSession>>();
	    	for(String fluentName: statements.get(event).keySet()){
	    		Map<Fluent, Condition> mapFluCond= 
						new HashMap<Fluent, Condition>();
	    		Map<Fluent, ContextImplSession> mapFluentContext = 
						new HashMap<Fluent, ContextImplSession>();
	    		
	    		Fluent f = new FluentImpl(fluentName);
	    		ContextDescr contextModel= statements.get(event).get(fluentName);

	    		ExpressionImpl fluentExpr = contextModel.getExpression().accept(expressionVisitor);
	    		ConditionImpl fluentCondition = contextModel.getCondition().accept(conditionVisitor);
	    		long time = 0;
	    		
	    		mapFluCond.put(f, fluentCondition);
	    		// I got a Map Fluent--->Condition for a single statement
	    		mapFluentContext.put(f, new ContextImplSession(contextModel.getParameters(),fluentExpr,time));
	    		// I got a Map Fluent--->Context for a single statement
	    		if(!mapConditionFluentS_Context.containsKey(fluentCondition)){
	    			//new Condition for same Event
	    			mapConditionFluentS_Context.put(fluentCondition, mapFluentContext);
	    		}
	    		else{
	    			//existent Condition for same Event 
	    			//TODO if same Fluents...
	    			mapConditionFluentS_Context.get(fluentCondition).putAll(mapFluentContext);
	    		}
	    		// I got a Map Condition--->Fluents--->Context for a single statement

	    		//clean Condition from not related Fluents
		    	for(Map.Entry<Condition, Map<Fluent,ContextImplSession>> entryCondFluContxt:
		    				mapConditionFluentS_Context.entrySet()){
		    		if(entryCondFluContxt.getKey() != mapFluCond.get(new FluentImpl(fluentName))){
		    			mapConditionFluentS_Context.get(entryCondFluContxt.getKey()).
		    				remove(new FluentImpl(fluentName));
		    		}
		    	}
	    	}
	    	
	    	Event e = new EventImpl(event);
			mapSession.put(e, mapConditionFluentS_Context);
		    
	    }
	    assert invariant() : "Illegal state in FactorySessionImpl.createSession(Map<String, Map<String, Context>>)";
	    SessionDescr session = new SessionImpl(mapSession);	    
	    return session;
		
	}
	
	private boolean invariant() {
        return (true);
	}
	
}