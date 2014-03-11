package org.project.droolsDSL.javaSession;

import org.project.droolsDSL.javaModel.conditions.AndDescr;
import org.project.droolsDSL.javaModel.conditions.CompoundDescr;
import org.project.droolsDSL.javaModel.conditions.DifferentDescr;
import org.project.droolsDSL.javaModel.conditions.LessDescr;
import org.project.droolsDSL.javaModel.conditions.LessEqualsDescr;
import org.project.droolsDSL.javaModel.conditions.MoreDescr;
import org.project.droolsDSL.javaModel.conditions.MoreEqualsDescr;
import org.project.droolsDSL.javaModel.conditions.NotDescr;
import org.project.droolsDSL.javaModel.conditions.NullCondition;
import org.project.droolsDSL.javaModel.conditions.OrDescr;
import org.project.droolsDSL.javaModel.conditions.RelationDescr;
import org.project.droolsDSL.javaModel.conditions.SameDescr;
import org.project.droolsDSL.javaModel.conditions.TrueCondition;
import org.project.droolsDSL.javaSession.conditions.ConditionImpl;

public interface ConditionVisitor {
	ConditionImpl visit(AndDescr andInstance);
	ConditionImpl visit(OrDescr orInstance);
	ConditionImpl visit(NotDescr notInstance);
	ConditionImpl visit(NullCondition nullConditionInstance);
	ConditionImpl visit(DifferentDescr differentInstance);
	ConditionImpl visit(LessDescr lessInstance);
	ConditionImpl visit(LessEqualsDescr lessEqualsInstance);
	ConditionImpl visit(MoreDescr moreInstance);
	ConditionImpl visit(MoreEqualsDescr moreEqualsInstance);
	ConditionImpl visit(TrueCondition trueInstance);
	
	ConditionImpl visit(SameDescr sameInstance);
	ConditionImpl visit(CompoundDescr compoundInstance);
	ConditionImpl visit(RelationDescr relationInstance);
}
