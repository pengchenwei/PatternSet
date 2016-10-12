package com.pen.FactoryPattern.Impl;

import com.pen.FactoryPattern.Inter.IShape;
/**
 * SquareImpl:图形接口IShape 的接口实现类
 * @author pen
 *
 */
public class SquareImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("This is a draw square method");
	}

}
