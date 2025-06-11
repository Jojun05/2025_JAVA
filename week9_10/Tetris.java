package week9_10;

public class Tetris extends Game {
	public Tetris(String title, String version) {
		super(title, version);
	}

	@Override
	public void gameDesc() {
		System.out.println("테트리스는 재미있는 게임이다");
	}
}
