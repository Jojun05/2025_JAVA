package week13;

public class PrintClass2Ex {
	public static void main(String[] args) {
		// 제네리 타입이 포함된 객체 생성
		// 타입 파라미터 : 클래스 혹은 인터페이스 형식이어야 함
		PrintClass2<Integer> pc2 = new PrintClass2<>();
		pc2.printVal(100);
		PrintClass2<String> pc3 = new PrintClass2<>();
		pc3.printVal("홍길동");

		PrintClass2<Boolean> pc4 = new PrintClass2<>();
		pc4.printVal(true);
	}
}
