package org.project.droolsDSL.javaSession;

import java.util.Hashtable;
import java.util.Map;

import org.project.droolsDSL.javaSession.conditions.Condition;

public class SessionImpl implements SessionDescr {
	
	private Map<String, Event> events;
	private long startTime;
	private boolean startFlag;
	
	private Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> mapSession;
	
	
    public SessionImpl(Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> map) {
        this.events = new Hashtable<>();
        this.startTime = 0;
        this.mapSession = map;
        assert invariant() : "Illegal state in SessionImpl()";
    }
    
    public Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> getMapSession() {
		return this.mapSession;
	}

	public Event getEvent(String event) {
        if (event == null || (event = event.trim()).isEmpty())
            throw new IllegalArgumentException(
            		"Illegal 'event' argument in SessionImpl(String): " + event);
        Event result = events.get(event);
        if (result == null) {
//        	List<String> eventFeatureList = new ArrayList<String>();
//        	eventFeatureList.clear();        	
        	result = new EventImpl(event);
            events.put(event, result);
        }
        assert invariant() : "Illegal state in SessionImpl.getEvent(String)";
        return result;
    }
    
    public long getStartTime(){
    	if(this.startTime!=0) return this.startTime;
    	return -1000; //stopped session
    }
    
    public boolean getStartFlag(){
    	return this.startFlag;
    }
    
	@Override
	public void start() {
		this.startFlag=true;
		this.startTime = System.currentTimeMillis();		
	}

	@Override
	public void stop() {
		this.startFlag=false;
	}

	@Override
	public void clear() {
		if (getStartFlag()){
			this.startTime=0;
			this.events.clear();
			this.mapSession.clear();
		}		
	}

	private boolean invariant() {
        return (events != null);
	}
}
