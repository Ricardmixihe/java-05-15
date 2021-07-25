package com.jizhong.pojo;

/**
 * abstract：当前类是一个抽象类，抽象类不允许被实例化
 * 有抽象方法的类一定是抽象类
 * 抽象类不一定有抽象方法
 */
public abstract class Animal {
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * 声明当前方法为抽象方法
	 * 
	 */
	public abstract void eat();
}
