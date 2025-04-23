package week5;

public class ContinueEx {

	public static void main(String[] args) {
		for (int i = 0; i <= 100; i++) {
			// 짝수만 출력
			// 홀수는 생략
			if (i % 2 != 0)
				continue;
			System.out.println();
		}
	}

}
