package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day03  {
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int X = Integer.parseInt(br.readLine()); // 물건 가격들의 총 합
		int N = Integer.parseInt(br.readLine()); // 물건의 갯 수
		int sum = 0;
		
		for(int i = 0; i < N; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine()); //공백기준으로 나눌 수 있게 
			int a = Integer.parseInt(st.nextToken()); //공백 기준 앞에 해당하는 수
			int b = Integer.parseInt(st.nextToken()); //공백 기준 뒤에 해당하는 수
			sum+=a*b; // 가격 * 갯수
		}
		
		if(sum==X) {
			System.out.println("Yes"); // 물건들의 총합과 같을 경우
		} else {
			System.out.println("No"); //물건들의 총합과 다를 경우
		}
	}
}
