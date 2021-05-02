package gameSale;

public class User {
private int uniqueId;
private String firstName;
private String lastName;
private String nationalIdentity;
private String yearBirth;

public User() {
	
}

public User(int uniqueId, String firstName, String lastName, String nationalIdentity, String yearBirth) {
	super();
	this.uniqueId = uniqueId;
	this.firstName = firstName;
	this.lastName = lastName;
	this.nationalIdentity = nationalIdentity;
	this.yearBirth = yearBirth;
}

public int getUniqueId() {
	return uniqueId;
}

public void setUniqueId(int uniqueId) {
	this.uniqueId = uniqueId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getNationalIdentity() {
	return nationalIdentity;
}

public void setNationalIdentity(String nationalIdentity) {
	this.nationalIdentity = nationalIdentity;
}

public String getYearBirth() {
	return yearBirth;
}

public void setYearBirth(String yearBirth) {
	this.yearBirth = yearBirth;
}


}
