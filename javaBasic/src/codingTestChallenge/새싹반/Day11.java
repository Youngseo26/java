package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day11 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");

		int N = Integer.parseInt(st.nextToken()); // 카드 갯수
		int M = Integer.parseInt(st.nextToken()); // 넘지않아야하는

		int[] arr = new int[N];

		st = new StringTokenizer(br.readLine(), " ");
		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}

		int result = search(arr, N, M);
		System.out.println(result);
	}
	
	static int search(int[] arr, int N, int M) {
		int result = 0;
		for (int i = 0; i < N; i++) {
			for (int j = i + 1; j < N; j++) {
				for (int k = j + 1; k < N; k++) {
					int sum = arr[i] + arr[j] + arr[k];

					if (result < sum && sum <= M) {
						result = sum;
					}
				}
			}
		}
		return result;
	}
}
