package com.pen.pattrenTest;

<<<<<<< HEAD
import com.pen.StrategyPattren.Environment;
=======
import com.pen.StrategyPattren.Enviroment;
>>>>>>> refs/remotes/origin/master
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
<<<<<<< HEAD
		Environment enviroment = new Environment(strategy);
=======
		Enviroment enviroment = new Enviroment(strategy);
>>>>>>> refs/remotes/origin/master
		System.out.println(enviroment.calculate(3, 4));
		enviroment.setStrategy(new SubtarctionStrategy());
		System.out.println(enviroment.calculate(3, 4));
	}
}
