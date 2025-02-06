package ch47;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.Objects;

public class HashTest {

	public static String hashString(String input) {
		try {
			// MessageDigest 인스턴스 생성 (해시 알고리즘으로 SHA-256선택)
			MessageDigest digest = MessageDigest.getInstance("SHA-256");

			// 입력 문자열을 바이트 배열로 변환하여 해시 함수에 전달
			byte[] hashBytes = digest.digest(input.getBytes(StandardCharsets.UTF_8));

			// Base64로 인코딩하여 해시된 문자열 반환
			return Base64.getEncoder().encodeToString(hashBytes);
		} catch (NoSuchAlgorithmException e) {
			e.printStackTrace();
			return null;
		}
	}

	public static void main(String[] args) {
		String pw = "1qaz@WSX!";
		String hashPw = hashString(pw);
		System.out.println(pw);
		System.out.println(hashPw);
		
		//Data 검색을 위한 hash
		long hashCode = Objects.hashCode(pw);
		long hashCode2 = Objects.hashCode(2244);
		long hashCode3 = Objects.hashCode(new Customer("영서"));
		long hashCode4 = Objects.hashCode(new VipCustomer("Max"));
		
		
		System.out.println("Objects HashCode " + hashCode);
		System.out.println("Objects HashCode " + hashCode2);
		System.out.println("Objects HashCode Customer " + hashCode3);
		System.out.println("Objects HashCode VipCustomer " + hashCode4);
		
		Customer customer1 = new Customer("ID1", "DUDTJ");
		Customer customer2 =new Customer("ID2","DUDTJ" );
		
		long hashCode5 = Objects.hashCode(customer1);
		long hashCode6 = Objects.hashCode(customer2);
		
		System.out.println(hashCode5);
		System.out.println(hashCode6);
	}

}
