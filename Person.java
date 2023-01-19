package com.bridgelabz.secondpack;

public class Person {
	
	byte age;
	String gender;
	short height;	//short because height in inches
	short weight;	//weight may be more than 127
	String color;
	String Nation;

 public static void main(String[] args) {

	Person Alex=new Person();
	
	Alex.age=18;
	Alex.gender="male";
	Alex.height=172;
	Alex.weight=65;
	Alex.color="White";
	Alex.Nation="UK";
	
Person Ana=new Person();
	
	Ana.age=16;
	Ana.gender="female";
	Ana.height=165;
	Ana.weight=52;
	Ana.color="White";
	Ana.Nation="USA";
}
}
