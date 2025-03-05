package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Day03 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int n = Integer.parseInt(br.readLine());
		String[] arr = new String[n];

		for (int i = 0; i < n; i++) {
			arr[i] = br.readLine();
		}
		String[] uniqueArr = Arrays.stream(arr).distinct().toArray(String[]::new); //중복제거 arr -> uniqueArr

		Arrays.sort(uniqueArr, new Comparator<String>() {
			@Override
			public int compare(String s1, String s2) {
				if (s1.length() == s2.length()) {
					return s1.compareTo(s2);
				}
				return s1.length() - s2.length();
			}
		});

		StringBuilder sb = new StringBuilder();
		for (int j = 0; j < uniqueArr.length; j++) {
			sb.append(uniqueArr[j]).append("\n");
		}
		System.out.print(sb);
	}
}
