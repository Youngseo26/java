package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day01 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st ;
		
		int arr [] = new int[9];
		int sum = 0;
		int spyA = 0;
		int spyB = 0;
		
		for(int i = 0; i < arr.length; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			sum += arr[i];
		}
		
		Arrays.sort(arr);
		
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i + 1; j< arr.length; j++) {
				if(sum - arr[i] - arr[j] == 100) {
					spyA = i;
					spyB = j;
				}
			}
		}
		
		for(int i = 0; i <arr.length; i++) {
			if(i == spyA || i == spyB) continue;
			System.out.println(arr[i]);
		}
	}
}
