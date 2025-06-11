package week9;

public class GameEX {
	public static void main(String[] args) {
		LOL lol = new LOL("롤", 13.0);
		lol.start();
		lol.lol();

		System.out.println();

		Tetris tetris = new Tetris("테트리스", 12.5);
		tetris.start();
		tetris.tetris();

		System.out.println();

		SuperMario mario = new SuperMario("슈퍼마리오", 15.1);
		mario.start();
		mario.mario();
	}
}