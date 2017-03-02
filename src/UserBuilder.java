
public class UserBuilder {
	private final String firstName;
	private final String lastName;
	private int age;
	private String phone;
	private String address;
	
	private UserBuilder(UserBuilderbuilder builder){
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
	}
	
	public String getFirstName(){
		return firstName;
	}
	
	public String getLastName(){
		return lastName;
	}
	
	public int getAge(){
		return age;
	}
	
	public String getPhone(){
		return phone;
	}
	
	public String getAddress(){
		return address;
	}
	
	public static class UserBuilderbuilder{
		private final String firstName;
		private final String lastName;
		private int age = 0;
		private String phone = "";
		private String address;
		
		public UserBuilderbuilder(String firstName, String lastName){
			this.firstName = firstName;
			this.lastName = lastName;
		}
		
		public UserBuilderbuilder age(int age){
			this.age = age;
			return this;
		}
		
		public UserBuilderbuilder phone(String phone){
			this.phone = phone;
			return this;
		}
		
		public UserBuilderbuilder address(String address){
			this.address = address;
			return this;
		}
		
		public UserBuilder build(){
			return new UserBuilder(this);
		}
	}
}
