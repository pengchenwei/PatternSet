package com.pen.AbstractFactoryPattern.Impl;

import com.pen.AbstractFactoryPattern.Inter.IColor;
/**
 * BlueImpl :实现IColor接口类
 * @author pen
 *
 */
public class BlueImpl implements IColor {

	@Override
	public void fill() {
		System.out.println("fill with blue");
	}

}
