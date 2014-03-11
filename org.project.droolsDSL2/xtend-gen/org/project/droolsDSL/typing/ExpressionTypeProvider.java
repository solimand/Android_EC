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
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof IntConstant) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.intType;
      }
    }
    if (!_matched) {
      if (e instanceof FloatConstant) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.floatType;
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.boolType;
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        _switchResult = ExpressionTypeProvider.floatType;
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
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
