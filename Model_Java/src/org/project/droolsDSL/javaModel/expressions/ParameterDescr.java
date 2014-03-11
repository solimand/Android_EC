package org.project.droolsDSL.javaModel.expressions;

import org.project.droolsDSL.javaModel.ExpressionDescr;
import org.project.droolsDSL.javaSession.ExpressionVisitor;
import org.project.droolsDSL.javaSession.expressions.OperationImpl;

public class ParameterDescr implements ExpressionDescr {

	private String name;

    public ParameterDescr(String name) {
            if (name == null || (name = name.trim()).isEmpty())
                    throw new IllegalArgumentException(
                                    "Illegal 'name' argument in Parameter(String): " + name);
            this.name = name;
            assert invariant() : "Illegal state in Parameter(String)";
    }

    public String getName() {
            assert invariant() : "Illegal state in Parameter.getName()";
            return name;
    }

    @Override
    public boolean validate(String[] parameters) {
            if (parameters == null)
                    throw new IllegalArgumentException(
                                    "Illegal 'parameters' argument in Parameter.validate(String[]): "
                                                    + parameters);
            boolean result = false;
            for (int i = 0; !result && i < parameters.length; i++)
                    result = name.equals(parameters[i]);
            assert invariant() : "Illegal state in Parameter.validate()";
            return result;
    }

    @Override
    public String toString() {
            assert invariant() : "Illegal state in Paremeter.toString()";
            return name;
    }
    
    private boolean invariant() {
        return (name != null && !name.isEmpty());
}

	@Override
	public OperationImpl accept(ExpressionVisitor exprVisitor) {
		return exprVisitor.visit(this);
	}

}
