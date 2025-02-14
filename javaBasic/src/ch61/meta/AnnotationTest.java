package ch61.meta;

public class AnnotationTest {

	public static void main(String[] args) {
		
		
		Myclass myObj = new Myclass();
		
		AnnotationUtils.executeMethodsByRepeatAnnotation(myObj);
	}

}
