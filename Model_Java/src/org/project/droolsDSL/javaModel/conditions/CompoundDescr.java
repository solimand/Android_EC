package org.project.droolsDSL.javaModel.conditions;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.project.droolsDSL.javaModel.ConditionDescr;

public abstract class CompoundDescr implements ConditionDescr {

	private List<ConditionDescr> conditions;

    public CompoundDescr() {
            this.conditions = new ArrayList<>();
            assert invariant() : "Illegal state in CompoundDescr()";
    }

    private boolean invariant() {
            return (conditions != null);
    }

    public Iterator<ConditionDescr> iterator() {
            Iterator<ConditionDescr> result = conditions.iterator();
            assert invariant() : "Illegal state in CompoundDescr.iterator()";
            return result;
    }

    public void clear() {
            conditions.clear();
            assert invariant() : "Illegal state in CompoundDescr.clear()";
    }

    public void add(ConditionDescr condition) {
            if (condition == null)
                    throw new IllegalArgumentException(
                                    "Illegal 'condition' argument in CompoundDescr.add(ConditionDescr): "
                                                    + condition);
            conditions.add(condition);
            assert invariant() : "Illegal state in CompoundDescr.add(ConditionDescr)";
    }

    public void remove(ConditionDescr condition) {
            if (condition == null)
                    throw new IllegalArgumentException(
                                    "Illegal 'condition' argument in CompoundDescr.remove(ConditionDescr): "
                                                    + condition);
            conditions.remove(condition);
            assert invariant() : "Illegal state in CompoundDescr.remove(ConditionDescr)";
    }

    public int size() {
            int result = conditions.size();
            assert invariant() : "Illegal state in CompoundDescr.size()";
            return result;
    }

    @Override
    public boolean validate(String[] parameters) {
            if (parameters != null)
                    throw new IllegalArgumentException(
                                    "Illegal 'parameters' argument in CompoundDescr.validate(String[]): "
                                                    + parameters);
            boolean result = false;
            for (int i = 0; !result && i < conditions.size(); i++)
                    result = conditions.get(i).validate(parameters);
            assert invariant() : "Illegal state in CompoundDescr.validate(String[])";
            return false;
    }

    @Override
    public abstract String toString();

}
