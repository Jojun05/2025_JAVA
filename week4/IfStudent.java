package week4;

import java.util.Scanner;

public class IfStudent {

	public static void main(String[] args) {
		// Scanner 객체 : 외부로부터 데이터값을 입력
		Scanner sc = new Scanner(System.in);
	
		System.out.print("태어난 연도 입력 : ");

		int year = sc.nextInt();
		System.out.println(year);

		int num = 2025 - year;

		if (num >= 20 && num <= 26) {
			System.out.println(num+"살이며");
			System.out.println("대학생 입니다");
		} else if (num >= 17 && num <= 20) {
			System.out.println(num+"살이며");
			System.out.println("고등학생 입니다");
		} else if (num >= 14 && num <= 17) {
			System.out.println(num+"살이며");
			System.out.println("중학생 입니다");
		} else if (num >= 8 && num <= 14) {
			System.out.println(num+"살이며");
			System.out.println("초등학생 입니다");
		} else {
			//8세 미만 이거나 ( ||) 26세 초과 인 경우
			System.out.println(num+"살이며");
			System.out.println("학생이 아닙니다");
		}

	}

}
