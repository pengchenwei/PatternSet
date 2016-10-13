package com.pen.ProxyPattern.Impl;

import com.pen.ProxyPattern.Inter.IImage;

/**
 * @projectName: PatternDesign
 * @className: RealImageImpl.java
 * @Description: TODO
 * @CreatTime: 2016年10月12日 下午10:10:43
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class RealImageImpl implements IImage {
	private String fileName;

	/**
	 * Creates a new instance of RealImageImpl. Initialize precondition function
	 * 
	 * @param fileName
	 */
	public RealImageImpl(String fileName) {
		this.fileName = fileName;
		loadFile(fileName);
	}

	/**
	 * @MethodName: loadFile
	 * @Description: display image precondition
	 * @param fileName
	 * @author pen
	 * @CreatTime: 2016年10月12日 下午10:18:09
	 */
	private void loadFile(String fileName) {
		System.out.println("loading image " + fileName + " from hardware");
	}

	/**
	 * @MethodName: display
	 * @Description: call from outside
	 * @author pen
	 * @CreatTime: 2016年10月12日 下午10:22:02
	 */
	@Override
	public void display() {
		System.out.println("display image " + fileName);
	}

}
