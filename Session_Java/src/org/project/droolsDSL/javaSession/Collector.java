package org.project.droolsDSL.javaSession;

import java.util.Map;

public interface Collector {
	public void update(Sensor sensor, Map<String, Value> parameters);
	public void subscribe(Sensor sensor, Event event);
	public void unsubscribe(Sensor sensor, Event event);
}
