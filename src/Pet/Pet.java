package Pet;

public class Pet {

String diagNo;
String doctor;
public Pet(String diagNo, String doctor, String status, String name, String id, Boolean gender, Boolean nuet,
		String birth_date, String weight, String phone, String hostName) {
	super();
	this.diagNo = diagNo;
	this.doctor = doctor;
	this.status = status;
	this.name = name;
	this.id = id;
	this.gender = gender;
	this.nuet = nuet;
	this.birth_date = birth_date;
	this.weight = weight;
	this.phone = phone;
	this.hostName = hostName;
}
public String getStatus() {
	return status;
}
public void setStatus(String status) {
	this.status = status;
}
String status;
	public String getDiagNo() {
	return diagNo;
}
public void setDiagNo(String diagNo) {
	this.diagNo = diagNo;
}
public String getDoctor() {
	return doctor;
}
public void setDoctor(String doctor) {
	this.doctor = doctor;
}
	public Pet(String diagNo, String doctor, String name, String id, Boolean gender, Boolean nuet, String birth_date,
		String weight, String phone, String hostName) {
	super();
	this.diagNo = diagNo;
	this.doctor = doctor;
	this.name = name;
	this.id = id;
	this.gender = gender;
	this.nuet = nuet;
	this.birth_date = birth_date;
	this.weight = weight;
	this.phone = phone;
	this.hostName = hostName;
}
	String name;
	String id;
	Boolean gender;
	Boolean nuet;
	String birth_date;
	String weight;
	String phone;
	String hostName;
	public Pet(String name, String id, Boolean gender, Boolean nuet, String birth_date, String weight, String phone,
			String hostName) {
		super();
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.nuet = nuet;
		this.birth_date = birth_date;
		this.weight = weight;
		this.phone = phone;
		this.hostName = hostName;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Boolean getGender() {
		return gender;
	}
	public void setGender(Boolean gender) {
		this.gender = gender;
	}
	public Boolean getNuet() {
		return nuet;
	}
	public void setNuet(Boolean nuet) {
		this.nuet = nuet;
	}
	public String getBirth_date() {
		return birth_date;
	}
	public void setBirth_date(String birth_date) {
		this.birth_date = birth_date;
	}
	public String getWeight() {
		return weight;
	}
	public void setWeight(String weight) {
		this.weight = weight;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getHostName() {
		return hostName;
	}
	public void setHostName(String hostName) {
		this.hostName = hostName;
	}
	
}
