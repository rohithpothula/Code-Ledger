package BuilderDesignPattern;

public class User {

	private String firstName;

	private String lastName;

	private String age;

	private String email;

	private String Address;

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAge() {
		return age;
	}

	public String getEmail() {
		return email;
	}

	public String getAddress() {
		return Address;
	}

	public User(UserBuilder userBuilder) {
		this.firstName = userBuilder.getFirstName();
		this.lastName = userBuilder.getLastName();
		this.age = userBuilder.getAge();
		this.Address = userBuilder.getAddress();
		this.email = userBuilder.getEmail();
	}

}
