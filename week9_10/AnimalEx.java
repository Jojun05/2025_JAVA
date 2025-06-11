package week9_10;

public class AnimalEx {
	public static void main(String[] args) {
		// 추상클래스는 객체 생성 불가
		// anmal animal = new Animal();

		Dog dog = new Dog();
		Cat cat = new Cat();

		dog.sound();
		cat.sound();

		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 자동타입 변환
		Animal animal = dog;
		animal.sound();
		animal = cat;
		animal.sound();
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");

		animalSound(new Dog());
		animalSound(new Cat());
	}

	private static void animalSound(Animal animal) {
		animal.sound();
		animal.breathe();
		// animal.dogLife();
		// animal.catLife();
		// 자식객체에만 있는 메소드는 강제타입 변환해야 호출 가능
		if (animal instanceof Dog) {
			System.out.println("DOG 객체로 변환 가능");
			Dog dog = (Dog) animal;
			dog.DogLife();
		} else if (animal instanceof Cat) {
			System.out.println("Cat 객체로 변환 가능");
			Cat cat = (Cat) animal;
			cat.CatLife();
		}
	}
}
