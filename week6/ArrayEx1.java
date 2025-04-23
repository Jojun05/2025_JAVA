package week6;

public class ArrayEx1 {

	public static void main(String[] args) {
		// 배열 선언과 생성
		// 값 목록으로 생성히는 방법
		int[] score = { 70, 80, 90, 85, 95 };
		String[] pName = { "java", "c", "python", "C#" };
		double[] dArray1;
		dArray1 = new double[] { 0.1, 0.2, 0.3, 0.4 };
		// new 연산자로 배열 생성
		int[] intArray = new int[5];
		System.out.println("intArray[5]" + intArray[0]);

		double[] dArray2 = new double[5];
		System.out.println("dArray2[0]" + dArray2[0]);

		String[] sArray = new String[5];
		System.out.println("sArray[0]" + sArray[0]);
		// sArreay = pName;
		// 배열의 처리는 for 반복문 이용
		for (int i = 0; i < pName.length; i++) {
			sArray[i] = pName[i];
			System.out.printf("sArray[%d]=%s\n",i,sArray[i]);
		}
	}

}
