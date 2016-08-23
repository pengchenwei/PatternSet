/**
 * 
 */
package com.pen.pattrenTest;

import org.junit.Test;

import com.pen.adapterPattern.Impl.PlayerImpl;

/**
 * @author pen TestAdapterPattern:适配器模式测试用例
 */
public class TestAdapterPattern {
	@Test
	public void test() {
		PlayerImpl playerImpl = new PlayerImpl();

		playerImpl.play("mp3", "A song named mp3.mp3");
		playerImpl.play("mp3", "beyond the horizon.mp3");
		playerImpl.play("mp4", "alone.mp4");
		playerImpl.play("vlc", "far far away.vlc");
		playerImpl.play("avi", "mind me.avi");
	}

}
