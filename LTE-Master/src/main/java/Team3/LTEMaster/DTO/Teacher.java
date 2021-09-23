package Team3.LTEMaster.DTO;

public class Teacher {
	private String teacherId;
	private String teacherName;
	private String contractType;
	private int hourlyRate;
	
	
	public Teacher() {}
	
	public Teacher(String teacherId, String teacherName, String contractType,int hourlyRate ) {
		this.teacherId = teacherId;
		this.teacherName = teacherName;
		this.contractType = contractType;
		this.hourlyRate = hourlyRate;
	}

	public String getTeacherId() {
		return teacherId;
	}

	public void setTeacherId(String teacherId) {
		this.teacherId = teacherId;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public String getContractType() {
		return contractType;
	}

	public void setContractType(String contractType) {
		this.contractType = contractType;
	}

	public int getHourlyRate() {
		return hourlyRate;
	}

	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Teacher [teacherId=");
		builder.append(teacherId);
		builder.append(", teacherName=");
		builder.append(teacherName);
		builder.append(", contractType=");
		builder.append(contractType);
		builder.append(", hourlyRate=");
		builder.append(hourlyRate);
		builder.append("]");
		return builder.toString();
	}



}
