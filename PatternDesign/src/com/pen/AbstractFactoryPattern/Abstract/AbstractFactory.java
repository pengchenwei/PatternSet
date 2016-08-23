package com.pen.AbstractFactoryPattern.Abstract;

import com.pen.AbstractFactoryPattern.Inter.IColor;
import com.pen.FactoryPattern.Inter.IShape;

/**
 * AbstractFactory:抽象工厂类
 * @author pen *
 */
public abstract class AbstractFactory {
	
	public abstract IShape getShape(String shape);
	public abstract IColor getColor(String color);

}
