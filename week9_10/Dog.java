package week9_10;

public class Dog extends Animal {
	public Dog() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("멍멍~");
	}

	public void DogLife() {
		System.out.println("DOG  평균 수명은 약 15 ~20년 입니다.");
	}
}
