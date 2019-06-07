package COM.BAE.Maptests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import COM.BAE.PersistenceRepository.TraineeMapRepository;

public class tests {
	private TraineeMapRepository tmr;

	@Before
	public void setup() {
		tmr = new TraineeMapRepository();
	}

	@Test
	public void getAllAccountsTest() {

		assertEquals("{}", tmr.getAllTrainees());
	}

}
