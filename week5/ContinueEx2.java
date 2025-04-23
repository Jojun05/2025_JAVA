package week5;

public class ContinueEx2 {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i <= 100; i++) {
			if (i % 3 == 0)
				continue;
			sum += i;
		}
		System.out.println("3의 배수를 제외한 합 = " + sum);
		
		//3의 배수의 합 구하기
		int sum2 = 0;
		for(int i = 1; i<=100;i++) {
			if(i%3 == 0)
			sum2 += i;
		}
		System.out.println("3의 배수의 합 = " + sum2);
		System.out.println("3의 배수의 합 = " + (sum+sum2));
	}

}
