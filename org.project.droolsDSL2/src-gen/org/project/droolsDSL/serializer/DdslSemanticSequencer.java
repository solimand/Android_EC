package org.project.droolsDSL.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.project.droolsDSL.ddsl.And;
import org.project.droolsDSL.ddsl.AtTimeIntConstant;
import org.project.droolsDSL.ddsl.AtTimePlusOrMin;
import org.project.droolsDSL.ddsl.BoolConstant;
import org.project.droolsDSL.ddsl.Comparison;
import org.project.droolsDSL.ddsl.DdslPackage;
import org.project.droolsDSL.ddsl.DroolsModel;
import org.project.droolsDSL.ddsl.Equality;
import org.project.droolsDSL.ddsl.Event;
import org.project.droolsDSL.ddsl.EventFeature;
import org.project.droolsDSL.ddsl.Expression;
import org.project.droolsDSL.ddsl.FloatConstant;
import org.project.droolsDSL.ddsl.Fluent;
import org.project.droolsDSL.ddsl.InExpr;
import org.project.droolsDSL.ddsl.InTimeIntConstant;
import org.project.droolsDSL.ddsl.InTimePlusOrMin;
import org.project.droolsDSL.ddsl.IntConstant;
import org.project.droolsDSL.ddsl.Minus;
import org.project.droolsDSL.ddsl.MulOrDiv;
import org.project.droolsDSL.ddsl.Not;
import org.project.droolsDSL.ddsl.Or;
import org.project.droolsDSL.ddsl.Plus;
import org.project.droolsDSL.ddsl.Reference;
import org.project.droolsDSL.ddsl.Statement;
import org.project.droolsDSL.services.DdslGrammarAccess;

