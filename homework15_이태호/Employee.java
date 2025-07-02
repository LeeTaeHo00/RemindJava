package homework15_이태호;

public class Employee extends Person{

	// 생성자
	public Employee(String name) {
		super(name);
	}
	
	// 메소드
	public void work() 
	{
		System.out.println("업무를 처리중 입니다.");
	}

	@Override
	void introduce() {
		System.out.println("저의 이름은 " + this.getName() + "이고 회사원 입니다.");
	}
}
