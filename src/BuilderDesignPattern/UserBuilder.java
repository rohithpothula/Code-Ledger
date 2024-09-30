package BuilderDesignPattern;

public class UserBuilder {
	
private String firstName;
	
	private String lastName;
	
	private String age;
	
	private String email;
	
	private String address;
	
	public UserBuilder setFirstName(String firstName) {
		this.firstName=firstName;
		return this;
	}
	
	public UserBuilder setLastName(String lastName) {
		this.lastName=lastName;
		return this;
	}
	
	public UserBuilder setAge(String age) {
		this.age=age;
		return this;
	}
	
	public UserBuilder setEmail(String email) {
		this.email=email;
		return this;
	}
	public UserBuilder setAddress(String address) {
		this.address=address;
		return this;
	}
	
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
		return address;
	}

	public User  build() {
		User user = new User(this);
		return user;
	}
	
}
