package org.project.droolsDSL.javaSession;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeMap;

import org.project.droolsDSL.javaSession.expressions.Sample;

public class FluentImpl implements Fluent {

	private String fluentName;
	private Set<Sample> followers;
    private TreeMap<Long, Value> history;
    private Value value;

    public FluentImpl(String tag) {
    	this.fluentName=tag;
        this.history = new TreeMap<>();
        this.value = null;
        
        this.followers=new HashSet<>(); 
        assert invariant() : "Illegal state in FluentImpl()";
    }

    @Override
    public void flush(long time) {
        Long pivot = history.floorKey(time);
        if (pivot != null) {
            value = history.get(pivot);
            history = (TreeMap<Long, Value>) history.tailMap(pivot, false);
        }
        assert invariant() : "Illegal state in FluentImpl.flush(long)";
    }

    @Override
    public void follow(Sample sample) {
        if (sample == null)
        	throw new IllegalArgumentException(
            	"Illegal 'sample' argument in FluentImpl.register(Sample): "
                	+ sample);
        followers.add(sample);
        assert invariant() : "Illegal state in FluentImpl.register(Sample)";
    }
    @Override
    public String getFluentName(){
    	return this.fluentName;
    }
    
    @Override
    public Value getValue() {
        Value result = value;
        if (!history.isEmpty())
        	result = history.get(history.lastKey());
        assert invariant() : "Illegal state in FluentImpl.getValue()";
        return result;
    }

    @Override
    public Value getValue(long time) {
        Long pivot = history.floorKey(time);
        Value result = pivot == null ? value : history.get(pivot);
        assert invariant() : "Illegal state in FluentImpl.getValue(long)";
        return result;
    }

    private boolean invariant() {
    	return (history != null && followers != null);
    }

    @Override
    public void notify(long time, Value value) {
        // NOTE: The value can be null!
        // NOTE: When add all the 'ticks' (new notifications may change MVIs)
        // NOTE: A second tick at the same time overwrites previous value (acceptable)
//        Value current = getValue(time);
        history.put(time, value);
//        if (!current.equals(value))
            for (Sample follower : followers)
            	follower.update(this);
        assert invariant() : "Illegal state in FluentImpl.notify(long, Value)";
    }
}
