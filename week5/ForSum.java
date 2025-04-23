package week5;

public class ForSum {

	public static void main(String[] args) {
		// 1~100까지의 합 구하기
		// 누적 변수 => 초기화
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			// sum = sum + i<- 복합 연산자 사용하기
			sum += i;
		}
		System.out.println("1~100까지의 합 : " + sum);

	}

}
