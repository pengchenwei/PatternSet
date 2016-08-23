package com.pen.AbstractFactoryPattern;

import com.pen.AbstractFactoryPattern.Abstract.AbstractFactory;
import com.pen.AbstractFactoryPattern.Abstract.ColorFactory;
import com.pen.AbstractFactoryPattern.Abstract.ShapeFactory;

/**
 * FacrtoryProducer :通过调用抽象工厂类中的抽象方法获得具体工厂类
 * 
 * @author pen
 *
 */
public class FacrtoryProducer {
	/*
	 * getFactory:根据传入的选择来创建一个工厂实例并返回
	 */
	public static AbstractFactory getFactory(String choice) {
		if(choice.equalsIgnoreCase("color"))
			return new ColorFactory();
		else if (choice.equalsIgnoreCase("shape"))
			return new ShapeFactory();
		return null;
	}
}
