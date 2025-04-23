package week4;

import java.util.Scanner;

public class a {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("이름을 입력하세요: ");
		String name = sc.next();
		System.out.print("키(cm)를 입력하세요: ");
		int cm = sc.nextInt();
		System.out.print("몸무게(kg)를 입력하세요 ; ");
		int kg = sc.nextInt();
		System.out.println(name + "님의 키는" + cm + "cm 이고" + "몸무게는 " + kg + "kg 입니다");
		double mh = cm / 100.0;
		double bmi = kg / (mh * 2);
		String result = "";
		if (bmi >= 30) {
			result = "고도비만";
		} else if (bmi >= 25 && bmi < 29) {
			result = "비만";

		} else if (bmi >= 23 && bmi < 24) {
			result = "과체중";

		} else if (bmi >= 18.5 && bmi < 22) {
			result = "정상";

		} else {
			result = "비만분류";
		}
		System.out.printf("BMI지수는 %.2f이고 %.2s입니다", bmi, result);

	}

}
