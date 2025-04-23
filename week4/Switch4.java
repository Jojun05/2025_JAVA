package week4;

import java.util.Scanner;

public class Switch4 {
	public static void main(String[] args) {
		String mobile = "iphone";
		switch (mobile) {
		case "iphone" -> System.out.println("애플제품");
		case "galaxy" -> System.out.println("삼성제품");
		default -> System.out.println("기타 제품");
		}
		System.out.println();

		// 점수에 따라 등급 출력
		Scanner sc = new Scanner(System.in);
		System.out.print("정수 입력(0~100) : ");
		int score = sc.nextInt();
		char grade = switch (score / 10) {
		case 10, 9 -> 'A';
		case 8 -> 'B';
		case 7 -> 'C';
		case 6 -> 'D';
		default -> 'f';

		};
		System.out.println(grade);
		sc.close();
	}
}
