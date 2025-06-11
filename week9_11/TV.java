package week9_11;

public class TV implements RemoteControl {
	// 구현 클래스 : 인터 페이스를 사용하는(구현하는) 클래스
	private int volume;

	@Override
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}

	@Override
	public void setVolume(int volume) {
		if (volume > MAX_value)
			volume = MAX_value;
		else if (volume < MIN_value)
			volume = MIN_value;
		this.volume = volume;
		System.out.println("햔제 TV 볼륨 : " + volume);
	}
}
