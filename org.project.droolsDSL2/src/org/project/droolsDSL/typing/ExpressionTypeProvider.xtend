package org.project.droolsDSL.typing

import org.project.droolsDSL.ddsl.Expression
import org.project.droolsDSL.ddsl.BoolConstant
import org.project.droolsDSL.ddsl.IntConstant
import org.project.droolsDSL.ddsl.FloatConstant
import org.project.droolsDSL.ddsl.And
import org.project.droolsDSL.ddsl.Or
import org.project.droolsDSL.ddsl.Comparison
import org.project.droolsDSL.ddsl.Equality
import org.project.droolsDSL.ddsl.Minus
import org.project.droolsDSL.ddsl.Plus
import org.project.droolsDSL.ddsl.Not

class ExpressionTypeProvider {
	public static val intType = new IntType
	public static val boolType = new BoolType
	public static val floatType = new FloatType
	
	//given an expression returns TypeInterface object
	def /*dispatch*/ TypeInterface typeFor(Expression e) {
		switch (e) {
			BoolConstant: boolType
			IntConstant: intType
			FloatConstant: floatType
			
			And: boolType
			Or: boolType
			
			Comparison: boolType
			Equality: boolType
			Not: boolType		
			
			Minus: floatType
			Plus: floatType
			
		}
	}
	
//OTHER CONTROL DISPATCH METHOD


	def isInt(TypeInterface type) { type == intType }
	def isFloat(TypeInterface type) { type == floatType}
	def isBoolean(TypeInterface type) { type == boolType }

}