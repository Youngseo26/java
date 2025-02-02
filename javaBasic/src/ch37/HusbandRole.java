package ch37;

public interface HusbandRole {
	
	void takeCareWife(Wife wife);
	
	default void sayingILoveUEveryDay() {
		System.out.println("우리 와이프 사랑해애");
	};

	String getName();
}
