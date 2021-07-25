package com.jizhong.controller;

import com.jizhong.pojo.FolkSinger;
import com.jizhong.pojo.Rocker;
import com.jizhong.pojo.Student;

public class TestSinger {
	public static void main(String[] args) {
		Student xiaoming = new Student();
		
//		//听摇滚乐
//		Rocker rocker = new Rocker();
//		xiaoming.sing(rocker);//摇滚乐
		
		//听民谣
		FolkSinger f = new FolkSinger();
		xiaoming.sing(f);
	}
}
