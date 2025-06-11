package week12;

public class ConsumerThread extends Thread {
	private DataBox dataBox;

	public ConsumerThread(DataBox dataBox) {
		this.dataBox = dataBox;
	}

	@Override
	public void run() {
		// 소비자가 스레드 작업 내용
		// data 를 읽기만 가능
		for (int i = 0; i <= 3; i++) {
			try {
				String data = dataBox.getData();
			} catch (InterruptedException e) {
			}
		}
	}
}
