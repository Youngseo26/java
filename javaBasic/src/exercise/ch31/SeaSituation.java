package exercise.ch31;

public class SeaSituation {

	public static void main(String[] args) {
		
		Fish fish1 = new Fish();
		fish1.setGender("M");
		fish1.setLeavingSea("East Sea");
		fish1.setHavingPoison(false);
		
		FishChild fish2 = new FishChild();
		fish2.setGender("F");
		fish2.setLeavingSea("West Sea");
		fish2.setHavingPoison(false);
		
		fish2.becomeDanger();
		System.out.println("독성여부: " + fish2.isHavingPoison());
		
		fish1.eat("새우");
		fish2.eat("새우");
		//System.out.println(fish2.isEatable());
	//	fish1.digging();
	}

}