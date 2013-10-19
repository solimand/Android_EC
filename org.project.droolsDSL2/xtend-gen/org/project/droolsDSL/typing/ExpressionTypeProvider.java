package org.project.droolsDSL.typing;

import com.google.common.base.Objects;
import org.eclipse.xtext.xbase.lib.Functions.Function0;
import org.project.droolsDSL.ddsl.And;
import org.project.droolsDSL.ddsl.BoolConstant;
import org.project.droolsDSL.ddsl.Comparison;
import org.project.droolsDSL.ddsl.Equality;
import org.project.droolsDSL.ddsl.Expression;
import org.project.droolsDSL.ddsl.FloatConstant;
import org.project.droolsDSL.ddsl.IntConstant;
import org.project.droolsDSL.ddsl.Minus;
import org.project.droolsDSL.ddsl.Not;
import org.project.droolsDSL.ddsl.Or;
import org.project.droolsDSL.ddsl.Plus;
import org.project.droolsDSL.typing.BoolType;
import org.project.droolsDSL.typing.FloatType;
import org.project.droolsDSL.typing.IntType;
import org.project.droolsDSL.typing.TypeInterface;

@SuppressWarnings("all")
public class ExpressionTypeProvider {
  public final static IntType intType = new Function0<IntType>() {
    public IntType apply() {
      IntType _intType = new IntType();
      return _intType;
    }
  }.apply();
  
  public final static BoolType boolType = new Function0<BoolType>() {
    public BoolType apply() {
      BoolType _boolType = new BoolType();
      return _boolType;
    }
  }.apply();
  
  public final static FloatType floatType = new Function0<FloatType>() {
    public FloatType apply() {
      FloatType _floatType = new FloatType();
      return _floatType;
    }
  }.apply();
  
  public TypeInterface typeFor(final Expression e) {
    TypeInterface _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof BoolConstant) {
        final BoolConstant _boolConstant = (BoolConstant)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        final IntConstant _intConstant = (IntConstant)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof FloatConstant) {
        final FloatConstant _floatConstant = (FloatConstant)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.floatType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        final And _and = (And)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        final Or _or = (Or)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        final Comparison _comparison = (Comparison)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        final Equality _equality = (Equality)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        final Not _not = (Not)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        final Minus _minus = (Minus)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.floatType;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        final Plus _plus = (Plus)e;
        _matched=true;
        _switchResult = ExpressionTypeProvider.floatType;
      }
    }
    return _switchResult;
  }
  
  public boolean isInt(final TypeInterface type) {
    boolean _equals = Objects.equal(type, ExpressionTypeProvider.intType);
    return _equals;
  }
  
  public boolean isFloat(final TypeInterface type) {
    boolean _equals = Objects.equal(type, ExpressionTypeProvider.floatType);
    return _equals;
  }
  
  public boolean isBoolean(final TypeInterface type) {
    boolean _equals = Objects.equal(type, ExpressionTypeProvider.boolType);
    return _equals;
  }
}
