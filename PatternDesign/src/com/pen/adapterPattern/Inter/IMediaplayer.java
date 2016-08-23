package com.pen.adapterPattern.Inter;
/**
 * IMediaplayer :媒体播放器接口
 * @author pen
 *
 */
public interface IMediaplayer {
	/**
	 * play:媒体播放方法
	 * @param type 文件类型
	 * @param fileName 文件名称
	 */
	void play(String type,String fileName);
}
