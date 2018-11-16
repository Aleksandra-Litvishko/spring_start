package di_continuation;

import org.springframework.beans.factory.annotation.Autowired;

public class Instrumentalist implements Performer {
	public Instrumentalist() {
	}
	
	private String song;
	
	public void setSong(String song) {
		this.song = song;
	}
	
	public String getSong() {
		return song;
	}
	
	private Instrument instrument;
	
    @Autowired  //������������ � <context:annotation-config/> � XML ������������ ��� ����-���������� ����������� ���������
	public void setInstrument(Instrument instrument) {
		this.instrument = instrument;
	}
	
	public void perform() {
		System.out.println("Playing " + song + " : ");
		instrument.play();
	}
}
