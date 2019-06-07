package COM.BAE.PersistenceDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ClassroomAccount {

	@Id
	private String nameOfTrainer;
	@Column
	private int ClassroomID;

	public ClassroomAccount() {
	}

	public ClassroomAccount(int classroomID) {
		super();
		ClassroomID = classroomID;
	}

	public int getClassroomID() {
		return ClassroomID;
	}

	public void setClassroomID(int classroomID) {
		ClassroomID = classroomID;
	}

	public String getNameOfTrainer() {
		return nameOfTrainer;
	}

	public void setNameOfTrainer(String nameOfTrainer) {
		this.nameOfTrainer = nameOfTrainer;
	}
}
