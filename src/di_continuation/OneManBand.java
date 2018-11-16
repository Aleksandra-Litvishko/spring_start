package di_continuation;

import java.util.Collection;

public class OneManBand implements Performer {
	public OneManBand() {		
	};
	
	private Collection<Instrument> instruments;
	
	public void setInstruments(Collection<Instrument> instruments) {
		this.instruments = instruments;
	}
	
	public void perform() {
		for(Instrument instrument: instruments)  {
			instrument.play();
		}
	}
}
