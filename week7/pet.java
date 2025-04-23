package week7;

public class pet {
	String name;
	String type;
	int age;
	String color;

	// 오버로딩
	pet(String name, String type) {
		this.name = name;
		this.type = type;
		this.age = 0;
		this.color = "미정";
	}

	// 생성자의 매개변수를 이용해서 초기화
	// 필드명이랑 똑같이
	public pet(String name, String type, int age) {
		this.name = name;
		this.type = type;
		this.age = age;
	}

	pet(String name, String type, int age, String color) {
		this.name = name;
		this.type = type;
		this.age = age;
		this.color = color;
	}
}
