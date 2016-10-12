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
			//得到某个颜色的circle图形
			CircleImpl circle = (CircleImpl) ShapeFactory.getShape(colorArr[(int) (Math.random() * colorArr.length)]);
			//重新设置图形的参数
			circle.setX((int) (Math.random() * 100));
			circle.setY((int) (Math.random() * 100));
			circle.setRadius(100);
			//将图形draw出来
			circle.draw();
		}
	}

}
