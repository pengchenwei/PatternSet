package com.pen.FactoryPattern.Impl;

import com.pen.FactoryPattern.Inter.IShape;
/**
 * CircleImpl :图形接口IShape 的实现类
 * @author pen
 *
 */
public class CircleImpl implements IShape {

	@Override
	public void draw() {
		System.out.println("This is a draw circle method");
	}

}
