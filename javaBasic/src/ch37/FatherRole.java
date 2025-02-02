package ch37;

public interface FatherRole {
	void educateBaby(Baby baby);
	
	default void sayingILoveUEveryDay() {
		System.out.println("으리 아가 사랑해");
	};
}
