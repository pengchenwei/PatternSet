package com.pen.adapterPattern.Impl;

import com.pen.adapterPattern.Inter.IAdvancedMediaPlayer;
import com.pen.adapterPattern.Inter.IMediaplayer;

/**
 * MediaAdapter:媒体适配器
 * 
 * @author pen
 *
 */
public class MediaAdapter implements IMediaplayer {
	// 注入
	IAdvancedMediaPlayer AdvancedMediaPlayer;

	// 实例化，根据文件类型实例化相应的播放器(mp4或者vlc)
	public MediaAdapter(String type) {
		if (type.equalsIgnoreCase("mp4")) {
			AdvancedMediaPlayer = new MP4PlayerImpl();
		} else if (type.equalsIgnoreCase("vlc")) {
			AdvancedMediaPlayer = new VlcPlayerImlp();
		}
	}

	@Override
	public void play(String type, String fileName) {
		if (type.equalsIgnoreCase("mp4")) {
			AdvancedMediaPlayer.MP4Player(fileName);
		} else if (type.equalsIgnoreCase("vlc")) {
			AdvancedMediaPlayer.VlcPlayer(fileName);
		}
	}
}
