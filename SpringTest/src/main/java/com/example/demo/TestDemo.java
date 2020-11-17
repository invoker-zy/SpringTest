package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.demo.entity.HelloWorld;

public class TestDemo {
	public static void main(String[] args) {
//		HelloWorld he = new HelloWorld();
//		he.setName("java");
//		he.hello();
		//1.创建Spring的IOC对象
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
		//2.从IOC容器中获取Bean实例
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		//3.调用实例中的hello方法
		helloWorld.hello();
	}
}
