package org.project.droolsDSL.interpreter;

import com.google.common.base.Objects;
import com.google.inject.Inject;
import org.eclipse.xtext.xbase.lib.Extension;
import org.project.droolsDSL.ddsl.And;
import org.project.droolsDSL.ddsl.BoolConstant;
import org.project.droolsDSL.ddsl.Comparison;
import org.project.droolsDSL.ddsl.Equality;
import org.project.droolsDSL.ddsl.Expression;
import org.project.droolsDSL.ddsl.FloatConstant;
import org.project.droolsDSL.ddsl.IntConstant;
import org.project.droolsDSL.ddsl.Minus;
import org.project.droolsDSL.ddsl.MulOrDiv;
import org.project.droolsDSL.ddsl.Not;
import org.project.droolsDSL.ddsl.Or;
import org.project.droolsDSL.ddsl.Plus;
import org.project.droolsDSL.typing.ExpressionTypeProvider;
import org.project.droolsDSL.typing.TypeInterface;

@SuppressWarnings("all")
public class ExpressionInterpreter {
  @Inject
  @Extension
  private ExpressionTypeProvider _expressionTypeProvider;
  
  public Object interpret(final Expression e) {
    Object _switchResult = null;
    boolean _matched = false;
    if (!_matched) {
      if (e instanceof IntConstant) {
        final IntConstant _intConstant = (IntConstant)e;
        _matched=true;
        int _value = _intConstant.getValue();
        _switchResult = Integer.valueOf(_value);
      }
    }
    if (!_matched) {
      if (e instanceof FloatConstant) {
        final FloatConstant _floatConstant = (FloatConstant)e;
        _matched=true;
        float _value = _floatConstant.getValue();
        _switchResult = Float.valueOf(_value);
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        final BoolConstant _boolConstant = (BoolConstant)e;
        _matched=true;
        String _value = _boolConstant.getValue();
        boolean _parseBoolean = Boolean.parseBoolean(_value);
        _switchResult = Boolean.valueOf(_parseBoolean);
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        final Not _not = (Not)e;
        _matched=true;
        Expression _expression = _not.getExpression();
        Object _interpret = this.interpret(_expression);
        boolean _not_1 = (!(((Boolean) _interpret)).booleanValue());
        _switchResult = Boolean.valueOf(_not_1);
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        final MulOrDiv _mulOrDiv = (MulOrDiv)e;
        _matched=true;
        Number _xifexpression = null;
        boolean _or = false;
        Expression _left = _mulOrDiv.getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = _mulOrDiv.getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          Float _xifexpression_1 = null;
          boolean _and = false;
          Expression _left_2 = _mulOrDiv.getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (!_isFloat_2) {
            _and = false;
          } else {
            Expression _right = _mulOrDiv.getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isInt = this._expressionTypeProvider.isInt(_typeFor_3);
            _and = (_isFloat_2 && _isInt);
          }
          if (_and) {
            Float _xblockexpression = null;
            {
              Expression _left_3 = _mulOrDiv.getLeft();
              Object _interpret = this.interpret(_left_3);
              final Float left = ((Float) _interpret);
              Expression _right_1 = _mulOrDiv.getRight();
              Object _interpret_1 = this.interpret(_right_1);
              final Integer right = ((Integer) _interpret_1);
              Float _xifexpression_2 = null;
              String _op = _mulOrDiv.getOp();
              boolean _equals = Objects.equal(_op, "*");
              if (_equals) {
                float _multiply = ((left).floatValue() * (right).intValue());
                _xifexpression_2 = Float.valueOf(_multiply);
              } else {
                Float _xifexpression_3 = null;
                String _op_1 = _mulOrDiv.getOp();
                boolean _equals_1 = Objects.equal(_op_1, "/");
                if (_equals_1) {
                  float _divide = ((left).floatValue() / (right).intValue());
                  _xifexpression_3 = Float.valueOf(_divide);
                } else {
                  Float _xifexpression_4 = null;
                  String _op_2 = _mulOrDiv.getOp();
                  boolean _equals_2 = Objects.equal(_op_2, "%");
                  if (_equals_2) {
                    float _modulo = ((left).floatValue() % (right).intValue());
                    _xifexpression_4 = Float.valueOf(_modulo);
                  }
                  _xifexpression_3 = _xifexpression_4;
                }
                _xifexpression_2 = _xifexpression_3;
              }
              _xblockexpression = (_xifexpression_2);
            }
            _xifexpression_1 = _xblockexpression;
          } else {
            Float _xifexpression_2 = null;
            boolean _and_1 = false;
            Expression _left_3 = _mulOrDiv.getLeft();
            TypeInterface _typeFor_4 = this._expressionTypeProvider.typeFor(_left_3);
            boolean _isInt_1 = this._expressionTypeProvider.isInt(_typeFor_4);
            if (!_isInt_1) {
              _and_1 = false;
            } else {
              Expression _right_1 = _mulOrDiv.getRight();
              TypeInterface _typeFor_5 = this._expressionTypeProvider.typeFor(_right_1);
              boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_5);
              _and_1 = (_isInt_1 && _isFloat_3);
            }
            if (_and_1) {
              Float _xblockexpression_1 = null;
              {
                Expression _left_4 = _mulOrDiv.getLeft();
                Object _interpret = this.interpret(_left_4);
                final Integer left = ((Integer) _interpret);
                Expression _right_2 = _mulOrDiv.getRight();
                Object _interpret_1 = this.interpret(_right_2);
                final Float right = ((Float) _interpret_1);
                Float _xifexpression_3 = null;
                String _op = _mulOrDiv.getOp();
                boolean _equals = Objects.equal(_op, "*");
                if (_equals) {
                  float _multiply = ((left).intValue() * (right).floatValue());
                  _xifexpression_3 = Float.valueOf(_multiply);
                } else {
                  Float _xifexpression_4 = null;
                  String _op_1 = _mulOrDiv.getOp();
                  boolean _equals_1 = Objects.equal(_op_1, "/");
                  if (_equals_1) {
                    float _divide = ((left).intValue() / (right).floatValue());
                    _xifexpression_4 = Float.valueOf(_divide);
                  } else {
                    Float _xifexpression_5 = null;
                    String _op_2 = _mulOrDiv.getOp();
                    boolean _equals_2 = Objects.equal(_op_2, "%");
                    if (_equals_2) {
                      float _modulo = ((left).intValue() % (right).floatValue());
                      _xifexpression_5 = Float.valueOf(_modulo);
                    }
                    _xifexpression_4 = _xifexpression_5;
                  }
                  _xifexpression_3 = _xifexpression_4;
                }
                _xblockexpression_1 = (_xifexpression_3);
              }
              _xifexpression_2 = _xblockexpression_1;
            } else {
              Float _xblockexpression_2 = null;
              {
                Expression _left_4 = _mulOrDiv.getLeft();
                Object _interpret = this.interpret(_left_4);
                final Float left = ((Float) _interpret);
                Expression _right_2 = _mulOrDiv.getRight();
                Object _interpret_1 = this.interpret(_right_2);
                final Float right = ((Float) _interpret_1);
                Float _xifexpression_3 = null;
                String _op = _mulOrDiv.getOp();
                boolean _equals = Objects.equal(_op, "*");
                if (_equals) {
                  float _multiply = ((left).floatValue() * (right).floatValue());
                  _xifexpression_3 = Float.valueOf(_multiply);
                } else {
                  Float _xifexpression_4 = null;
                  String _op_1 = _mulOrDiv.getOp();
                  boolean _equals_1 = Objects.equal(_op_1, "/");
                  if (_equals_1) {
                    float _divide = ((left).floatValue() / (right).floatValue());
                    _xifexpression_4 = Float.valueOf(_divide);
                  } else {
                    Float _xifexpression_5 = null;
                    String _op_2 = _mulOrDiv.getOp();
                    boolean _equals_2 = Objects.equal(_op_2, "%");
                    if (_equals_2) {
                      float _modulo = ((left).floatValue() % (right).floatValue());
                      _xifexpression_5 = Float.valueOf(_modulo);
                    }
                    _xifexpression_4 = _xifexpression_5;
                  }
                  _xifexpression_3 = _xifexpression_4;
                }
                _xblockexpression_2 = (_xifexpression_3);
              }
              _xifexpression_2 = _xblockexpression_2;
            }
            _xifexpression_1 = _xifexpression_2;
          }
          _xifexpression = _xifexpression_1;
        } else {
          Integer _xblockexpression_3 = null;
          {
            Expression _left_4 = _mulOrDiv.getLeft();
            Object _interpret = this.interpret(_left_4);
            final Integer left = ((Integer) _interpret);
            Expression _right_2 = _mulOrDiv.getRight();
            Object _interpret_1 = this.interpret(_right_2);
            final Integer right = ((Integer) _interpret_1);
            Integer _xifexpression_3 = null;
            String _op = _mulOrDiv.getOp();
            boolean _equals = Objects.equal(_op, "*");
            if (_equals) {
              int _multiply = ((left).intValue() * (right).intValue());
              _xifexpression_3 = Integer.valueOf(_multiply);
            } else {
              Integer _xifexpression_4 = null;
              String _op_1 = _mulOrDiv.getOp();
              boolean _equals_1 = Objects.equal(_op_1, "/");
              if (_equals_1) {
                int _divide = ((left).intValue() / (right).intValue());
                _xifexpression_4 = Integer.valueOf(_divide);
              } else {
                Integer _xifexpression_5 = null;
                String _op_2 = _mulOrDiv.getOp();
                boolean _equals_2 = Objects.equal(_op_2, "%");
                if (_equals_2) {
                  int _modulo = ((left).intValue() % (right).intValue());
                  _xifexpression_5 = Integer.valueOf(_modulo);
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xblockexpression_3 = (_xifexpression_3);
          }
          _xifexpression = _xblockexpression_3;
        }
        _switchResult = _xifexpression;
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        final Not _not = (Not)e;
        _matched=true;
        Expression _expression = _not.getExpression();
        Object _interpret = this.interpret(_expression);
        boolean _not_1 = (!(((Boolean) _interpret)).booleanValue());
        _switchResult = Boolean.valueOf(_not_1);
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        final Minus _minus = (Minus)e;
        _matched=true;
        float _xifexpression = (float) 0;
        boolean _or = false;
        Expression _left = _minus.getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = _minus.getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          float _xifexpression_1 = (float) 0;
          Expression _left_2 = _minus.getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            float _xifexpression_2 = (float) 0;
            Expression _right = _minus.getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              Expression _left_3 = _minus.getLeft();
              Object _interpret = this.interpret(_left_3);
              Expression _right_1 = _minus.getRight();
              Object _interpret_1 = this.interpret(_right_1);
              float _minus_1 = ((((Float) _interpret)).floatValue() - (((Float) _interpret_1)).floatValue());
              _xifexpression_2 = _minus_1;
            } else {
              Expression _left_4 = _minus.getLeft();
              Object _interpret_2 = this.interpret(_left_4);
              Expression _right_2 = _minus.getRight();
              Object _interpret_3 = this.interpret(_right_2);
              float _minus_2 = ((((Float) _interpret_2)).floatValue() - (((Integer) _interpret_3)).intValue());
              _xifexpression_2 = _minus_2;
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            Expression _left_5 = _minus.getLeft();
            Object _interpret_4 = this.interpret(_left_5);
            Expression _right_3 = _minus.getRight();
            Object _interpret_5 = this.interpret(_right_3);
            float _minus_3 = ((((Integer) _interpret_4)).intValue() - (((Float) _interpret_5)).floatValue());
            _xifexpression_1 = _minus_3;
          }
          _xifexpression = _xifexpression_1;
        } else {
          Expression _left_6 = _minus.getLeft();
          Object _interpret_6 = this.interpret(_left_6);
          Expression _right_4 = _minus.getRight();
          Object _interpret_7 = this.interpret(_right_4);
          int _minus_4 = ((((Integer) _interpret_6)).intValue() - (((Integer) _interpret_7)).intValue());
          _xifexpression = _minus_4;
        }
        _switchResult = Float.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        final Plus _plus = (Plus)e;
        _matched=true;
        float _xifexpression = (float) 0;
        boolean _or = false;
        Expression _left = _plus.getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = _plus.getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          float _xifexpression_1 = (float) 0;
          Expression _left_2 = _plus.getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            float _xifexpression_2 = (float) 0;
            Expression _right = _plus.getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              Expression _left_3 = _plus.getLeft();
              Object _interpret = this.interpret(_left_3);
              Expression _right_1 = _plus.getRight();
              Object _interpret_1 = this.interpret(_right_1);
              float _plus_1 = ((((Float) _interpret)).floatValue() + (((Float) _interpret_1)).floatValue());
              _xifexpression_2 = _plus_1;
            } else {
              Expression _left_4 = _plus.getLeft();
              Object _interpret_2 = this.interpret(_left_4);
              Expression _right_2 = _plus.getRight();
              Object _interpret_3 = this.interpret(_right_2);
              float _plus_2 = ((((Float) _interpret_2)).floatValue() + (((Integer) _interpret_3)).intValue());
              _xifexpression_2 = _plus_2;
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            Expression _left_5 = _plus.getLeft();
            Object _interpret_4 = this.interpret(_left_5);
            Expression _right_3 = _plus.getRight();
            Object _interpret_5 = this.interpret(_right_3);
            float _plus_3 = ((((Integer) _interpret_4)).intValue() + (((Float) _interpret_5)).floatValue());
            _xifexpression_1 = _plus_3;
          }
          _xifexpression = _xifexpression_1;
        } else {
          Expression _left_6 = _plus.getLeft();
          Object _interpret_6 = this.interpret(_left_6);
          Expression _right_4 = _plus.getRight();
          Object _interpret_7 = this.interpret(_right_4);
          int _plus_4 = ((((Integer) _interpret_6)).intValue() + (((Integer) _interpret_7)).intValue());
          _xifexpression = _plus_4;
        }
        _switchResult = Float.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        final Equality _equality = (Equality)e;
        _matched=true;
        boolean _xifexpression = false;
        String _op = _equality.getOp();
        boolean _equals = Objects.equal(_op, "==");
        if (_equals) {
          Expression _left = _equality.getLeft();
          Object _interpret = this.interpret(_left);
          Expression _right = _equality.getRight();
          Object _interpret_1 = this.interpret(_right);
          boolean _equals_1 = Objects.equal(_interpret, _interpret_1);
          _xifexpression = _equals_1;
        } else {
          Expression _left_1 = _equality.getLeft();
          Object _interpret_2 = this.interpret(_left_1);
          Expression _right_1 = _equality.getRight();
          Object _interpret_3 = this.interpret(_right_1);
          boolean _notEquals = (!Objects.equal(_interpret_2, _interpret_3));
          _xifexpression = _notEquals;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        final And _and = (And)e;
        _matched=true;
        boolean _and_1 = false;
        Expression _left = _and.getLeft();
        Object _interpret = this.interpret(_left);
        if (!(((Boolean) _interpret)).booleanValue()) {
          _and_1 = false;
        } else {
          Expression _right = _and.getRight();
          Object _interpret_1 = this.interpret(_right);
          _and_1 = ((((Boolean) _interpret)).booleanValue() && (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_and_1);
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        final Or _or = (Or)e;
        _matched=true;
        boolean _or_1 = false;
        Expression _left = _or.getLeft();
        Object _interpret = this.interpret(_left);
        if ((((Boolean) _interpret)).booleanValue()) {
          _or_1 = true;
        } else {
          Expression _right = _or.getRight();
          Object _interpret_1 = this.interpret(_right);
          _or_1 = ((((Boolean) _interpret)).booleanValue() || (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_or_1);
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        final Comparison _comparison = (Comparison)e;
        _matched=true;
        Boolean _xifexpression = null;
        boolean _or = false;
        Expression _left = _comparison.getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = _comparison.getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          Boolean _xifexpression_1 = null;
          Expression _left_2 = _comparison.getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            Boolean _xifexpression_2 = null;
            Expression _right = _comparison.getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              Boolean _switchResult_1 = null;
              String _op = _comparison.getOp();
              final String _switchValue = _op;
              boolean _matched_1 = false;
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"<")) {
                  _matched_1=true;
                  Expression _left_3 = _comparison.getLeft();
                  Object _interpret = this.interpret(_left_3);
                  Expression _right_1 = _comparison.getRight();
                  Object _interpret_1 = this.interpret(_right_1);
                  boolean _lessThan = (((Float) _interpret).compareTo(((Float) _interpret_1)) < 0);
                  _switchResult_1 = Boolean.valueOf(_lessThan);
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,">")) {
                  _matched_1=true;
                  Expression _left_4 = _comparison.getLeft();
                  Object _interpret_2 = this.interpret(_left_4);
                  Expression _right_2 = _comparison.getRight();
                  Object _interpret_3 = this.interpret(_right_2);
                  boolean _greaterThan = (((Float) _interpret_2).compareTo(((Float) _interpret_3)) > 0);
                  _switchResult_1 = Boolean.valueOf(_greaterThan);
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"<=")) {
                  _matched_1=true;
                  Expression _left_5 = _comparison.getLeft();
                  Object _interpret_4 = this.interpret(_left_5);
                  Expression _right_3 = _comparison.getRight();
                  Object _interpret_5 = this.interpret(_right_3);
                  boolean _lessEqualsThan = (((Float) _interpret_4).compareTo(((Float) _interpret_5)) <= 0);
                  _switchResult_1 = Boolean.valueOf(_lessEqualsThan);
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,">=")) {
                  _matched_1=true;
                  Expression _left_6 = _comparison.getLeft();
                  Object _interpret_6 = this.interpret(_left_6);
                  Expression _right_4 = _comparison.getRight();
                  Object _interpret_7 = this.interpret(_right_4);
                  boolean _greaterEqualsThan = (((Float) _interpret_6).compareTo(((Float) _interpret_7)) >= 0);
                  _switchResult_1 = Boolean.valueOf(_greaterEqualsThan);
                }
              }
              _xifexpression_2 = _switchResult_1;
            } else {
              Boolean _switchResult_2 = null;
              String _op_1 = _comparison.getOp();
              final String _switchValue_1 = _op_1;
              boolean _matched_2 = false;
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"<")) {
                  _matched_2=true;
                  Expression _left_7 = _comparison.getLeft();
                  Object _interpret_8 = this.interpret(_left_7);
                  Expression _right_5 = _comparison.getRight();
                  Object _interpret_9 = this.interpret(_right_5);
                  boolean _lessThan_1 = ((((Float) _interpret_8)).floatValue() < (((Integer) _interpret_9)).intValue());
                  _switchResult_2 = Boolean.valueOf(_lessThan_1);
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,">")) {
                  _matched_2=true;
                  Expression _left_8 = _comparison.getLeft();
                  Object _interpret_10 = this.interpret(_left_8);
                  Expression _right_6 = _comparison.getRight();
                  Object _interpret_11 = this.interpret(_right_6);
                  boolean _greaterThan_1 = ((((Float) _interpret_10)).floatValue() > (((Integer) _interpret_11)).intValue());
                  _switchResult_2 = Boolean.valueOf(_greaterThan_1);
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"<=")) {
                  _matched_2=true;
                  Expression _left_9 = _comparison.getLeft();
                  Object _interpret_12 = this.interpret(_left_9);
                  Expression _right_7 = _comparison.getRight();
                  Object _interpret_13 = this.interpret(_right_7);
                  boolean _lessEqualsThan_1 = ((((Float) _interpret_12)).floatValue() <= (((Integer) _interpret_13)).intValue());
                  _switchResult_2 = Boolean.valueOf(_lessEqualsThan_1);
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,">=")) {
                  _matched_2=true;
                  Expression _left_10 = _comparison.getLeft();
                  Object _interpret_14 = this.interpret(_left_10);
                  Expression _right_8 = _comparison.getRight();
                  Object _interpret_15 = this.interpret(_right_8);
                  boolean _greaterEqualsThan_1 = ((((Float) _interpret_14)).floatValue() >= (((Integer) _interpret_15)).intValue());
                  _switchResult_2 = Boolean.valueOf(_greaterEqualsThan_1);
                }
              }
              _xifexpression_2 = _switchResult_2;
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            Boolean _switchResult_3 = null;
            String _op_2 = _comparison.getOp();
            final String _switchValue_2 = _op_2;
            boolean _matched_3 = false;
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,"<")) {
                _matched_3=true;
                Expression _left_11 = _comparison.getLeft();
                Object _interpret_16 = this.interpret(_left_11);
                Expression _right_9 = _comparison.getRight();
                Object _interpret_17 = this.interpret(_right_9);
                boolean _lessThan_2 = ((((Integer) _interpret_16)).intValue() < (((Float) _interpret_17)).floatValue());
                _switchResult_3 = Boolean.valueOf(_lessThan_2);
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,">")) {
                _matched_3=true;
                Expression _left_12 = _comparison.getLeft();
                Object _interpret_18 = this.interpret(_left_12);
                Expression _right_10 = _comparison.getRight();
                Object _interpret_19 = this.interpret(_right_10);
                boolean _greaterThan_2 = ((((Integer) _interpret_18)).intValue() > (((Float) _interpret_19)).floatValue());
                _switchResult_3 = Boolean.valueOf(_greaterThan_2);
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,"<=")) {
                _matched_3=true;
                Expression _left_13 = _comparison.getLeft();
                Object _interpret_20 = this.interpret(_left_13);
                Expression _right_11 = _comparison.getRight();
                Object _interpret_21 = this.interpret(_right_11);
                boolean _lessEqualsThan_2 = ((((Integer) _interpret_20)).intValue() <= (((Float) _interpret_21)).floatValue());
                _switchResult_3 = Boolean.valueOf(_lessEqualsThan_2);
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,">=")) {
                _matched_3=true;
                Expression _left_14 = _comparison.getLeft();
                Object _interpret_22 = this.interpret(_left_14);
                Expression _right_12 = _comparison.getRight();
                Object _interpret_23 = this.interpret(_right_12);
                boolean _greaterEqualsThan_2 = ((((Integer) _interpret_22)).intValue() >= (((Float) _interpret_23)).floatValue());
                _switchResult_3 = Boolean.valueOf(_greaterEqualsThan_2);
              }
            }
            _xifexpression_1 = _switchResult_3;
          }
          _xifexpression = _xifexpression_1;
        } else {
          Boolean _switchResult_4 = null;
          String _op_3 = _comparison.getOp();
          final String _switchValue_3 = _op_3;
          boolean _matched_4 = false;
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,"<")) {
              _matched_4=true;
              Expression _left_15 = _comparison.getLeft();
              Object _interpret_24 = this.interpret(_left_15);
              Expression _right_13 = _comparison.getRight();
              Object _interpret_25 = this.interpret(_right_13);
              boolean _lessThan_3 = (((Integer) _interpret_24).compareTo(((Integer) _interpret_25)) < 0);
              _switchResult_4 = Boolean.valueOf(_lessThan_3);
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,">")) {
              _matched_4=true;
              Expression _left_16 = _comparison.getLeft();
              Object _interpret_26 = this.interpret(_left_16);
              Expression _right_14 = _comparison.getRight();
              Object _interpret_27 = this.interpret(_right_14);
              boolean _greaterThan_3 = (((Integer) _interpret_26).compareTo(((Integer) _interpret_27)) > 0);
              _switchResult_4 = Boolean.valueOf(_greaterThan_3);
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,"<=")) {
              _matched_4=true;
              Expression _left_17 = _comparison.getLeft();
              Object _interpret_28 = this.interpret(_left_17);
              Expression _right_15 = _comparison.getRight();
              Object _interpret_29 = this.interpret(_right_15);
              boolean _lessEqualsThan_3 = (((Integer) _interpret_28).compareTo(((Integer) _interpret_29)) <= 0);
              _switchResult_4 = Boolean.valueOf(_lessEqualsThan_3);
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,">=")) {
              _matched_4=true;
              Expression _left_18 = _comparison.getLeft();
              Object _interpret_30 = this.interpret(_left_18);
              Expression _right_16 = _comparison.getRight();
              Object _interpret_31 = this.interpret(_right_16);
              boolean _greaterEqualsThan_3 = (((Integer) _interpret_30).compareTo(((Integer) _interpret_31)) >= 0);
              _switchResult_4 = Boolean.valueOf(_greaterEqualsThan_3);
            }
          }
          _xifexpression = _switchResult_4;
        }
        _switchResult = _xifexpression;
      }
    }
    return ((Comparable<Object>)_switchResult);
  }
}
