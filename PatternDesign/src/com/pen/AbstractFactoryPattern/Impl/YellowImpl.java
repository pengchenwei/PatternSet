package com.pen.AbstractFactoryPattern.Impl;

import com.pen.AbstractFactoryPattern.Inter.IColor;
/**
 * YellowImpl :实现IColor接口类
 * @author pen
 *
 */
public class YellowImpl implements IColor {

	@Override
	public void fill() {
		System.out.println("fill with yellow");
	}

}
