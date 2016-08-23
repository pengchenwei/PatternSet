package com.pen.AbstractFactoryPattern.Impl;

import com.pen.AbstractFactoryPattern.Inter.IColor;
/**
 * RedImpl :实现IColor接口类
 * @author pen
 *
 */
public class RedImpl implements IColor {

	@Override
	public void fill() {
		System.out.println("fill with red");
	}

}
