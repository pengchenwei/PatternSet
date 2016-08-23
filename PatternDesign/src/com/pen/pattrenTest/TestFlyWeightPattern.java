package com.pen.pattrenTest;

import com.pen.FlyweightPattren.ShapeFactory;
import com.pen.FlyweightPattren.Impl.CircleImpl;
/**
 * TestFlyWeightPattern:享元模式测试Demo
 * @author pen
 *
 */
public class TestFlyWeightPattern {
	private static final String[] colorArr = { "red", "white", "blue", "green", "gray" };

	public static void main(String[] args) {
		for (int i = 0; i < 20; i++) {
			CircleImpl circle = (CircleImpl) ShapeFactory.getShape(colorArr[(int) (Math.random() * colorArr.length)]);
			circle.setX((int) (Math.random() * 100));
			circle.setY((int) (Math.random() * 100));
			circle.setRadius(100);
			circle.draw();
		}
	}

}
