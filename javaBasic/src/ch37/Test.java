package ch37;

public class Test {

	public static void main(String[] args) {
		// Male 3개 남편, 아빠, 회사원
		HusbandRole male = new Male("명곤");
		Wife wife = new Female("영서");

		male.sayingILoveUEveryDay();
		male.takeCareWife(wife);
		
		//FatherRole father = new Male("명곤");
		FatherRole father = (FatherRole) male;
		Baby baby = new Baby("아가");
		
		father.sayingILoveUEveryDay();
		father.educateBaby(baby);
		
		EmployeeRole employee = (EmployeeRole) father;
		EmployeeRole others = new Female("아이폰");
		
		employee.communicateWithCompanian(others);
		
	}

}
