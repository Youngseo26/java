package codingTestChallenge.새싹반;

import java.util.Arrays;
import java.util.Scanner;

public class Day05 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int N = sc.nextInt();

		int[] arr = new int[N];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		Arrays.sort(arr);
		
		int min = arr[0];
		int max = arr[arr.length-1];
		
		System.out.println(min + " " + max);

	}
}
