package org.project.droolsDSL.javaSession;

public interface Value extends Comparable<Value> {

	public Value add(Value value);

	public Value subtract(Value value);

	public Value multiply(Value value);

	public Value divide(Value value);
	
	public double thisVal();

//	public Value module(Value value);
	
}
