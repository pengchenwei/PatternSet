package com.pen.pattrenTest;

import org.junit.Test;

import com.pen.ProxyPattern.Impl.ProxyImageImpl;
import com.pen.ProxyPattern.Inter.IImage;

/**
 * @projectName: PatternDesign
 * @className: TestProxyPattern.java
 * @Description: test proxy pattern
 * @CreatTime: 2016年10月12日 下午10:34:20
 * @Author: pen
 * @Copyright: Copyright (c) 2016, pen All Rights Reserved.
 * @See
 */
public class TestProxyPattern {
	@Test
	private void test() {
		IImage image = new ProxyImageImpl("image.jpg");
		image.display();
	}
	public static void main(String[] args) {
		IImage image = new ProxyImageImpl("image.jpg");
		image.display();
	}
}
