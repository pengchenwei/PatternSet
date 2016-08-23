package com.pen.adapterPattern.Impl;

import com.pen.adapterPattern.Inter.IMediaplayer;

/**
 * PlayerImpl :播放器实现类
 * 
 * @author pen
 *
 */
public class PlayerImpl implements IMediaplayer {
	MediaAdapter mediaAdapter;
	/**
	 * 媒体播放器具体实现
	 */
	@Override
	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("mp3")) {
			System.out.println("this is a palyer plays mp3 type file :" + fileName);
		} else if (type.equalsIgnoreCase("mp4") || type.equalsIgnoreCase("vlc")) {
			mediaAdapter = new MediaAdapter(type);//实例化适配器
			mediaAdapter.play(type, fileName);//调用play方法
		} else {
			System.out.println("Invalid media " + type + "format not supported");
		}
	}

}
