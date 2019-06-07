package COM.BAE.PersistenceRepository;

import java.util.HashMap;
import java.util.Map;

import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import COM.BAE.PersistenceDomain.TraineeAccount;
import COM.BAE.UTIL.JSONUtil;

public class TraineeMapRepository implements TraineeRepositoryInterface {

	Map<Integer, TraineeAccount> accountMap = new HashMap<Integer, TraineeAccount>();
	@PersistenceContext(unitName = "primary")
	private EntityManager manager;

	@Inject
	private JSONUtil util;

	@Override
	public String createTrainee(String name) {
		TraineeAccount newAccount = new JSONUtil().getObjectForJSON(name, TraineeAccount.class);
		accountMap.put(newAccount.getTraineeId(), newAccount);
		return "Account successfuly created";
	}

	@Override
	public String getAllTrainees() {
		return new JSONUtil().getJSONForObject(accountMap);
	}

	@Override
	public String getAnTrainee(int traineeID) {

		return util.getJSONForObject(manager.find(TraineeAccount.class, traineeID));

	}

	@Override
	public String updateTrainee(String name, int traineeID) {
		TraineeAccount traineeToUpdate = new JSONUtil().getObjectForJSON(name, TraineeAccount.class);
		accountMap.put(traineeID, traineeToUpdate);

		return "Account successfully updated";
	}

	@Override
	public String deleteTrainee(int traineeID) {
		accountMap.remove((Integer) traineeID);
		return "Account successfully removed";
	}

	public Map<Integer, TraineeAccount> getAccountMap() {
		return accountMap;
	}

	public void setAccountMap(Map<Integer, TraineeAccount> accountMap) {
		this.accountMap = accountMap;
	}
}
