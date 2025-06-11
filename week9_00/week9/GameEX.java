package week9; // week9 패키지에 속함

public class GameEX { // GameEX 클래스 선언 (실행을 위한 클래스)
	public static void main(String[] args) { // 프로그램의 시작점 main 메서드
		LOL lol = new LOL("롤", 13.0); // LOL 객체 생성(제목: "롤", 버전: 13.0)
		lol.start(); // lol 게임 시작 메서드 호출
		lol.lol(); // lol만의 특수 메서드 호출

		System.out.println(); // 줄바꿈

		Tetris tetris = new Tetris("테트리스", 12.5); // Tetris 객체 생성(제목: "테트리스", 버전: 12.5)
		tetris.start(); // tetris 게임 시작 메서드 호출
		tetris.tetris(); // tetris만의 특수 메서드 호출

		System.out.println(); // 줄바꿈

		SuperMario mario = new SuperMario("슈퍼마리오", 15.1); // SuperMario 객체 생성(제목: "슈퍼마리오", 버전: 15.1)
		mario.start(); // mario 게임 시작 메서드 호출
		mario.mario(); // mario만의 특수 메서드 호출
	}
}
