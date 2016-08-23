package com.pen.adapterPattern.Impl;

import com.pen.adapterPattern.Inter.IAdvancedMediaPlayer;
/**
 * VlcPlayerImlp:vlc媒体实现类
 * @author pen
 *
 */
public class VlcPlayerImlp implements IAdvancedMediaPlayer {

	@Override
	public void MP4Player(String fileName) {

	}

	@Override
	public void VlcPlayer(String fileName) {
		System.out.println("this is a player palys vlc type file :" + fileName);
	}

}
