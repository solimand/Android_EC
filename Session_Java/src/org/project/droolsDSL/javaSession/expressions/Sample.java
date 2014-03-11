package org.project.droolsDSL.javaSession.expressions;

import org.project.droolsDSL.javaSession.Fluent;

public class Sample extends ExpressionImpl implements Expression {
	
	public Sample(Fluent fluent) {
         super();
         if (fluent == null)
        	 throw new IllegalArgumentException(
             	"Illegal 'fluent' argument in Sample(Fluent): " + fluent);
         fluent.follow(this);
         assert invariant() : "Illegal state in Sample(Fluent)";
	}
	
	public void update(Fluent fluent) {
    	if (fluent == null)
                throw new IllegalArgumentException(
                                "Illegal 'fluent' argument in Sample.update(Fluent): "
                                                + fluent);
        handle(fluent.getValue());
        assert invariant() : "Illegal state in Sample.update(Fluent)";
	}
	
	private boolean invariant() {
        return (true);
	}

}

