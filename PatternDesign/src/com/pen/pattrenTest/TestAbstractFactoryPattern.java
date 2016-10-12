package com.pen.pattrenTest;

import org.junit.Test;

import com.pen.AbstractFactoryPattern.FacrtoryProducer;
import com.pen.AbstractFactoryPattern.Abstract.AbstractFactory;
import com.pen.AbstractFactoryPattern.Inter.IColor;
import com.pen.FactoryPattern.Inter.IShape;

public class TestAbstractFactoryPattern {

	@Test
	public void test() {
		// 先根据工厂（choice）类型，通过工厂producer得到具体的工厂实例
		AbstractFactory colorFactory = FacrtoryProducer.getFactory("COLOR");
		AbstractFactory shapeFactory = FacrtoryProducer.getFactory("shape");
		// 根据对象类型（colorType）得到一个对象，再调用对象方法
		IColor color = colorFactory.getColor("red");
		color.fill();
		IShape shape = shapeFactory.getShape("circle");
		shape.draw();
	}

}