@SuppressWarnings("all")
public class DdslSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private DdslGrammarAccess grammarAccess;
	
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == DdslPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case DdslPackage.AND:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_And(context, (And) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.AT_TIME_INT_CONSTANT:
				if(context == grammarAccess.getAtExprRule() ||
				   context == grammarAccess.getAtTimeAtomicRule() ||
				   context == grammarAccess.getAtTimeExpressionRule() ||
				   context == grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getAtTimePrimaryRule()) {
					sequence_AtTimeAtomic(context, (AtTimeIntConstant) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.AT_TIME_PLUS_OR_MIN:
				if(context == grammarAccess.getAtExprRule() ||
				   context == grammarAccess.getAtTimeExpressionRule() ||
				   context == grammarAccess.getAtTimeExpressionAccess().getAtTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getAtTimePrimaryRule()) {
					sequence_AtTimeExpression(context, (AtTimePlusOrMin) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.BOOL_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (BoolConstant) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.COMPARISON:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Comparison(context, (Comparison) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.DROOLS_MODEL:
				if(context == grammarAccess.getDroolsModelRule()) {
					sequence_DroolsModel(context, (DroolsModel) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.EQUALITY:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Equality(context, (Equality) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.EVENT:
				if(context == grammarAccess.getEventRule()) {
					sequence_Event(context, (Event) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.EVENT_FEATURE:
				if(context == grammarAccess.getEventFeatureRule() ||
				   context == grammarAccess.getReferenceTypeRule()) {
					sequence_EventFeature(context, (EventFeature) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.EXPRESSION:
				if(context == grammarAccess.getConditionRuleRule()) {
					sequence_ConditionRule(context, (Expression) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getToRuleRule()) {
					sequence_ToRule(context, (Expression) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.FLOAT_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (FloatConstant) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.FLUENT:
				if(context == grammarAccess.getFluentRule() ||
				   context == grammarAccess.getReferenceTypeRule()) {
					sequence_Fluent(context, (Fluent) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.IN_EXPR:
				if(context == grammarAccess.getInRuleRule()) {
					sequence_InRule(context, (InExpr) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.IN_TIME_INT_CONSTANT:
				if(context == grammarAccess.getInExprRule() ||
				   context == grammarAccess.getInTimeAtomicRule() ||
				   context == grammarAccess.getInTimeExpressionRule() ||
				   context == grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getInTimePrimaryRule()) {
					sequence_InTimeAtomic(context, (InTimeIntConstant) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.IN_TIME_PLUS_OR_MIN:
				if(context == grammarAccess.getInExprRule() ||
				   context == grammarAccess.getInTimeExpressionRule() ||
				   context == grammarAccess.getInTimeExpressionAccess().getInTimePlusOrMinLeftAction_1_0() ||
				   context == grammarAccess.getInTimePrimaryRule()) {
					sequence_InTimeExpression(context, (InTimePlusOrMin) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.INT_CONSTANT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (IntConstant) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.MINUS:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Minus) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.MUL_OR_DIV:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_MulOrDiv(context, (MulOrDiv) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.NOT:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Primary(context, (Not) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.OR:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Or(context, (Or) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.PLUS:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_PlusOrMinus(context, (Plus) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.REFERENCE:
				if(context == grammarAccess.getAndRule() ||
				   context == grammarAccess.getAndAccess().getAndLeftAction_1_0() ||
				   context == grammarAccess.getAtomicRule() ||
				   context == grammarAccess.getComparisonRule() ||
				   context == grammarAccess.getComparisonAccess().getComparisonLeftAction_1_0() ||
				   context == grammarAccess.getEqualityRule() ||
				   context == grammarAccess.getEqualityAccess().getEqualityLeftAction_1_0() ||
				   context == grammarAccess.getExpressionRule() ||
				   context == grammarAccess.getMulOrDivRule() ||
				   context == grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0() ||
				   context == grammarAccess.getOrRule() ||
				   context == grammarAccess.getOrAccess().getOrLeftAction_1_0() ||
				   context == grammarAccess.getPlusOrMinusRule() ||
				   context == grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0() ||
				   context == grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0() ||
				   context == grammarAccess.getPrimaryRule()) {
					sequence_Atomic(context, (Reference) semanticObject); 
					return; 
				}
				else break;
			case DdslPackage.STATEMENT:
				if(context == grammarAccess.getStatementRule()) {
					sequence_Statement(context, (Statement) semanticObject); 
					return; 
				}
				else break;
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     (left=And_And_1_0 right=Equality)
	 */
	protected void sequence_And(EObject context, And semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_AtTimeAtomic(EObject context, AtTimeIntConstant semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DdslPackage.Literals.AT_TIME_INT_CONSTANT__VALUE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdslPackage.Literals.AT_TIME_INT_CONSTANT__VALUE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAtTimeAtomicAccess().getValueINTTerminalRuleCall_1_0(), semanticObject.getValue());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (left=AtTimeExpression_AtTimePlusOrMin_1_0 (op='-' | op='+') right=AtTimePrimary)
	 */
	protected void sequence_AtTimeExpression(EObject context, AtTimePlusOrMin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (value='true' | value='false')
	 */
	protected void sequence_Atomic(EObject context, BoolConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=FLOAT
	 */
	protected void sequence_Atomic(EObject context, FloatConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_Atomic(EObject context, IntConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (ref=[ReferenceType|ID] fluentValueSample=AtTimePrimary?)
	 */
	protected void sequence_Atomic(EObject context, Reference semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Comparison_Comparison_1_0 (op='>=' | op='<=' | op='>' | op='<') right=PlusOrMinus)
	 */
	protected void sequence_Comparison(EObject context, Comparison semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     condition=Expression
	 */
	protected void sequence_ConditionRule(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     statements+=Statement*
	 */
	protected void sequence_DroolsModel(EObject context, DroolsModel semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Equality_Equality_1_0 (op='==' | op='!=') right=Comparison)
	 */
	protected void sequence_Equality(EObject context, Equality semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_EventFeature(EObject context, EventFeature semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DdslPackage.Literals.REFERENCE_TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdslPackage.Literals.REFERENCE_TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getEventFeatureAccess().getNameIDTerminalRuleCall_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (eventName=ID (param+=EventFeature param+=EventFeature*)?)
	 */
	protected void sequence_Event(EObject context, Event semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID timePart=InRule? valuePart=ToRule condPart=ConditionRule?)
	 */
	protected void sequence_Fluent(EObject context, Fluent semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     inTimeExpr=InTimeExpression
	 */
	protected void sequence_InRule(EObject context, InExpr semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, DdslPackage.Literals.IN_EXPR__IN_TIME_EXPR) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, DdslPackage.Literals.IN_EXPR__IN_TIME_EXPR));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInRuleAccess().getInTimeExprInTimeExpressionParserRuleCall_1_0(), semanticObject.getInTimeExpr());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     value=INT
	 */
	protected void sequence_InTimeAtomic(EObject context, InTimeIntConstant semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=InTimeExpression_InTimePlusOrMin_1_0 (op='-' | op='+') right=InTimePrimary)
	 */
	protected void sequence_InTimeExpression(EObject context, InTimePlusOrMin semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=MulOrDiv_MulOrDiv_1_0 (op='*' | op='/' | op='%' | op='^') right=Primary)
	 */
	protected void sequence_MulOrDiv(EObject context, MulOrDiv semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=Or_Or_1_0 right=And)
	 */
	protected void sequence_Or(EObject context, Or semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Minus_1_0_1_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Minus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (left=PlusOrMinus_Plus_1_0_0_0 right=MulOrDiv)
	 */
	protected void sequence_PlusOrMinus(EObject context, Plus semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=Primary
	 */
	protected void sequence_Primary(EObject context, Not semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (event=Event fluent+=Fluent fluent+=Fluent*)
	 */
	protected void sequence_Statement(EObject context, Statement semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     expression=PlusOrMinus
	 */
	protected void sequence_ToRule(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
