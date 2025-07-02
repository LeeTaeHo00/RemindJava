package homework15_이태호;

public class Student extends Person{
	//필드
	private boolean stu;
	
	// 생성자
	public Student(String name, boolean stu) {
		super(name);
		this.setStu(stu);
	}
	
	// getter setter
	public void setStu(boolean stu) 
	{
		this.stu = stu;
	}
	
	public boolean getStu() 
	{
		return this.stu;
	}
	
	
	// 메소드
	void study() 
	{
		System.out.println(this.getName() + "이 공부합니다.");
	}

	@Override
	void introduce() {
		System.out.println(this.getName() + "은 학생입니다.");
	}
}
