package com.jizhong.controller;

import com.jizhong.pojo.Animal;
import com.jizhong.pojo.Cat;
import com.jizhong.pojo.Dog;
import com.jizhong.pojo.Student;

public class Test {
	public static void main(String[] args) {
		Student xiaoxin = new Student();
		
		//喂养猫咪
		Cat cat = new Cat();
		xiaoxin.feed(cat);//Animal animal = new Cat();
		//喂养狗狗
		Dog dog = new Dog();
		xiaoxin.feed(dog);
		
		
		
		//父类引用指向子类对象
		Animal myDog = new Dog();
		Animal myCat = new Cat();
		
		//动物类数组
		Animal[] animals = new Animal[2];
		animals[0] = new Cat();
		animals[1] = new Dog();
		for(int i = 0;i < animals.length;i++){
			animals[i].eat();
		}
	}
}
