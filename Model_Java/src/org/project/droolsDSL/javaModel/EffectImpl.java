package org.project.droolsDSL.javaModel;

public class EffectImpl implements EffectDescr {

    private String fluent;
    private ContextDescr context;
    
    public EffectImpl(String fluent, ContextDescr context) {
        if (fluent == null || (fluent = fluent.trim()).isEmpty())
                throw new IllegalArgumentException(
                                "Illegal 'fluent' argument in EffectImpl(String, Context): "
                                                + fluent);
        if (context == null)
                throw new IllegalArgumentException(
                                "Illegal 'context' argument in EffectImpl(String, Context): "
                                                + context);
        this.context = context;
        this.fluent = fluent;
        assert invariant() : "Illegal state in EffectImpl(String, Context)";
    }
    	
	@Override
	public ConditionDescr getCondition() {
		ConditionDescr result = context.getCondition();
        assert invariant() : "Illegal state in EffectImpl.getCondition()";
        return result;
	}

	@Override
	public ExpressionDescr getExpression() {
		ExpressionDescr result = context.getExpression();
        assert invariant() : "Illegal state in EffectImpl.getExpression()";
        return result;
	}

	@Override
	public String[] getParameters() {
		String[] result = context.getParameters();
        assert invariant() : "Illegal state in EffectImpl.getParameters()";
        return result;
	}

	@Override
	public ContextDescr getContext() {
		assert invariant() : "Illegal state in EffectImpl.getCoso()";
        return context;
	}

	@Override
	public String getFluent() {
		assert invariant() : "Illegal state in EffectImpl.getFluent()";
        return fluent;
	}

	
	private boolean invariant() {
        return (context != null && fluent != null && !fluent.isEmpty());
	}
	
}
