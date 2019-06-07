package COM.BAE.PersistenceDomain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ClassroomAccount {

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int ClassroomID;
	@Column
	private String nameOfTrainer;

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
