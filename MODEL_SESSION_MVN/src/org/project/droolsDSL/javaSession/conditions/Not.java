package org.project.droolsDSL.javaSession.conditions;

public class Not extends ConditionImpl implements Condition {

	public Not(Condition condition) {
        super();
        if (condition == null)
                throw new IllegalArgumentException(
                                "Illegal 'condition' argument in Not(Condition):  "
                                                + condition);
        condition.follow(this);
        assert invariant() : "Illegal state in not(Condition)";
	}

	@Override
	public void update(Condition condition) {
        if (condition == null)
                throw new IllegalArgumentException(
                                "Illegal 'condition' argument in Not.update(Condition): "
                                                + condition);
        handle(!condition.holds());
        assert invariant() : "Illegal state in Not.update(Condition)";
	}
	
	private boolean invariant() {
        return (true);
	}
}
