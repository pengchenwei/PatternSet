package com.pen.pattrenTest;

import org.junit.Test;

import com.pen.FactoryPattern.ShapeFactory;
import com.pen.FactoryPattern.Inter.IShape;
/**
 * TestFactoryPattern ：工厂模式测试用例
 * @author pen
 *
 */
public class TestFactoryPattern {

	@Test
	public void test() {
		//实例化工厂，用于调用里面的getShape方法
		ShapeFactory shapeFactory = new ShapeFactory();
		//得到某个类型的对象
		IShape circleDrawer = shapeFactory.getShape("cirCLE");
		IShape squareDrawer = shapeFactory.getShape("SQUare");
		IShape rectangleDrawer = shapeFactory.getShape("RECTANGLE");
		circleDrawer.draw();
		squareDrawer.draw();
		rectangleDrawer.draw();
	}

}
