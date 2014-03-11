package org.project.droolsDSL.javaSession;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class SensorImpl implements Sensor {

	private Set<Collector> collectors;

	public SensorImpl() {
		this.collectors = new HashSet<>();
		assert invariant() : "Illegal state in SensorImpl()";
	}
	private boolean invariant() {
		return (collectors != null);
	}
	
	@Override
	public void clear() {
		collectors.clear();
		assert invariant() : "Illegal state in SensorImpl.clear()";
	}

	@Override
	public Map<String, Value> read() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void report() {
		if (collectors.size() > 0) {
			Map<String, Value> parameters = read();
			for (Collector collector : collectors)
				collector.update(this, parameters);
		}
		assert invariant() : "Illegal state in SensorImpl.report()";
	}

	@Override
	public void subscribe(Collector collector) {
		if (collector == null)
			throw new IllegalArgumentException(
					"Illegal 'collector' argument in SensorImpl.subscribe(Collector): "
							+ collector);
		collectors.add(collector);
		assert invariant() : "Illegal state in SensotImpl.subscribe(Collector)";
	}

	@Override
	public void unsubscribe(Collector collector) {
		if (collector == null)
			throw new IllegalArgumentException(
					"Illegal 'collector' argument in SensorImpl.unsubscribe(Collector): "
							+ collector);
		collectors.remove(collector);
		assert invariant() : "Illegal state in SensotImpl.unsubscribe(Collector)";

	}

}
