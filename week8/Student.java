package week8;

public class Student {

	private String name;
    private int korean;
    private int english;
    private int math;

    public Student(String name, int korean, int english, int math) {
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    public int getTotal() {
        return korean + english + math;
    }
    public double getAverage() {
        return getTotal() / 3.0;
    }
    public void displayInfo() {
        System.out.println(name + ": 총점 " + getTotal() + "점, 평균 " + getAverage() + "점");
    }
}
