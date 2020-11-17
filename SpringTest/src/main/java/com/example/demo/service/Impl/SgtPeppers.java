package com.example.demo.service.Impl;

import org.springframework.stereotype.Component;

import com.example.demo.service.CompactDisc;

@Component("dota")
public class SgtPeppers implements CompactDisc {
	private String title = "以父之名";
	private String artist = "周杰伦";
	@Override
	public void play() {
		System.out.println("播放"+artist+"的歌曲"+title);
	}
}
