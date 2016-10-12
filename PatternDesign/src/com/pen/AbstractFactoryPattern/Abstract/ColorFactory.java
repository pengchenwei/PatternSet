package com.pen.AbstractFactoryPattern.Abstract;

import com.pen.AbstractFactoryPattern.Impl.BlueImpl;
import com.pen.AbstractFactoryPattern.Impl.RedImpl;
import com.pen.AbstractFactoryPattern.Impl.YellowImpl;
import com.pen.AbstractFactoryPattern.Inter.IColor;
import com.pen.FactoryPattern.Inter.IShape;

public class ColorFactory extends AbstractFactory {

	@Override
	public IShape getShape(String shape) {
		return null;
	}

	@Override
	public IColor getColor(String colorType) {
		if (colorType == null) {
			return null;
		}
		if (colorType.equalsIgnoreCase("red")) {
			return new RedImpl();
		} else if (colorType.equalsIgnoreCase("blue")) {
			return new BlueImpl();
		} else if (colorType.equalsIgnoreCase("yellow")) {
			return new YellowImpl();
		}
		return null;
	}

}
