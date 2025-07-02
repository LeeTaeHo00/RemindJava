package homework15_이태호;

public class Person {
	// 필드
	private String name;
	private int age;
	private String birthDay;
	// 생성자
	public Person(String name) {
		this.setName(name);
	}
	
	// getter setter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getBirthDay() {
		return birthDay;
	}
	public void setBirthDay(String birthDay) {
		this.birthDay = birthDay;
	}
	
	
	
	// 메소드
	void introduce() 
	{
		System.out.println(getName() + ", " + getAge() + "살 입니다");
	}
}
