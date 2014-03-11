package org.project.droolsDSL.javaModel;

import java.util.Arrays;
import java.util.Hashtable;
import java.util.Map;

import org.project.droolsDSL.javaSession.SessionDescr;

public class ModelImpl implements ModelDescr {

    private Map<String, Map<String, ContextDescr>> statements;

    public ModelImpl() {
        this.statements = new Hashtable<>();
        assert invariant() : "Illegal state in Model()";
    }
    
	@Override
	public void add(String event, EffectDescr... effects) {
		 if (event == null || (event = event.trim()).isEmpty())
             throw new IllegalArgumentException(
                             "Illegal 'event' argument in ModelImpl.add(String, Effect...): "
                                             + event);
	     if (effects == null)
	             throw new IllegalArgumentException(
	                             "Illegal 'effects' argument in ModelImpl.add(String, Effect...): "
	                                             + effects);
	     if (effects.length > 0) {
             Map<String, ContextDescr> fluents = new Hashtable<>();
	    	 if (statements.get(event)==null){//new entry event 
	    		 for (EffectDescr effect : effects){
		         	fluents.put(effect.getFluent(), effect.getContext());
	    		 }
	             statements.put(event, fluents);
	    	 }
	    	 else{//update existing event
	    		for (EffectDescr effect : effects){
		         	statements.get(event).put(effect.getFluent(), effect.getContext());
		    	}
	    	 }
	    	 
	     }
	     assert invariant() : "Illegal state in ModelImpl.add(String, Effect...)";
	}

	@Override
	public void clear() {
		statements.clear();
        assert invariant() : "Illegal state in Model.clear()";
	}

	@Override
	public void remove(String event, String... fluents) {
		if (event == null || (event = event.trim()).isEmpty())
            throw new IllegalArgumentException(
                            "Illegal 'event' argument in ModelImpl.remove(String, String...): "
                                            + event);
	    if (fluents == null)
	            throw new IllegalArgumentException(
	                            "Illegal 'fluents' argument in ModelImpl.remove(String, String...): "
	                                            + fluents);
	    if (fluents.length > 0) {
	            Map<String, ContextDescr> cosos = statements.get(event);
	            if (cosos == null) {
	                    cosos = new Hashtable<>();
	                    statements.put(event, cosos);
	            }
	            for (String fluent : fluents)
	                    cosos.remove(fluent);
	    }
	    assert invariant() : "Illegal state in ModelImpl.remove(String, String...)";
	}

	
	@Override
    public SessionDescr getSession(FactorySessionDescr type) {
            if (type == null)
                    throw new IllegalArgumentException(
                                    "Illegal 'type' argument in ModelImpl.getSession(Type): "
                                                    + type);
            SessionDescr result = type.createSession(statements);
            assert invariant() : "Illegal state in ModelImpl.getSession(Type)";
            return result;
    }	
    
    @Override
    public String toString() {
    	StringBuilder result = new StringBuilder();
        String[] events = statements.keySet().toArray(new String[0]);
        Arrays.sort(events);
        for (String event : events) {
            Map<String, ContextDescr> effects = statements.get(event);
            String[] fluents = effects.keySet().toArray(new String[0]);
            Arrays.sort(fluents);
            for (String fluent : fluents) {
                result.append("on " + event);
                ContextDescr context = effects.get(fluent);
                String[] params = context.getParameters();
                if (params.length > 0) {
                    result.append("(" + params[0]);
                    for (int i = 1; i < params.length; i++)
                        result.append(", " + params[i]);
                    result.append(")");
                }
                result.append(" set " + fluent);
                result.append(" to " + context.getExpression());
                String condition = context.getCondition().toString();
                if (condition != null)
                    result.append(" if " + condition);
                result.append(";\n");
            }
        }
        assert invariant() : "Illegal state in ModelImpl.toString()";
        return result.toString();
	}
    
	
	private boolean invariant() {
        return (statements != null);
	}
}
