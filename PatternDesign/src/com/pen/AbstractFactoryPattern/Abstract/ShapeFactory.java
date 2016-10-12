package com.pen.AbstractFactoryPattern.Abstract;

import com.pen.AbstractFactoryPattern.Inter.IColor;
import com.pen.FactoryPattern.Impl.CircleImpl;
import com.pen.FactoryPattern.Impl.RectangleImpl;
import com.pen.FactoryPattern.Impl.SquareImpl;
import com.pen.FactoryPattern.Inter.IShape;

public class ShapeFactory extends AbstractFactory {

	/*
	 * getFactory：根据一个图形类型shapeType得到一个实例对象
	 */
	@Override
	public IShape getShape(String shapeType) {
		if (shapeType == null) {
			return null;
		}
		if (shapeType.equalsIgnoreCase("circle")) {
			return new CircleImpl();
		} else if (shapeType.equalsIgnoreCase("rectangle")) {
			return new RectangleImpl();
		} else if (shapeType.equalsIgnoreCase("square")) {
			return new SquareImpl();
		}
		return null;
	}

	@Override
	public IColor getColor(String color) {
		return null;
	}

}
