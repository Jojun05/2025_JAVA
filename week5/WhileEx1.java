package week5;

public class WhileEx1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1~100까지의 합 구하기
		int num = 1;
		int sum = 0;
		while (num <= 100) {
			sum += num;
			num++;
		}
		System.out.println(sum);
	}

}
