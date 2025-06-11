package week8; // week8 패키지에 속함

// StudentEx 클래스 선언
public class StudentEx {
    public static void main(String[] args) { // main 메서드: 프로그램의 시작점
        // Student 객체 student1를 생성하고, 이름과 점수를 전달
        Student student1 = new Student("홍길동", 90, 85, 87);
        // Student 객체 student2를 생성하고, 이름과 점수를 전달
        Student student2 = new Student("김철수", 78, 88, 92);

        // student1의 정보를 출력
        student1.displayInfo();
        // student2의 정보를 출력
        student2.displayInfo();
    }
}
