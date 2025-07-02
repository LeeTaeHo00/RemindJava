package homework15_이태호;

public class Main {

	public static void main(String[] args) {
		
		Person person = new Person("아무개");
		Person student = new Student("이태호", true);
		Person teacher = new Teacher("장성주");
		Person employee = new Employee("장성재");
		
		person.setAge(20);
		person.setBirthDay("12월 20일");
		
		person.introduce();		
		student.introduce();
		teacher.introduce();
		employee.introduce();	
		
		System.out.println();
		
		// printInfo 출력
		Main.printInfo(person);
		Main.printInfo(student);
		Main.printInfo(teacher);
		Main.printInfo(employee);
	}
	
	static void printInfo(Person person) 
	{
		if(person instanceof Student) 
		{
			((Student)person).study();
		}
		
		else if(person instanceof Teacher) 
		{
			((Teacher)person).teach();
		}
		
		else if(person instanceof Employee) 
		{
			((Employee)person).work();
		}
		
		else 
		{
			System.out.println("직업이 없습니다.");
		}
	}

}
