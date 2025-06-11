package week9_10;

public abstract class Animal {
	public String kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	// 모든 동물은 소리를 낸다
	// 동물마다 소리가 다르다 => 자식객체에서 반드시 재정의해야함
	// 메소드의 모양만 제공 => 실행문이 없다
	public abstract void sound();

}
