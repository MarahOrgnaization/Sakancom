package classes;

public class tenant {
	 private String name;
	 private String phone;
	 private int age;
	 private String major ;
	 private boolean Student ;
	 private String furniture= null ;
	 private String PayDate;
	 
    public String getPayDate() {
		return PayDate;
	}

	public void setPayDate(String payDate) {
		PayDate = payDate;
	}

	public boolean isPaid() {
		return paid;
	}

	public void setPaid(boolean paid) {
		this.paid = paid;
	}

	private boolean paid=false;
	public tenant(String name, String phone, int age, String major, boolean Student,String PayDate) {
		super();
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.major = major;
		this.Student = Student;
		
		this.PayDate=PayDate;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPhone() {
		return phone;
	}
	
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public boolean getIsStudent() {
		return Student;
	}
	
	public void setIsStudent(boolean isStudent) {
		Student = isStudent;
	}
	
	public String getFurniture() {
		return furniture;
	}
	
	public void setFurniture(String newFurniture) {
		furniture = newFurniture;
	}
	 
}