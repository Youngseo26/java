package ch44;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ClassTest {

	public static void main(String[] args) throws  InvocationTargetException, InstantiationException, IllegalAccessException, IllegalArgumentException, SecurityException, NoSuchMethodException{

		Customer customer = new Customer("영서");
		Class clazz = customer.getClass();
		Class clazz2 = Customer.class; //위 아래 둘다 같은 거임
		
//		Constructor[] constructors = clazz.getConstructors();
//		for(Constructor constructor: constructors) {
//			System.out.println(constructor); // 유틸리티 클래스
//		}
//		
//		Method[] methods = clazz.getMethods();
//		for(Method method: methods) {
//			System.out.println(method);
//		}
//		
//		Field[] fields = clazz.getFields();
//		for(Field field: fields) {
//			System.out.println(field);
		//}  //출력안됨 protected로 정의되어서
		
		Customer customer2 = (Customer) clazz.getConstructor(String.class).newInstance("포스트잇"); //NoSuchMethodExeption났던 이유 Customer의 name만 들어간 메소드 public 아니었음
		System.out.println(customer2);
	}
}

//java class 클래스 사용하는 이ㅠㅇ
//java reflection 기술과 같이 쓰임
//많은 자바 백엔드 기술의 근간
