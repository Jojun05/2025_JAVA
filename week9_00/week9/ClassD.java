package week9;

public class ClassD {
	// 필드의 접근 제한자
	public int field1;
	int field2; // 접근 제한자가 생략 => default
	private int field3;

	public ClassD() {
		field1 = 10;
		field2 = 10;
		field3 = 10;

		method1();
		method2();
		method3();
	}

	// 메소드의 접근제한자
	public void method1() {

	}

	void method2() {
	}

	private void method3() {
	}
}
