package week9;

// AirPlaneEX 클래스: 프로그램 실행의 진입점(main 메서드)을 가진 클래스
public class AirPlaneEX {
    public static void main(String[] args) {
        // SonicAirPlane 객체 생성
        SonicAirPlane sPlane = new SonicAirPlane();

        // 이륙 메서드 호출
        sPlane.takeoff();

        // 비행 메서드 호출 (일반 비행)
        sPlane.fly();

        // 착륙 메서드 호출
        sPlane.land();
        
        // 비행 모드를 초음속으로 변경
        sPlane.flyMode = SonicAirPlane.SUPERSONIC;

        // 비행 메서드 호출 (초음속 비행)
        sPlane.fly();
    }
}
