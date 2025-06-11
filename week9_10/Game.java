package week9_10;

public abstract class Game {
	private String title;
	private String version;

	public Game(String title, String verString) {
		// 필드 초기화
		this.title = title;
		this.version = version;
	}

	public void strat() {
		System.out.println("제목 : " + title);
		System.out.println("버전 : " + version);
		System.out.println(title + "게임을 시작합니다");
	}

	// 게임에 대한 설명이 필요 => 게임마다 다르다
	// 메소드의 모양만 선언
	public abstract void gameDesc();
}
