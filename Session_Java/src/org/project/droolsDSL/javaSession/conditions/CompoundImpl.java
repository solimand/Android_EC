package org.project.droolsDSL.javaSession.conditions;

import java.util.Collection;

public abstract class CompoundImpl extends ConditionImpl implements Compound {

    private int count;
    private int size;
    
    public CompoundImpl(Collection<Condition> conditions) {
        super();
        if (conditions == null)
                throw new IllegalArgumentException(
                                "Illegal 'conditions' argument in Compound(Collection<Condition>): "
                                                + conditions);
        this.count = 0;
        this.size = conditions.size();
        for (Condition condition : conditions)
                condition.follow(this);
    }
    
    @Override
    public void update(Condition condition) {
            if (condition == null)
                    throw new IllegalArgumentException(
                                    "Illegal 'condition' argument in Compound.update(Condition): "
                                                    + condition);
            if (condition.holds())
                    count += 1;
            else
                    count -= 1;
            handle(evaluate());
            assert invariant() : "Illegal state in Compound.update(Condition)";
    }

	@Override
	public int getCount() {
		assert invariant() : "Illegal state in Compound.getCount()";
        return count;
	}

	@Override
	public int getSize() {
		assert invariant() : "Illegal state in Compound.getSize()";
        return size;
	}

	private boolean invariant() {
        return (0 <= count && count <= size);
}
}
