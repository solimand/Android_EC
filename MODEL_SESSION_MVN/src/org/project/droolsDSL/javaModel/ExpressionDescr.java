package org.project.droolsDSL.javaModel;

import org.project.droolsDSL.javaSession.ExpressionVisitor;
import org.project.droolsDSL.javaSession.expressions.ExpressionImpl;

public interface ExpressionDescr {
    public boolean validate(String[] parameters);
    
    public ExpressionImpl accept(ExpressionVisitor exprVisitor);
}
