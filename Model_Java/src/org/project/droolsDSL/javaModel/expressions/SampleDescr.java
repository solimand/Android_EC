package org.project.droolsDSL.javaModel.expressions;

import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaSession.ExpressionVisitor;
import org.project.droolsDSL.javaSession.expressions.Sample;

public class SampleDescr implements ExpressionDescr {

	private String name;

    public SampleDescr(String name) {
        if (name == null || (name = name.trim()).isEmpty())
                throw new IllegalArgumentException(
                                "Illegal 'name' argument in SampleDescr(String): " + name);
        this.name = name;
        assert invariant() : "Illegal state in SampleDescr(String)";
    }
    
    public String getName() {
        assert invariant() : "Illegal state in SampleDescr.getName()";
        return name;
    }

    @Override
    public boolean validate(String[] parameters) {
        if (parameters == null)
        	throw new IllegalArgumentException(
        			"Illegal 'parameters' argument in SampleDescr.validate(String[]): "
        					+ parameters);
        assert invariant() : "Illegal state in SampleDescr.validate()";
        return true;
    }

    @Override
    public String toString() {
        assert invariant() : "Illegal state in SampleDescr.toString()";
        return name;
    }
    
    private boolean invariant() {
        return (name != null && !name.isEmpty());
    }

	@Override
	public Sample accept(ExpressionVisitor exprVisitor) {
		return exprVisitor.visit(this);
	}

}
