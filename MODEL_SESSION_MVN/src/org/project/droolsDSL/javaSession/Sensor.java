package org.project.droolsDSL.javaSession;

import java.util.Map;

public interface Sensor {
	public void clear();
	public Map<String, Value> read();
	public void report();
	public void subscribe(Collector collector);
	public void unsubscribe(Collector collector);

}
