package com.pen.pattrenTest;

import com.pen.StrategyPattren.Environment;
import com.pen.StrategyPattren.Impl.AddStrategy;
import com.pen.StrategyPattren.Impl.SubtarctionStrategy;
import com.pen.StrategyPattren.Inter.Strategy;

/**
 * @projectName: PatternDesign
 * @className: TestStrategyPattern.java
 * @Description: 策略模式测试类
 * @CreatTime: 2016年9月28日 下午8:57:08
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class TestStrategyPattern {
	public static void main(String[] args) {
		Strategy strategy = new AddStrategy();
		Environment enviroment = new Environment(strategy);
		System.out.println(enviroment.calculate(3, 4));
		enviroment.setStrategy(new SubtarctionStrategy());
		System.out.println(enviroment.calculate(3, 4));
	}
}
