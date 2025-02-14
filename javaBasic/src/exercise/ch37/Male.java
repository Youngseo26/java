package exercise.ch37;

public class Male extends FamilyMan implements FamilyRole, EmployeeRole {
	// 속성
	private String name;
	private int age;
	private String job;

	public Male(String name) {
		super();
		this.name = name;
	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public void communicateWithCompanian(EmployeeRole employeeRole) {
		String name = employeeRole.getName();
		System.out.println(name + "과 협업합니다.");
	}

}
