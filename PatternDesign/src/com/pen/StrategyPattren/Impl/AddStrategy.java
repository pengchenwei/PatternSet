package com.pen.StrategyPattren.Impl;

import com.pen.StrategyPattren.Inter.Strategy;

/**
 * @projectName: PatternDesign
 * @className: AddStrategy.java
 * @Description: 策略模式具体实现类--具体策略角色
 * @CreatTime: 2016年9月28日 下午8:42:20
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class AddStrategy implements Strategy {

	@Override
	public int calculate(int a, int b) {
		return a + b;
	}

}
