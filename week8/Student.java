package week8;

// 학생 정보를 저장하고 처리하는 클래스
public class Student {

    // 학생 이름
    private String name;
    // 국어 점수
    private int korean;
    // 영어 점수
    private int english;
    // 수학 점수
    private int math;

    // 생성자: 학생 이름과 점수를 받아서 초기화
    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }

    // 총점 계산 메소드
    public int getTotal() {
        return korean + english + math;
    }

    // 평균 계산 메소드
    public double getAverage() {
        return getTotal() / 3.0;
    }

    // 학생 정보(이름, 총점, 평균)를 출력하는 메소드
    public void displayInfo() {
        System.out.println(name + ": 총점 " + getTotal() + "점, 평균 " + getAverage() + "점");
    }
}
