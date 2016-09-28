package com.pen.StrategyPattren.Impl;

import com.pen.StrategyPattren.Inter.Strategy;

/**
 * @projectName: PatternDesign
 * @className: SubtarctionStrategya.java
 * @Description: 策略模式具体实现类--减法实现类
 * @CreatTime: 2016年9月28日 下午8:45:59
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class SubtarctionStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a - b;
	}

}
