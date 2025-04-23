package week5;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		char c;
		while (true) {
			System.out.print("정수 입력 >> ");
			num = sc.nextInt();
			if (num < 0) 
				break;
				
				if (num >= 90) {
					c = 'a';
				} else if (num >= 80) {
					c = 'b';
				} else if (num >= 70) {
					c = 'c';
				} else if (num >= 60) {
					c = 'd';
				} else {
					c = 'f';
				}
				System.out.print("\nSCORE       GRADE\n");
				System.out.print("===================\n");
				System.out.printf("%d              %c \n", num, c);

			}
			System.out.println("프로그램 종료");
		}

}
