package org.project.droolsDSL.javaSession;

import java.util.List;

public interface Event {
	public String getEventName();
	public void setEventName(String eventName);
	public void setEventFeatureList(List<String> eventFeatureList);
}
