package org.project.droolsDSL.JavaUtils;

import java.util.HashMap;
import java.util.Map;

import org.project.droolsDSL.javaSession.ContextImplSession;
import org.project.droolsDSL.javaSession.Event;
import org.project.droolsDSL.javaSession.Fluent;
import org.project.droolsDSL.javaSession.conditions.Condition;

public class PrintMapOfMapOfMap {

	private Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> mapSession = 
			new HashMap<Event, Map<Condition, Map<Fluent, ContextImplSession>>>();
	
	public PrintMapOfMapOfMap(Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> map){
		this.mapSession=map;
	}

	@Override
	public String toString() {
		String result = " ";
		
		for(Event e: this.mapSession.keySet()){
			result += "\nEvent: " + e.toString();
			for (Condition cond : this.mapSession.get(e).keySet()){
				result += "\n\tCond = "+ cond;
				
				for(Fluent f: this.mapSession.get(e).get(cond).keySet()){
					result += "\n\t\tFluent = "+ f.getFluentName();
				}
			}
		}
		
		return result;
	}	
}
