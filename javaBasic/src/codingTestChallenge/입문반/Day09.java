package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day09 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		
		long sum = 1;
		long fiboPrev = 0;
		long fiboCurr = 1;
		
		for(int i = 1; i < n; i ++) {
			sum = fiboPrev + fiboCurr;
			fiboPrev = fiboCurr;
			fiboCurr = sum;		
		}
		
		System.out.println(sum);
	}
}
