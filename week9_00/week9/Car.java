package week9;

// Car 클래스 선언
public class Car {
    // 객체지향 프로그래밍에서는
    // 클래스의 필드를 외부에서 직접 접근하지 못하도록 private으로 선언함
    private String company;   // 자동차 제조사
    private String model;     // 자동차 모델명
    private String color;     // 자동차 색상
    private int maxspeed;     // 자동차 최고 속도

    // 외부에서 필드값을 읽어올 수 있도록 getter 메서드 제공
    public String getCompany() {
        return company; // company 필드 값 반환
    }

    // 외부에서 필드값을 지정할 수 있도록 setter 메서드 제공
    // 이 때, 유효성 검사 등 추가 로직을 구현할 수 있음
    public void setCompany(String company) {
        this.company = company; // 전달받은 값을 company 필드에 저장
    }

    public String getModel() {
        return model; // model 필드 값 반환
    }

    public void setModel(String model) {
        this.model = model; // 전달받은 값을 model 필드에 저장
    }

    public String getColor() {
        return color; // color 필드 값 반환
    }

    public void setColor(String color) {
        this.color = color; // 전달받은 값을 color 필드에 저장
    }

    public int getMaxspeed() {
        return maxspeed; // maxspeed 필드 값 반환
    }

    public void setMaxspeed(int maxspeed) {
        // 최고 속도는 350을 초과할 수 없도록 유효성 검사
        if (maxspeed > 350) {
            maxspeed = 350; // 350을 초과하면 350으로 제한
        } else {
            this.maxspeed = maxspeed; // 그 외는 전달받은 값으로 설정
        }
    }
}
