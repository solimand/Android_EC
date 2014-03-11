package org.project.droolsDSL.javaSession.conditions;

import java.util.HashSet;
import java.util.Set;

public class ConditionImpl implements Condition {

    private boolean first;
    private Set<Condition> followers;
    private boolean value;

    public ConditionImpl() {
        this.first = true;
        this.followers = new HashSet<>();
        this.value = false;
        assert invariant() : "Illegal state in ExpressionImpl()";
    }
    
	@Override
	public void follow(Condition condition) {
		if (condition == null)
            throw new IllegalArgumentException(
                            "Illegal 'condition' argument in ConditionImpl.follow(Condition): "
                                            + condition);
	    followers.add(condition);
	    assert invariant() : "Illegal state in ConditionImpl.follow(Condition)";
	}

	@Override
	public boolean holds() {
		assert invariant() : "Illegal state in ConditionImpl.holds()";
        return value;
	}

	@Override
	public void update(Condition condition) {
		if (condition == null)
            throw new IllegalArgumentException(
                            "Illegal 'condition' argument in ConditionImpl.update(Condition): "
                                            + condition);
	    handle(condition.holds());
	    assert invariant() : "Illegal state in ConditionImpl.update(Condition)";
	}

	@Override
	public void handle(boolean value) {
		if (first || value != this.value) {
            this.value = value;
            first = false;
            for (Condition follower : followers)
                    follower.update(this);
	    }
	    assert invariant() : "Illegal 'value' argument in ConditionImpl.handle(boolean)";
	}
	
	
	private boolean invariant() {
        return (followers != null);
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (first ? 1231 : 1237);
		result = prime * result
				+ ((followers == null) ? 0 : followers.hashCode());
		result = prime * result + (value ? 1231 : 1237);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ConditionImpl other = (ConditionImpl) obj;
		if (first != other.first)
			return false;
		if (followers == null) {
			if (other.followers != null)
				return false;
		} else if (!followers.equals(other.followers))
			return false;
		if (value != other.value)
			return false;
		return true;
	}
}
