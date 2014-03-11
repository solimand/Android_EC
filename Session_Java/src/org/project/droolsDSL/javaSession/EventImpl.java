package org.project.droolsDSL.javaSession;

import java.util.ArrayList;
import java.util.List;

public class EventImpl implements Event {

	private String eventName;
    private List<String> eventFeatureList;
    
	public EventImpl(String eventName, List<String> eventFeatureList) {
		super();
		this.eventName = eventName;
		this.eventFeatureList = eventFeatureList;
	}
	
	public EventImpl(String eventName) {
		super();
		this.eventName = eventName;
		this.eventFeatureList = new ArrayList<String>();
	}	
	
	public EventImpl() {
		super();
		this.eventName = "";
		this.eventFeatureList = new ArrayList<String>();
	}
    
	public String getEventName() {
		return eventName;
	}
	public void setEventName(String eventName) {
		this.eventName = eventName;
	}
	
	public List<String> getEventFeatureList() {
		return eventFeatureList;
	}
	public void setEventFeatureList(List<String> eventFeatureList) {
		this.eventFeatureList = eventFeatureList;
	}
    
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((eventFeatureList == null) ? 0 : eventFeatureList.hashCode());
		result = prime * result
				+ ((eventName == null) ? 0 : eventName.hashCode());
		return result;
	}
    
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EventImpl other = (EventImpl) obj;
		if (eventFeatureList == null) {
			if (other.eventFeatureList != null)
				return false;
		} else if (!eventFeatureList.equals(other.eventFeatureList))
			return false;
		if (eventName == null) {
			if (other.eventName != null)
				return false;
		} else if (!eventName.equals(other.eventName))
			return false;
		return true;
	}
	
	@Override
	public String toString() {
		return "EventDescr [eventName=" + eventName + ", eventFeatureList="
				+ eventFeatureList + "]";
	}
	
}
