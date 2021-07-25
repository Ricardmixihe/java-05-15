package com.jizhong.pojo;

public class Student {
	private String name;//姓名

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + "]";
	}
	
	//喂养动物方法
	public void feed(Animal animal){
		animal.eat();
	}
	
	//听歌方法
	public void sing(Singer singer){
		singer.sing();//调用唱歌方法
	}
	
}
