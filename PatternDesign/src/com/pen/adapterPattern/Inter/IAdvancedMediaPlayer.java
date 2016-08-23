package com.pen.adapterPattern.Inter;
/**
 * AdvancedMeidaPlayer：高级播放器接口类
 * @author pen
 *
 */
public interface IAdvancedMediaPlayer {
	/*
	 * MP4Player:播放mp4类型的文件
	 */
	void MP4Player(String fileName);
	/*
	 * VlcPlayer:播放vlc类型的文件
	 */
	void VlcPlayer(String fileName);
}
