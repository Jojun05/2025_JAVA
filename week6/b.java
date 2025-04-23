package week6;

public class b {

	public static void main(String[] args) {
		int[] score = new int[10];
		// 배열처리는 for문
		// 반복 횟수는 배열.length
		System.out.println("== 랜덤 생성된 점수 배열 ==");
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100);
			System.out.printf("score[%d] = %d\n", i, score[i]);
		}
		System.out.println("");
		
		System.out.println("평균");
		int count = 0;
		double ave = 0.0;
		int[] score2 = new int[10];
		for (int i = 0; i < score.length; i++) {
			score[i] = (int) (Math.random() * 100);
			System.out.printf("score[%d] = %d\n", i, score[i]);

			count += score[i];
		}
		ave = (double) count / score.length;
		System.out.println("총점 :" + count);
		System.out.println("평균 :" + ave);
	}
}