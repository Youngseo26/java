package ch57;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializeExampleTest {

	public static void main(String[] args) {
		//직렬화
		
		Person person = new Person("영서", "Female", 29, "Korea", "null");
		
		byte[] serializedData = null;
		try(ByteArrayOutputStream bao = new ByteArrayOutputStream();
				ObjectOutputStream objectOutputStream = new ObjectOutputStream(bao);) {
			objectOutputStream.writeObject(person);
			objectOutputStream.flush();
			
			serializedData = bao.toByteArray();
			System.out.println(new String(serializedData));
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try(ByteArrayInputStream bio = new ByteArrayInputStream(serializedData);
				ObjectInputStream objectInputStream = new ObjectInputStream(bio); ) {
			Person person1 = (Person) objectInputStream.readObject();
			System.out.println(person1);
			
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

}
