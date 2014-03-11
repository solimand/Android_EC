package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaSession.expressions.Sample;

public interface Fluent {
	/**
	 * 	@param time at which to cut the tail of the fluent history
	 */
	public void flush(long time);

    public void follow(Sample sample);
    
    /**
	 * 	@return the value of the fluent history at the given time
	 */
    public Value getValue();
    public String getFluentName();
    public Value getValue(long time);
    public void notify(long time, Value value);

}
