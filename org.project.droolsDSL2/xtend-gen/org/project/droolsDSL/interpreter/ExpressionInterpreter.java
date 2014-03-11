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
        _matched=true;
        int _value = ((IntConstant)e).getValue();
        _switchResult = Integer.valueOf(_value);
      }
    }
    if (!_matched) {
      if (e instanceof FloatConstant) {
        _matched=true;
        float _value = ((FloatConstant)e).getValue();
        _switchResult = Float.valueOf(_value);
      }
    }
    if (!_matched) {
      if (e instanceof BoolConstant) {
        _matched=true;
        String _value = ((BoolConstant)e).getValue();
        boolean _parseBoolean = Boolean.parseBoolean(_value);
        _switchResult = Boolean.valueOf(_parseBoolean);
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Expression _expression = ((Not)e).getExpression();
        Object _interpret = this.interpret(_expression);
        _switchResult = Boolean.valueOf((!(((Boolean) _interpret)).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof MulOrDiv) {
        _matched=true;
        float _xifexpression = (float) 0;
        boolean _or = false;
        Expression _left = ((MulOrDiv)e).getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = ((MulOrDiv)e).getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          float _xifexpression_1 = (float) 0;
          boolean _and = false;
          Expression _left_2 = ((MulOrDiv)e).getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (!_isFloat_2) {
            _and = false;
          } else {
            Expression _right = ((MulOrDiv)e).getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isInt = this._expressionTypeProvider.isInt(_typeFor_3);
            _and = (_isFloat_2 && _isInt);
          }
          if (_and) {
            float _xblockexpression = (float) 0;
            {
              Expression _left_3 = ((MulOrDiv)e).getLeft();
              Object _interpret = this.interpret(_left_3);
              final Float left = ((Float) _interpret);
              Expression _right_1 = ((MulOrDiv)e).getRight();
              Object _interpret_1 = this.interpret(_right_1);
              final Integer right = ((Integer) _interpret_1);
              float _xifexpression_2 = (float) 0;
              String _op = ((MulOrDiv)e).getOp();
              boolean _equals = Objects.equal(_op, "*");
              if (_equals) {
                _xifexpression_2 = ((left).floatValue() * (right).intValue());
              } else {
                float _xifexpression_3 = (float) 0;
                String _op_1 = ((MulOrDiv)e).getOp();
                boolean _equals_1 = Objects.equal(_op_1, "/");
                if (_equals_1) {
                  _xifexpression_3 = ((left).floatValue() / (right).intValue());
                } else {
                  float _xifexpression_4 = (float) 0;
                  String _op_2 = ((MulOrDiv)e).getOp();
                  boolean _equals_2 = Objects.equal(_op_2, "%");
                  if (_equals_2) {
                    _xifexpression_4 = ((left).floatValue() % (right).intValue());
                  }
                  _xifexpression_3 = _xifexpression_4;
                }
                _xifexpression_2 = _xifexpression_3;
              }
              _xblockexpression = (_xifexpression_2);
            }
            _xifexpression_1 = _xblockexpression;
          } else {
            float _xifexpression_2 = (float) 0;
            boolean _and_1 = false;
            Expression _left_3 = ((MulOrDiv)e).getLeft();
            TypeInterface _typeFor_4 = this._expressionTypeProvider.typeFor(_left_3);
            boolean _isInt_1 = this._expressionTypeProvider.isInt(_typeFor_4);
            if (!_isInt_1) {
              _and_1 = false;
            } else {
              Expression _right_1 = ((MulOrDiv)e).getRight();
              TypeInterface _typeFor_5 = this._expressionTypeProvider.typeFor(_right_1);
              boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_5);
              _and_1 = (_isInt_1 && _isFloat_3);
            }
            if (_and_1) {
              float _xblockexpression_1 = (float) 0;
              {
                Expression _left_4 = ((MulOrDiv)e).getLeft();
                Object _interpret = this.interpret(_left_4);
                final Integer left = ((Integer) _interpret);
                Expression _right_2 = ((MulOrDiv)e).getRight();
                Object _interpret_1 = this.interpret(_right_2);
                final Float right = ((Float) _interpret_1);
                float _xifexpression_3 = (float) 0;
                String _op = ((MulOrDiv)e).getOp();
                boolean _equals = Objects.equal(_op, "*");
                if (_equals) {
                  _xifexpression_3 = ((left).intValue() * (right).floatValue());
                } else {
                  float _xifexpression_4 = (float) 0;
                  String _op_1 = ((MulOrDiv)e).getOp();
                  boolean _equals_1 = Objects.equal(_op_1, "/");
                  if (_equals_1) {
                    _xifexpression_4 = ((left).intValue() / (right).floatValue());
                  } else {
                    float _xifexpression_5 = (float) 0;
                    String _op_2 = ((MulOrDiv)e).getOp();
                    boolean _equals_2 = Objects.equal(_op_2, "%");
                    if (_equals_2) {
                      _xifexpression_5 = ((left).intValue() % (right).floatValue());
                    }
                    _xifexpression_4 = _xifexpression_5;
                  }
                  _xifexpression_3 = _xifexpression_4;
                }
                _xblockexpression_1 = (_xifexpression_3);
              }
              _xifexpression_2 = _xblockexpression_1;
            } else {
              float _xblockexpression_2 = (float) 0;
              {
                Expression _left_4 = ((MulOrDiv)e).getLeft();
                Object _interpret = this.interpret(_left_4);
                final Float left = ((Float) _interpret);
                Expression _right_2 = ((MulOrDiv)e).getRight();
                Object _interpret_1 = this.interpret(_right_2);
                final Float right = ((Float) _interpret_1);
                float _xifexpression_3 = (float) 0;
                String _op = ((MulOrDiv)e).getOp();
                boolean _equals = Objects.equal(_op, "*");
                if (_equals) {
                  _xifexpression_3 = ((left).floatValue() * (right).floatValue());
                } else {
                  float _xifexpression_4 = (float) 0;
                  String _op_1 = ((MulOrDiv)e).getOp();
                  boolean _equals_1 = Objects.equal(_op_1, "/");
                  if (_equals_1) {
                    _xifexpression_4 = ((left).floatValue() / (right).floatValue());
                  } else {
                    float _xifexpression_5 = (float) 0;
                    String _op_2 = ((MulOrDiv)e).getOp();
                    boolean _equals_2 = Objects.equal(_op_2, "%");
                    if (_equals_2) {
                      _xifexpression_5 = ((left).floatValue() % (right).floatValue());
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
          int _xblockexpression_3 = (int) 0;
          {
            Expression _left_4 = ((MulOrDiv)e).getLeft();
            Object _interpret = this.interpret(_left_4);
            final Integer left = ((Integer) _interpret);
            Expression _right_2 = ((MulOrDiv)e).getRight();
            Object _interpret_1 = this.interpret(_right_2);
            final Integer right = ((Integer) _interpret_1);
            int _xifexpression_3 = (int) 0;
            String _op = ((MulOrDiv)e).getOp();
            boolean _equals = Objects.equal(_op, "*");
            if (_equals) {
              _xifexpression_3 = ((left).intValue() * (right).intValue());
            } else {
              int _xifexpression_4 = (int) 0;
              String _op_1 = ((MulOrDiv)e).getOp();
              boolean _equals_1 = Objects.equal(_op_1, "/");
              if (_equals_1) {
                _xifexpression_4 = ((left).intValue() / (right).intValue());
              } else {
                int _xifexpression_5 = (int) 0;
                String _op_2 = ((MulOrDiv)e).getOp();
                boolean _equals_2 = Objects.equal(_op_2, "%");
                if (_equals_2) {
                  _xifexpression_5 = ((left).intValue() % (right).intValue());
                }
                _xifexpression_4 = _xifexpression_5;
              }
              _xifexpression_3 = _xifexpression_4;
            }
            _xblockexpression_3 = (_xifexpression_3);
          }
          _xifexpression = _xblockexpression_3;
        }
        _switchResult = Float.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Not) {
        _matched=true;
        Expression _expression = ((Not)e).getExpression();
        Object _interpret = this.interpret(_expression);
        _switchResult = Boolean.valueOf((!(((Boolean) _interpret)).booleanValue()));
      }
    }
    if (!_matched) {
      if (e instanceof Minus) {
        _matched=true;
        float _xifexpression = (float) 0;
        boolean _or = false;
        Expression _left = ((Minus)e).getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = ((Minus)e).getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          float _xifexpression_1 = (float) 0;
          Expression _left_2 = ((Minus)e).getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            float _xifexpression_2 = (float) 0;
            Expression _right = ((Minus)e).getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              Expression _left_3 = ((Minus)e).getLeft();
              Object _interpret = this.interpret(_left_3);
              Expression _right_1 = ((Minus)e).getRight();
              Object _interpret_1 = this.interpret(_right_1);
              _xifexpression_2 = ((((Float) _interpret)).floatValue() - (((Float) _interpret_1)).floatValue());
            } else {
              Expression _left_4 = ((Minus)e).getLeft();
              Object _interpret_2 = this.interpret(_left_4);
              Expression _right_2 = ((Minus)e).getRight();
              Object _interpret_3 = this.interpret(_right_2);
              _xifexpression_2 = ((((Float) _interpret_2)).floatValue() - (((Integer) _interpret_3)).intValue());
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            Expression _left_5 = ((Minus)e).getLeft();
            Object _interpret_4 = this.interpret(_left_5);
            Expression _right_3 = ((Minus)e).getRight();
            Object _interpret_5 = this.interpret(_right_3);
            _xifexpression_1 = ((((Integer) _interpret_4)).intValue() - (((Float) _interpret_5)).floatValue());
          }
          _xifexpression = _xifexpression_1;
        } else {
          Expression _left_6 = ((Minus)e).getLeft();
          Object _interpret_6 = this.interpret(_left_6);
          Expression _right_4 = ((Minus)e).getRight();
          Object _interpret_7 = this.interpret(_right_4);
          _xifexpression = ((((Integer) _interpret_6)).intValue() - (((Integer) _interpret_7)).intValue());
        }
        _switchResult = Float.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Plus) {
        _matched=true;
        float _xifexpression = (float) 0;
        boolean _or = false;
        Expression _left = ((Plus)e).getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = ((Plus)e).getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          float _xifexpression_1 = (float) 0;
          Expression _left_2 = ((Plus)e).getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            float _xifexpression_2 = (float) 0;
            Expression _right = ((Plus)e).getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              Expression _left_3 = ((Plus)e).getLeft();
              Object _interpret = this.interpret(_left_3);
              Expression _right_1 = ((Plus)e).getRight();
              Object _interpret_1 = this.interpret(_right_1);
              _xifexpression_2 = ((((Float) _interpret)).floatValue() + (((Float) _interpret_1)).floatValue());
            } else {
              Expression _left_4 = ((Plus)e).getLeft();
              Object _interpret_2 = this.interpret(_left_4);
              Expression _right_2 = ((Plus)e).getRight();
              Object _interpret_3 = this.interpret(_right_2);
              _xifexpression_2 = ((((Float) _interpret_2)).floatValue() + (((Integer) _interpret_3)).intValue());
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            Expression _left_5 = ((Plus)e).getLeft();
            Object _interpret_4 = this.interpret(_left_5);
            Expression _right_3 = ((Plus)e).getRight();
            Object _interpret_5 = this.interpret(_right_3);
            _xifexpression_1 = ((((Integer) _interpret_4)).intValue() + (((Float) _interpret_5)).floatValue());
          }
          _xifexpression = _xifexpression_1;
        } else {
          Expression _left_6 = ((Plus)e).getLeft();
          Object _interpret_6 = this.interpret(_left_6);
          Expression _right_4 = ((Plus)e).getRight();
          Object _interpret_7 = this.interpret(_right_4);
          _xifexpression = ((((Integer) _interpret_6)).intValue() + (((Integer) _interpret_7)).intValue());
        }
        _switchResult = Float.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof Equality) {
        _matched=true;
        boolean _xifexpression = false;
        String _op = ((Equality)e).getOp();
        boolean _equals = Objects.equal(_op, "==");
        if (_equals) {
          Expression _left = ((Equality)e).getLeft();
          Object _interpret = this.interpret(_left);
          Expression _right = ((Equality)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          boolean _equals_1 = Objects.equal(_interpret, _interpret_1);
          _xifexpression = _equals_1;
        } else {
          Expression _left_1 = ((Equality)e).getLeft();
          Object _interpret_2 = this.interpret(_left_1);
          Expression _right_1 = ((Equality)e).getRight();
          Object _interpret_3 = this.interpret(_right_1);
          boolean _notEquals = (!Objects.equal(_interpret_2, _interpret_3));
          _xifexpression = _notEquals;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    if (!_matched) {
      if (e instanceof And) {
        _matched=true;
        boolean _and = false;
        Expression _left = ((And)e).getLeft();
        Object _interpret = this.interpret(_left);
        if (!(((Boolean) _interpret)).booleanValue()) {
          _and = false;
        } else {
          Expression _right = ((And)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          _and = ((((Boolean) _interpret)).booleanValue() && (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_and);
      }
    }
    if (!_matched) {
      if (e instanceof Or) {
        _matched=true;
        boolean _or = false;
        Expression _left = ((Or)e).getLeft();
        Object _interpret = this.interpret(_left);
        if ((((Boolean) _interpret)).booleanValue()) {
          _or = true;
        } else {
          Expression _right = ((Or)e).getRight();
          Object _interpret_1 = this.interpret(_right);
          _or = ((((Boolean) _interpret)).booleanValue() || (((Boolean) _interpret_1)).booleanValue());
        }
        _switchResult = Boolean.valueOf(_or);
      }
    }
    if (!_matched) {
      if (e instanceof Comparison) {
        _matched=true;
        boolean _xifexpression = false;
        boolean _or = false;
        Expression _left = ((Comparison)e).getLeft();
        TypeInterface _typeFor = this._expressionTypeProvider.typeFor(_left);
        boolean _isFloat = this._expressionTypeProvider.isFloat(_typeFor);
        if (_isFloat) {
          _or = true;
        } else {
          Expression _left_1 = ((Comparison)e).getLeft();
          TypeInterface _typeFor_1 = this._expressionTypeProvider.typeFor(_left_1);
          boolean _isFloat_1 = this._expressionTypeProvider.isFloat(_typeFor_1);
          _or = (_isFloat || _isFloat_1);
        }
        if (_or) {
          boolean _xifexpression_1 = false;
          Expression _left_2 = ((Comparison)e).getLeft();
          TypeInterface _typeFor_2 = this._expressionTypeProvider.typeFor(_left_2);
          boolean _isFloat_2 = this._expressionTypeProvider.isFloat(_typeFor_2);
          if (_isFloat_2) {
            boolean _xifexpression_2 = false;
            Expression _right = ((Comparison)e).getRight();
            TypeInterface _typeFor_3 = this._expressionTypeProvider.typeFor(_right);
            boolean _isFloat_3 = this._expressionTypeProvider.isFloat(_typeFor_3);
            if (_isFloat_3) {
              boolean _switchResult_1 = false;
              String _op = ((Comparison)e).getOp();
              final String _switchValue = _op;
              boolean _matched_1 = false;
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"<")) {
                  _matched_1=true;
                  Expression _left_3 = ((Comparison)e).getLeft();
                  Object _interpret = this.interpret(_left_3);
                  Expression _right_1 = ((Comparison)e).getRight();
                  Object _interpret_1 = this.interpret(_right_1);
                  boolean _lessThan = (((Float) _interpret).compareTo(((Float) _interpret_1)) < 0);
                  _switchResult_1 = _lessThan;
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,">")) {
                  _matched_1=true;
                  Expression _left_4 = ((Comparison)e).getLeft();
                  Object _interpret_2 = this.interpret(_left_4);
                  Expression _right_2 = ((Comparison)e).getRight();
                  Object _interpret_3 = this.interpret(_right_2);
                  boolean _greaterThan = (((Float) _interpret_2).compareTo(((Float) _interpret_3)) > 0);
                  _switchResult_1 = _greaterThan;
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,"<=")) {
                  _matched_1=true;
                  Expression _left_5 = ((Comparison)e).getLeft();
                  Object _interpret_4 = this.interpret(_left_5);
                  Expression _right_3 = ((Comparison)e).getRight();
                  Object _interpret_5 = this.interpret(_right_3);
                  boolean _lessEqualsThan = (((Float) _interpret_4).compareTo(((Float) _interpret_5)) <= 0);
                  _switchResult_1 = _lessEqualsThan;
                }
              }
              if (!_matched_1) {
                if (Objects.equal(_switchValue,">=")) {
                  _matched_1=true;
                  Expression _left_6 = ((Comparison)e).getLeft();
                  Object _interpret_6 = this.interpret(_left_6);
                  Expression _right_4 = ((Comparison)e).getRight();
                  Object _interpret_7 = this.interpret(_right_4);
                  boolean _greaterEqualsThan = (((Float) _interpret_6).compareTo(((Float) _interpret_7)) >= 0);
                  _switchResult_1 = _greaterEqualsThan;
                }
              }
              _xifexpression_2 = _switchResult_1;
            } else {
              boolean _switchResult_2 = false;
              String _op_1 = ((Comparison)e).getOp();
              final String _switchValue_1 = _op_1;
              boolean _matched_2 = false;
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"<")) {
                  _matched_2=true;
                  Expression _left_7 = ((Comparison)e).getLeft();
                  Object _interpret_8 = this.interpret(_left_7);
                  Expression _right_5 = ((Comparison)e).getRight();
                  Object _interpret_9 = this.interpret(_right_5);
                  _switchResult_2 = ((((Float) _interpret_8)).floatValue() < (((Integer) _interpret_9)).intValue());
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,">")) {
                  _matched_2=true;
                  Expression _left_8 = ((Comparison)e).getLeft();
                  Object _interpret_10 = this.interpret(_left_8);
                  Expression _right_6 = ((Comparison)e).getRight();
                  Object _interpret_11 = this.interpret(_right_6);
                  _switchResult_2 = ((((Float) _interpret_10)).floatValue() > (((Integer) _interpret_11)).intValue());
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,"<=")) {
                  _matched_2=true;
                  Expression _left_9 = ((Comparison)e).getLeft();
                  Object _interpret_12 = this.interpret(_left_9);
                  Expression _right_7 = ((Comparison)e).getRight();
                  Object _interpret_13 = this.interpret(_right_7);
                  _switchResult_2 = ((((Float) _interpret_12)).floatValue() <= (((Integer) _interpret_13)).intValue());
                }
              }
              if (!_matched_2) {
                if (Objects.equal(_switchValue_1,">=")) {
                  _matched_2=true;
                  Expression _left_10 = ((Comparison)e).getLeft();
                  Object _interpret_14 = this.interpret(_left_10);
                  Expression _right_8 = ((Comparison)e).getRight();
                  Object _interpret_15 = this.interpret(_right_8);
                  _switchResult_2 = ((((Float) _interpret_14)).floatValue() >= (((Integer) _interpret_15)).intValue());
                }
              }
              _xifexpression_2 = _switchResult_2;
            }
            _xifexpression_1 = _xifexpression_2;
          } else {
            boolean _switchResult_3 = false;
            String _op_2 = ((Comparison)e).getOp();
            final String _switchValue_2 = _op_2;
            boolean _matched_3 = false;
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,"<")) {
                _matched_3=true;
                Expression _left_11 = ((Comparison)e).getLeft();
                Object _interpret_16 = this.interpret(_left_11);
                Expression _right_9 = ((Comparison)e).getRight();
                Object _interpret_17 = this.interpret(_right_9);
                _switchResult_3 = ((((Integer) _interpret_16)).intValue() < (((Float) _interpret_17)).floatValue());
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,">")) {
                _matched_3=true;
                Expression _left_12 = ((Comparison)e).getLeft();
                Object _interpret_18 = this.interpret(_left_12);
                Expression _right_10 = ((Comparison)e).getRight();
                Object _interpret_19 = this.interpret(_right_10);
                _switchResult_3 = ((((Integer) _interpret_18)).intValue() > (((Float) _interpret_19)).floatValue());
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,"<=")) {
                _matched_3=true;
                Expression _left_13 = ((Comparison)e).getLeft();
                Object _interpret_20 = this.interpret(_left_13);
                Expression _right_11 = ((Comparison)e).getRight();
                Object _interpret_21 = this.interpret(_right_11);
                _switchResult_3 = ((((Integer) _interpret_20)).intValue() <= (((Float) _interpret_21)).floatValue());
              }
            }
            if (!_matched_3) {
              if (Objects.equal(_switchValue_2,">=")) {
                _matched_3=true;
                Expression _left_14 = ((Comparison)e).getLeft();
                Object _interpret_22 = this.interpret(_left_14);
                Expression _right_12 = ((Comparison)e).getRight();
                Object _interpret_23 = this.interpret(_right_12);
                _switchResult_3 = ((((Integer) _interpret_22)).intValue() >= (((Float) _interpret_23)).floatValue());
              }
            }
            _xifexpression_1 = _switchResult_3;
          }
          _xifexpression = _xifexpression_1;
        } else {
          boolean _switchResult_4 = false;
          String _op_3 = ((Comparison)e).getOp();
          final String _switchValue_3 = _op_3;
          boolean _matched_4 = false;
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,"<")) {
              _matched_4=true;
              Expression _left_15 = ((Comparison)e).getLeft();
              Object _interpret_24 = this.interpret(_left_15);
              Expression _right_13 = ((Comparison)e).getRight();
              Object _interpret_25 = this.interpret(_right_13);
              boolean _lessThan_1 = (((Integer) _interpret_24).compareTo(((Integer) _interpret_25)) < 0);
              _switchResult_4 = _lessThan_1;
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,">")) {
              _matched_4=true;
              Expression _left_16 = ((Comparison)e).getLeft();
              Object _interpret_26 = this.interpret(_left_16);
              Expression _right_14 = ((Comparison)e).getRight();
              Object _interpret_27 = this.interpret(_right_14);
              boolean _greaterThan_1 = (((Integer) _interpret_26).compareTo(((Integer) _interpret_27)) > 0);
              _switchResult_4 = _greaterThan_1;
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,"<=")) {
              _matched_4=true;
              Expression _left_17 = ((Comparison)e).getLeft();
              Object _interpret_28 = this.interpret(_left_17);
              Expression _right_15 = ((Comparison)e).getRight();
              Object _interpret_29 = this.interpret(_right_15);
              boolean _lessEqualsThan_1 = (((Integer) _interpret_28).compareTo(((Integer) _interpret_29)) <= 0);
              _switchResult_4 = _lessEqualsThan_1;
            }
          }
          if (!_matched_4) {
            if (Objects.equal(_switchValue_3,">=")) {
              _matched_4=true;
              Expression _left_18 = ((Comparison)e).getLeft();
              Object _interpret_30 = this.interpret(_left_18);
              Expression _right_16 = ((Comparison)e).getRight();
              Object _interpret_31 = this.interpret(_right_16);
              boolean _greaterEqualsThan_1 = (((Integer) _interpret_30).compareTo(((Integer) _interpret_31)) >= 0);
              _switchResult_4 = _greaterEqualsThan_1;
            }
          }
          _xifexpression = _switchResult_4;
        }
        _switchResult = Boolean.valueOf(_xifexpression);
      }
    }
    return ((Comparable<Object>)_switchResult);
  }
}
