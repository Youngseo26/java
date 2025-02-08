package ch53;

public class OuterClassTest1 {

	public static void main(String[] args) {
		//일반 중첩 클래스
		OuterClass outClass = new OuterClass(20);
		OuterClass.InnerClass innerClass = outClass.new InnerClass(10);
		
		innerClass.display();

		//정적 중첩클래스
		OuterStaticClass outerStaticClass = new OuterStaticClass(30);
		OuterStaticClass.InnerClass innerClass2 = new OuterStaticClass.InnerClass(40);
		
		innerClass2.display();
	}

}
