package gameProjectDemo.entities.concretes;

public class Gamer {
	private int gamerId;
	private String identityNumber;
	private String name;
	private String lastName;
	private int dateOfBirth;
	
	public Gamer() {
		super();
	}

	public Gamer(int gamerId, String identityNumber, String name, String lastName, int dateOfBirth) {
		super();
		this.gamerId = gamerId;
		this.identityNumber = identityNumber;
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	
	
	
	
}
