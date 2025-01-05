package ch32.fish;

public class SeaSituation {

	public static void main(String[] args) {

		FishChild fishChild = new FishChild();
		fishChild.setGender("M");
		fishChild.setEatable(true);
		fishChild.setLeavingSea("East Sea");
		fishChild.setHavingPoison(false);
		
		fishChild.printmyInfo();
		
		//생성자 오버로딩
		FishChild fishChild2 = new FishChild("F", true, "West Sea");
		fishChild2.printmyInfo();
		fishChild2.becomeDanger();
		fishChild2.printmyInfo();
		
	}

}