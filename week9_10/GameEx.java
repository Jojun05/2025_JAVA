package week9_10;

public class GameEx {
	public static void main(String[] args) {
		// String[] name = new String[3];
		Game[] game = new Game[3];
		game[0] = new LOL("롤", "13.0"); // 자동타입 변환
		game[1] = new Tetris("테트리스", "12.5");
		game[2] = new SuperMario("슈퍼마리오", "10.5");

		for (int i = 0; i < game.length; i++) {
			game[i].strat();
			game[i].gameDesc();
			System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡ");
		}
		System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
		// 향상된 for문 이용
		for (Game g : game) {
			g.strat();
			g.gameDesc();
		}
	}
}
