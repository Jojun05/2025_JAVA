package week13;

public class PrintClass1 {
	// 데이터를 입력 받아 출력하는 메소드 정의
	// 데이터 타입이 다른 경우 => 메소드 오버로딩
	public void printVal(int value) {
		System.out.println("value = " + value);
	}
	public void printVal(String value) {
		System.out.println("value = " + value);
	}
	public void printVal(boolean value) {
		System.out.println("value = " + value);
	}
}
