package org.project.droolsDSL.javaModel.expressions;

import java.util.Hashtable;
import java.util.Map;

import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaSession.ExpressionVisitor;
import org.project.droolsDSL.javaSession.expressions.Expression;
import org.project.droolsDSL.javaSession.expressions.ExpressionImpl;

public class NumberDescr implements ExpressionDescr {
	
    private static Map<Double, NumberDescr> numbers = new Hashtable<>();
    private double value;
    /**
     * 
     * Constructor Types: boolean, short, long, int, float, double, char, byte
     * 
     */
    public NumberDescr(boolean value) {
        this.value = value ? 1.0 : 0.0;
        assert invariant() : "Illegal state in Number(Value)";
    }
    public NumberDescr(short value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
    }
    public NumberDescr(long value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
    }
    public NumberDescr(int value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
    }
    public NumberDescr(double value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
    }
	public NumberDescr(float value) {
		this.value = value;
	    assert invariant() : "Illegal state in Number(Value)";
	}
	public NumberDescr(byte value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
	}
	public NumberDescr(char value) {
        this.value = value;
        assert invariant() : "Illegal state in Number(Value)";
	}
	
    public double getValue() {
        assert invariant() : "Illegal state in Number.getValue()";
        return value;
    }
    
	@Override
	public boolean validate(String[] parameters) {
		if (parameters == null)
            throw new IllegalArgumentException(
            		"Illegal 'paramaters' argument in Number.validate(String[]): "
            				+ parameters);
	    assert invariant() : "Illegal state in Number.validate(String[])";
	    return true;
	}
	
	private boolean invariant() {
        return (numbers != null);
	}
	@Override
	public ExpressionImpl accept(ExpressionVisitor exprVisitor) {
		Expression exprRet = new ExpressionImpl();
		exprRet.update(exprVisitor.visit(this));
//		exprRet.handle();
		return (ExpressionImpl) exprRet;
	}
}
