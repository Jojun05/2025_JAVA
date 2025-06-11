package week9_11;

public class SmartTV implements RemoteControl, Searchable {
	private int volume;

	@Override
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}

	@Override
	public void turnOn() {
		System.out.println("Smart Tv를 켭니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void turnOff() {
		System.out.println("Smart Tv를 끕니다.");
		// TODO Auto-generated method stub

	}

	@Override
	public void setVolume(int volume) {
		this.volume = volume;
	}

}
