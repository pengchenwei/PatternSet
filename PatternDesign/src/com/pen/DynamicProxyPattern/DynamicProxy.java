package com.pen.DynamicProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

/**
 * @projectName: ThreadLearning
 * @className: StringProxy.java
 * @Description: dynamic class
 * @CreatTime: 2016年10月13日 下午8:39:46
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class DynamicProxy implements InvocationHandler {
	private Object proxyObj;

	public DynamicProxy(Object obj) {
		this.proxyObj = obj;
	}

	/**
	 * @MethodName: Factory
	 * @Description: get a proxy instance
	 * @param obj
	 * @return
	 * @author pen
	 * @CreatTime: 2016年10月13日 下午9:33:38
	 */
	private static Object Factory(Object obj) {
		Class<?> classType = obj.getClass();
		/**
		 * classType.getClassLoader()指定了以何种classLoader来加载这个类
		 * classType.getInterfaces()哪些接口对象能接收这个实例 new
		 * DynamicProxy(obj)这个实例将会被哪个handler来invoke
		 */
		Object ProxyInstance = Proxy.newProxyInstance(classType.getClassLoader(),
				classType.getInterfaces(), new DynamicProxy(obj));
		return ProxyInstance;
	}

	/**
	 * 实现invocationHandler中的invoke方法 | args表示调用代理时传过来的参数列表 | method 表示调用的哪个方法
	 */
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// 在调用真正完成功能的方法之前需要进行的操作将在下面完成
		System.out.println("before calling :" + method);

		if (args != null) {
			for (Object object : args) {
				System.out.println(object);
			}
		}
		// 调用真正完成功能的方法
		Object invoke = method.invoke(proxyObj, args);// 通过代理来获得具体是哪个方法，并将方法参数传递进去
		// 完成功能后还需要进行的操作
		System.out.println("after calling :" + method);

		return invoke;
	}

	/**
	 * @MethodName: main
	 * @Description: test dynamicProxy class
	 * @param args
	 * @author pen
	 * @CreatTime: 2016年10月13日 下午9:16:41
	 */
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		List<String> v = (List<String>) Factory(new Vector<>());// 通过动态代理获得一个实例，本实例的所有方法将通过代理来完成
		System.out.println(v.getClass().getName());

		v.add("hao me");// 实例中的所有方法都会通过代理方式执行

		InvocationHandler handler = new DynamicProxy(new HashMap<>());
		Map<String, String> s = (Map<String, String>) Proxy.newProxyInstance(
				Map.class.getClassLoader(), HashMap.class.getInterfaces(), handler);
		s.put("key", "value");

	}
}
