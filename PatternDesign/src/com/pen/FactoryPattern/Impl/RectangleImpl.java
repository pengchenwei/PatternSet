package com.pen.FactoryPattern.Impl;

import com.pen.FactoryPattern.Inter.IShape;
/**
 * RectangleImpl:图形接口IShape 的接口实现类
 * @author pen
 *
 */
public class RectangleImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("This is a draw Rectangle method");
	}

}
