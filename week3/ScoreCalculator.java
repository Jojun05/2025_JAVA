package week3;

public class ScoreCalculator {

	public static void main(String[] args) {
		int score = 50;

		System.out.println("초기 점수 : " + score);
		int ascore = score += 10;
		System.out.println("정답 보너스 (+10):" + ascore);
		int bscore = ascore -= 5;
		System.out.println("오답 감점(-5):" + bscore);
		int cscore = bscore *= 2;
		System.out.println("보너스 문제 정답(x2):" + cscore);

		System.out.println("추가점수(+1)" + ++cscore);
		System.out.println("감점(-1):"+ --cscore);
		System.out.println("총점 : " + cscore);
	}

}
