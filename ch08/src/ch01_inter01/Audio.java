package ch01_inter01;

public class Audio {
//�ʵ�
	private int volume;
	static final int MAX_VOLUME = 10;
	static final int MIN_VOLUME = 0;
	
	
	public void turnOn() {
		System.out.println("Audio�� �մϴ�");
	}
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume > MAX_VOLUME) {
			volume = MAX_VOLUME;
		}else if (volume > MIN_VOLUME) {
			volume = MIN_VOLUME;
		}
		System.out.println("���� Audio ����");
	}
	
}
