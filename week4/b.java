package week4;

import java.util.Scanner;

public class b {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("상품 구매 가격 입력 >> ");
		int price = sc.nextInt();
		int rate = 0;
		int fprice = 0;
		int cho;
		int amt = 0;
		if (price >= 100000) {
			rate = 10;
		} else if (price >= 50000) {
			rate = 5;
		}
		// 할인 금액 계산
		int dis = price * rate / 100;
		fprice = price - amt;
		System.out.println("원래 가격 : " + price + "원");
		System.out.println("할인율" + rate + "%");
		System.out.println("할인율" + fprice + "원");

	}

}
