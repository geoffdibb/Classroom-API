package COM.BAE.PersistenceDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class TraineeAccount {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int traineeId;
	@Column
	private String traineeName;
	@Column
	private int classroomID;

	public TraineeAccount() {

	}

	public TraineeAccount(int traineeId, String traineeName, int classroomID) {
		super();
		this.traineeId = traineeId;
		this.traineeName = traineeName;
		this.classroomID = classroomID;
	}

	public int getTraineeId() {
		return traineeId;
	}

	public void setTraineeId(int traineeId) {
		this.traineeId = traineeId;
	}

	public String getTraineeName() {
		return traineeName;
	}

	public void setTraineeName(String traineeName) {
		this.traineeName = traineeName;
	}

	public int getClassroomID() {
		return classroomID;
	}

	public void setClassroomID(int classroomID) {
		this.classroomID = classroomID;
	}
}
