package ch44;

public class StringBuilderTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//+=
		String str = "";
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < 5000; i++) {
			str +="cat";
		}
		System.out.println(str);
		
		long endTime = System.currentTimeMillis();
		
		System.out.println("running Time: " + (endTime - startTime) + "ms");
		
		long startTime2 = System.currentTimeMillis();
		
		StringBuilder sb = new StringBuilder();
		
		for(int i =0; i < 5000; i++) {
			sb.append("cat");
		}
		String output = sb.toString();
		System.out.println(output);
		
		long endTime2 = System.currentTimeMillis();
		
		System.out.println("StringBuilder running Time: " + (endTime2 - startTime2) + "ms");
	}

}
