package org.project.droolsDSL.javaSession;

import java.util.Map;

import org.project.droolsDSL.javaSession.conditions.Condition;

public interface SessionDescr {
	public void start();
    public void stop();
    public void clear();
    public Event getEvent(String eventName);
    public Map<Event, Map<Condition, Map<Fluent, ContextImplSession>>> getMapSession();
}
