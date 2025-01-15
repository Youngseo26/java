package codingTestChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day10 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int [] arr = new int[5];
		int sum = 0;
		
		for(int i =0; i < 5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			arr[i] = Integer.parseInt(st.nextToken());
			sum+=arr[i];
		}
		
		Arrays.sort(arr);
		
		int median = arr[arr.length/2];
		int avg = sum/5;
		
		System.out.println(avg);
		System.out.println(median);
	}
}
