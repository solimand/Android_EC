package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Value;
import org.project.droolsDSL.javaSession.conditions.Relation;

public class Number extends ExpressionImpl implements Expression, Value{
	
    private double number;

    public Number(double number) {
        super();
        this.number = number;
        handle(this);
        assert invariant() : "Illegal state in Number(double)";
	}

	public double asDouble() {
        assert invariant() : "Illegal state in Number.asDouble()";
        return number;
	}

	private boolean invariant() {
        return (true);
	}
	
	@Override
	public int compareTo(Value o) {
        // TODO Auto-generated method stub
        return 0;
	}
	
	@Override
	public Value add(Value value) {
        // TODO Auto-generated method stub
        return null;
	}
	
	@Override
	public Value subtract(Value value) {
        // TODO Auto-generated method stub
        return null;
	}
	
	@Override
	public Value multiply(Value value) {
        // TODO Auto-generated method stub
        return null;
	}
	
	@Override
	public Value divide(Value value) {
        // TODO Auto-generated method stub
        return null;
	}

	@Override
	public void follow(Expression expression) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Value getValue() {
		return new Number(this.number);
	}

	@Override
	public void handle(Value value) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Expression expression) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void follow(Relation expression) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public double thisVal() {
		return this.number;
	}

}