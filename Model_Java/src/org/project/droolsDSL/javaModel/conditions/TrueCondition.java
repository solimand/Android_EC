package org.project.droolsDSL.javaModel.conditions;

import org.project.droolsDSL.javaModel.ConditionDescr;
import org.project.droolsDSL.javaSession.ConditionVisitor;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public class TrueCondition implements ConditionDescr {

    private ConditionDescr condition;

	public TrueCondition(ConditionDescr condition) {
	        if (condition == null)
	                throw new IllegalArgumentException(
	                                "Illegal 'condition' argument in TrueCondition(ConditionDescr): "
	                                                + condition);
	        this.condition = condition;
	        assert invariant() : "Illegal state in TrueCondition(ConditionDescr)";
	    }
	    
	    public ConditionDescr getCondition() {
	        assert invariant() : "Illegal state in TrueCondition.getCondition()";
	        return condition;
	    }
	    
		@Override
		public boolean validate(String[] parameters) {
			if (parameters == null)
	            throw new IllegalArgumentException(
	                            "Illegal 'parameters' argument in TrueCondition.validate(String[]): "
	                                            + parameters);
/*----->*/  boolean result = true;			//condition.validate(parameters);
		    assert invariant() : "Illegal state in TrueCondition.validate(String[])";
		    return result;
		}

		@Override
	    public String toString() {
	            String result = "!" + condition;
	            assert invariant() : "Illegal state in TrueCondition.toString()";
	            return result;
	    }
		
		private boolean invariant() {
	        return (condition != null);
		}

		@Override
		public ConditionImpl accept(ConditionVisitor condVisitor) {
			return condVisitor.visit(this);
		}
}
