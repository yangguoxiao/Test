package com.atguigu.test;

public class Test {

	public static void main(String[] args) {
		int i =1;
		int j =++i;
		//前++先赋自增在运算
		//后++先赋值后运算
		System.out.println(j);
		System.out.println(i);
		System.out.println("制造冲突");
	}
}
