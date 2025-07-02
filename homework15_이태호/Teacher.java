package homework15_이태호;

public class Teacher extends Person{

	// 생성자
	public Teacher(String name) {
		super(name);
	}
	
	// 메소드
	public void teach() 
	{
		System.out.println(this.getName() + "이 가르칩니다");
	}

	@Override
	void introduce() {
		System.out.println("저는 선생님 입니다.");
	}
}
