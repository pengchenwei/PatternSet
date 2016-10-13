package com.pen.StrategyPattren;

import com.pen.StrategyPattren.Inter.Strategy;

/**
 * @projectName: PatternDesign
 * @className: Enviroment.java
 * @Description: 策略模式环境角色
 * @CreatTime: 2016年9月28日 下午8:49:56
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class Environment {
	// 私有变量
	private Strategy strategy;

	// 构造方法
	public Environment(Strategy strategy) {
		this.strategy = strategy;
	}

	// get和set方法
	public Strategy getStrategy() {
		return strategy;
	}

	public void setStrategy(Strategy strategy) {
		this.strategy = strategy;
	}

	// 调用本环境中的strategy实现策略
	public int calculate(int a, int b) {
		return strategy.calculate(a, b);
	}

}
