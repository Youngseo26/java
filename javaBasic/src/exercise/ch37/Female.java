package exercise.ch37;

public class Female implements EmployeeRole, Wife {
	// 속성
	private String name;
	private int age;
	private String job;

	public Female(String name) {
		super();
		this.name = name;
	}

	@Override
	public void communicateWithCompanian(EmployeeRole employeeRole) {
		String name = employeeRole.getName();
		System.out.println(name + "과 협업합니다.");
	}

	@Override
	public void takeCareHusband(HusbandRole husband) {
		String name = husband.getName();
		System.out.println("사랑하는 남편 " + name + "를 성심성의껏 케어합니다.");
	}

	@Override
	public String getName() {
		return this.name;
	}
}
