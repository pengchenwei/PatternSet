package com.pen.FlyweightPattren;

import java.util.HashMap;

import com.pen.FlyweightPattren.Impl.CircleImpl;
import com.pen.FlyweightPattren.Inter.IShape;

/**
 * ShapeFactory :图形工厂类
 * 
 * @author pen
 *
 */
public class ShapeFactory {
	private static HashMap<String, IShape> circleMap = new HashMap<>();

	public static IShape getShape(String color) {
		CircleImpl circle = (CircleImpl) circleMap.get(color);

		if (circle == null) {
			circle = new CircleImpl(color);
			circleMap.put(color, circle);
			return circle;
		}
		return circle;
	}
}
