package org.project.droolsDSL.javaSession;

import java.util.HashMap;
import java.util.Map;

public class NarrativeImpl implements Narrative {

	private Map<Event, EntryValue> narrativeSession;
	
	public NarrativeImpl(){
		this.narrativeSession = new HashMap<Event, EntryValue>();
	}
	
	@Override
	public void update(Event event, long time, Map<String, Value> parameters) {
		this.narrativeSession.put(event, new EntryValue(time, parameters));
	}

	class EntryValue{
	
		long time;
		Map <String, Value> parameters;
		
		EntryValue(long time, Map<String, Value> parameters){
			this.time=time;
			if (parameters!=null)
				this.parameters=parameters;
		}
	}
}
