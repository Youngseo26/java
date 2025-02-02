package ch37;

public abstract class FamilyMan implements FamilyRole{
	
	@Override
	public void educateBaby(Baby baby) {
		String name = baby.getName();
		System.out.println(name + "을 열심히 가르치고 있습니다.");
	}

	@Override
	public void takeCareWife(Wife wife) {
		String name = wife.getName();
		System.out.println("사랑하는 아내 " + name + "를 성심성의껏 케어합니다.");
	}
}
