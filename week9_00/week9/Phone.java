package week9;

public class Phone {
	// 자식 객체가 가지는 공통된 속성과 기능을 선언
	// 부모 클래스
	// private 인 경우에는 상속이 안돼
	private String model;
	private String color;

	public Phone(String model, String color) {
		// 기본생성자
		// this.model = model;
		// this.color = color;
		// 부모 클래스 생성자를 호출
		
		System.out.println("Phone() 생성자 호출");
	}

	public String getModel() {
		return model;
	}

	public String getColor() {
		return color;
	}

	public void bell() {
		System.out.println("벨이 울립니다.");
	}

	public void sendVoice(String msg) {
		System.out.println("나 : " + msg);
	}

	public void receiveVoice(String msg) {
		System.out.println("너 : " + msg);
	}

	public void handUp() {
		System.out.println("전화를 끊습니다");
	}

}
