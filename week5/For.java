package week5;

import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 몇단을 계산할까?");
		int scanData = sc.nextInt();
		System.out.println(scanData + "를 계산합니다");
		for (int i = 1; i <= 9; i++) {

			System.out.println(scanData + "*" + i+ "="+scanData*i);
		}

	}

}
