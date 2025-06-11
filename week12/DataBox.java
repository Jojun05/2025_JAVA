package week12;

public class DataBox {
	// 공유 객체
	private String data;

	public synchronized String getData() throws InterruptedException {
		// 소비자가 data 를 읽는 메소드
		// 읽을 data 가 있는 경우에만 읽어야 함
		// data 가 있는지 확인
		if (this.data == null) {
			// data 가 없는 경우 => 읽으면 안됨
			wait();
		}
		// dataBox에 data 가 있는 경우
		String returnValue = data;
		System.out.println("Consumer Thread가 읽은 데이터 :" + returnValue);
		// data 를 읽고 나서 data 를 비워주기
		this.data = null;
		// 소비자가 data 를 읽는 동안, 생산자가 wait()
		// 생산자가 data 를 쓸 수 있도록 꺠우기 => notify()
		notify();
		return returnValue;
	}

	public void setData(String data) throws InterruptedException {
		// 생산자가 data 를 쓰는 메소드
		// DataBox에 data 가 없어야만 쓰기 가능
		// data 가 있는지 없는지 확인
		if (this.data != null) {
			// data 가 있는 경우
			wait();
		}
		// data 가 없는 경우 쓰기 가능
		this.data = data;
		System.out.println("Producer Thread가 생성한 데이터 : " + data);
		// 생산자가 data 를 쓰는 동안 소비자는 wait()
		// 소비자가 읽을 수 있도록 깨우기 => notify()
		notify();
	}
}
