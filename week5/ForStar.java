package week5;

public class ForStar {

	public static void main(String[] args) {
		int num = (int) (Math.random() * 10 + 1);
		System.err.println("랜덤한 숫자 : " + num);
		for (int i = 1; i <= num; i++) {

			System.out.print("*");

		}

	}

}
