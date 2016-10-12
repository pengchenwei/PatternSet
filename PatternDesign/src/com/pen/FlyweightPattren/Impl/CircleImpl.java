package com.pen.FlyweightPattren.Impl;

import com.pen.FlyweightPattren.Inter.IShape;
/**
 * CircleImpl ：形状实现类
 * @author pen
 *
 */
public class CircleImpl implements IShape {
	private int radius, x, y;
	private String color;

	/*
	 * setRadius：设置circle的半径
	 */
	public void setRadius(int radius) {
		this.radius = radius;
	}

	/*
	 * setX：设置圆心的横坐标
	 */
	public void setX(int x) {
		this.x = x;
	}

	/*
	 * setY:设置圆心的纵坐标
	 */
	public void setY(int y) {
		this.y = y;
	}

	/*
	 * setColor:设置圆的颜色
	 */
	public CircleImpl(String color) {
		this.color = color;
	}

	/*
	 * 画出一个圆的方法 (non-Javadoc)
	 * 
	 * @see com.pen.FlyweightPattren.Inter.IShape#draw()
	 */
	@Override
	public void draw() {
		System.out.println("draw Circle [" + " color:" + color + " X:" + x + " Y:" + y + " radius:" + radius + "]");
	}

}
