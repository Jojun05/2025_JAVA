package week9;

// AirLine 클래스 정의: 비행기의 기본 동작(이륙, 비행, 착륙)을 메서드로 가짐
class AirLine {
    // 착륙 메서드
    public void land() {
        System.out.println("착륙합니다");
    }

    // 비행 메서드 (일반 비행)
    public void fly() {
        System.out.println("일반비행입니다");
    }

    // 이륙 메서드
    public void takeoff() {
        System.out.println("이륙합니다");
    }
}

// AirCraft 클래스는 AirLine 클래스를 상속(extends)함
public class AirCraft extends AirLine {
    // fly 메서드를 오버라이드(재정의)하여 여객기만의 비행 동작을 구현
    @Override
    public void fly() {
        System.out.println("여객기 비행입니다.");
    }

    // 프로그램 실행의 시작점(main 메서드)
    public static void main(String[] args) {
        AirCraft ac = new AirCraft

