package week9; // week9 패키지에 속함

public class Game { // 게임의 기본 정보를 담는 클래스 선언
    protected String title; // 게임의 제목(이름)
    protected double version; // 게임의 버전

    public Game(String title, double version) { // 생성자: 제목과 버전을 받아서 초기화
        this.title = title; // 전달받은 제목을 멤버 변수에 저장
        this.version = version; // 전달받은 버전을 멤버 변수에 저장
    }

    public void start() { // 게임을 시작하는 메서드
        System.out.println("제목 : " + title); // 게임 제목 출력
        System.out.println("버전 : " + version); // 게임 버전 출력
        System.out.println(title + " 게임을 시작합니다."); // 게임 시작 메시지 출력
    }
}
