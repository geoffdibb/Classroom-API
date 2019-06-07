package COM.BAE.Maptests;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import COM.BAE.PersistenceDomain.TraineeAccount;
import COM.BAE.PersistenceRepository.TraineeMapRepository;

public class tests {

	private TraineeAccount acc1 = new TraineeAccount(1, "Jo", 2);
	private TraineeAccount acc2 = new TraineeAccount(2, "Mo", 2);
	private TraineeAccount acc3 = new TraineeAccount(3, "Go", 2);

	private COM.BAE.UTIL.JSONUtil jsonUtil = new COM.BAE.UTIL.JSONUtil();

	private TraineeMapRepository tmr;

	@Before
	public void setup() {
		tmr = new TraineeMapRepository();
	}

	@Test
	public void getAllTraineeAccountsTest() {

		assertEquals("{}", tmr.getAllTrainees());
	}

	@Test
	public void testCreateTrainee() {
		String accToCreate = jsonUtil.getJSONForObject(acc1);
		System.out.println(accToCreate);
		assertEquals(tmr.createTrainee(accToCreate), "Account successfuly created");
		assertEquals(tmr.getAccountMap().size(), 1);
	}

	@Test
	public void add2TraineeAccountsTest() {
		String accToCreate = jsonUtil.getJSONForObject(acc1);
		System.out.println(accToCreate);
		assertEquals(tmr.createTrainee(jsonUtil.getJSONForObject(acc1)), "Account successfuly created");

		String accToCreate2 = jsonUtil.getJSONForObject(acc1);
		System.out.println(accToCreate2);
		assertEquals(tmr.createTrainee(jsonUtil.getJSONForObject(acc2)), "Account successfuly created");

		assertEquals(tmr.getAccountMap().size(), 2);
	}

	@Test
	public void removeTraineeAccountTest() {

		tmr.getAccountMap().put(1, acc1);
		tmr.deleteTrainee(1);
		assertEquals(false, tmr.getAccountMap().containsKey(1));

	}

	@Test
	public void remove2TraineeAccountsTest() {
		tmr.getAccountMap().put(1, acc1);
		tmr.getAccountMap().put(2, acc2);

		tmr.deleteTrainee(1);
		assertEquals(false, tmr.getAccountMap().containsKey((Integer) 1));

		tmr.deleteTrainee(2);
		assertEquals(false, tmr.getAccountMap().containsKey((Integer) 2));

	}

	@Test
	public void remove2TraineeAccountAnd1ThatDoesntExist() {
		tmr.getAccountMap().put(1, acc1);
		tmr.getAccountMap().put(2, acc2);

		tmr.deleteTrainee(1);
		assertEquals(false, tmr.getAccountMap().containsKey((Integer) 1));

		tmr.deleteTrainee(3);
		assertEquals(false, tmr.getAccountMap().containsKey((Integer) 3));

	}

	// @Test
	// public void updateAccountTest() {
	//
	// tmr.getAccountMap().put(1, acc1);
	// tmr.updateTrainee("{\"traineeId\":1,\"traineeName\":\"Jo\",\"classroomID\":2}",
	// 1);
	// assertEquals("Jo", tmr.getAccountMap().get(1));
	// }
}
