package com.pen.adapterPattern.Impl;

import com.pen.adapterPattern.Inter.IAdvancedMediaPlayer;
/**
 * MP4PlayerImpl:mp4媒体实现类
 * @author pen
 *
 */
public class MP4PlayerImpl implements IAdvancedMediaPlayer {

	@Override
	public void MP4Player(String fileName) {
		System.out.println("this is a palyer plays mp4 type file :"+fileName);
	}

	@Override
	public void VlcPlayer(String fileName) {

	}

}
