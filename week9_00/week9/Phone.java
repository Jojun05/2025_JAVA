package week9; // 패키지 선언

public class Phone { // Phone 클래스 선언, 부모 클래스 역할
    // 자식 객체가 가지는 공통된 속성과 기능을 선언
    // 부모 클래스
    // private 인 경우에는 상속이 안돼

    private String model; // 휴대폰 모델명을 저장하는 변수, 외부에서 직접 접근 불가
    private String color; // 휴대폰 색상을 저장하는 변수, 외부에서 직접 접근 불가

    public Phone(String model, String color) { // 생성자: 객체 생성 시 모델명과 색상 전달받음
        // 기본생성자
        // this.model = model;
        // this.color = color;
        // 부모 클래스 생성자를 호출

        System.out.println("Phone() 생성자 호출"); // 생성자 호출 시 메시지 출력
    }

    public String getModel() { // 모델명을 반환하는 getter 메서드
        return model;
    }

    public String getColor() { // 색상을 반환하는 getter 메서드
        return color;
    }

    public void bell() { // 벨이 울릴 때 동작하는 메서드
        System.out.println("벨이 울립니다.");
    }

    public void sendVoice(String msg) { // 음성 메시지 전송 기능
        System.out.println("나 : " + msg);
    }

    public void receiveVoice(String msg) { // 음성 메시지 수신 기능
        System.out.println("너 : " + msg);
    }

    public void handUp() { // 전화를 끊는 기능
        System.out.println("전화를 끊습니다");
    }
}
