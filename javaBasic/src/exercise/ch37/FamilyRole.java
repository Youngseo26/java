package exercise.ch37;

public interface FamilyRole extends FatherRole, HusbandRole{

	@Override
	default void sayingILoveUEveryDay() {
		FatherRole.super.sayingILoveUEveryDay();
		HusbandRole.super.sayingILoveUEveryDay();
	}

}
