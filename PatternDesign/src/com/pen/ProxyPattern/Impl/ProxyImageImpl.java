package com.pen.ProxyPattern.Impl;

import com.pen.ProxyPattern.Inter.IImage;

/**
 * @projectName: PatternDesign
 * @className: ProxyImageImpl.java
 * @Description: proxy implements display function
 * @CreatTime: 2016年10月12日 下午10:23:42
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class ProxyImageImpl implements IImage {
	private String fileName;
	private RealImageImpl realImage;// 持有一个真实实现类的引用以便调用真正的函数

	/**
	 * 
	 * Creates a new instance of ProxyImageImpl.
	 * 
	 * @param fileName
	 */
	public ProxyImageImpl(String fileName) {
		this.fileName = fileName;
	}

	/**
	 * @MethodName: display
	 * @Description: invoking the real display function to implements display
	 *               function
	 * @author pen
	 * @CreatTime: 2016年10月12日 下午10:29:05
	 */
	@Override
	public void display() {
		if (realImage == null)
			realImage = new RealImageImpl(fileName);
		realImage.display();
	}

}
