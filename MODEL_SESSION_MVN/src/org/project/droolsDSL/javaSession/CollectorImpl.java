package org.project.droolsDSL.javaSession;

import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class CollectorImpl implements Collector {

	private Narrative narrative;
	private Map<Sensor, Set<Event>> sensors;

	public CollectorImpl(Narrative narrative) {
		if (narrative == null)
			throw new IllegalArgumentException(
					"Illegal 'narrative' argument in CollectorImpl(Narrative): "
							+ narrative);
		this.narrative = narrative;
		this.sensors = new Hashtable<>();
		assert invariant() : "Illegal state in CollectorImpl(Narrative)";
	}
	private boolean invariant() {
		return (narrative != null && sensors != null);
	}
	
	
	@Override
	public void update(Sensor sensor, Map<String, Value> parameters) {
		if (sensor == null)
			throw new IllegalArgumentException(
					"Illegal 'sensor' argument in CollectorImpl.update(Sensor, Map<String, Value>): "
							+ sensor);
//		if (parameters == null)
//			throw new IllegalArgumentException(
//					"Illegal 'parameters' argument in CollectorImpl.update(Sensor, Map<String, Value>): "
//							+ parameters);
			
		Set<Event> events = sensors.get(sensor);
		if (events != null) {
			long time = System.currentTimeMillis();
			for (Event event : events)
				narrative.update(event, time, parameters);
		}
		assert invariant() : "Illegal state in CollectorImpl.update(Sensor, Map<String, Value>)";
	}

	@Override
	public void subscribe(Sensor sensor, Event event) {
		if (sensor == null)
			throw new IllegalArgumentException(
					"Illegal 'sensor' argument in CollectorImpl.subscribe(Sensor, Event): "
							+ sensor);
		if (event == null)
			throw new IllegalArgumentException(
					"Illegal 'event' argument in CollectorImpl.subscribe(Sensor, Event): "
							+ event);
		Set<Event> events = sensors.get(sensor);
		if (events == null) {
			events = new HashSet<>();
			sensors.put(sensor, events);
		}
		events.add(event);
		sensor.subscribe(this);
		assert invariant() : "Illegal state in CollectorImpl.subscribe(Sensor, Event)";
	}

	@Override
	public void unsubscribe(Sensor sensor, Event event) {
		if (sensor == null)
			throw new IllegalArgumentException(
					"Illegal 'sensor' argument in CollectorImpl.unsubscribe(Sensor, Event): "
							+ sensor);
		if (event == null)
			throw new IllegalArgumentException(
					"Illegal 'event' argument in CollectorImpl.unsubscribe(Sensor, Event): "
							+ event);
		Set<Event> events = sensors.get(sensor);
		if (events != null && events.remove(event))
			sensor.unsubscribe(this);
		assert invariant() : "Illegal state in ColloectorImpl.unsubscribe(Sensor, Event)";
	}

}
