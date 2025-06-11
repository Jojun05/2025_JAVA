package week9_10;

public class Cat extends Animal {
	public Cat() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("meow");
	}

	public void CatLife() {
		System.out.println("CAT  평균 수명은 약 13 ~15년 입니다.");
	}
}
