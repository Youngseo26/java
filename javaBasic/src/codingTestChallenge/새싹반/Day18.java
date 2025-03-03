package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day18 {

	public static void main(String[] args) throws IOException {
		// 입력과 출력을 위한 객체 생성
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();

		int n = Integer.parseInt(br.readLine());

		// 피보나치 결과를 StringBuilder에 추가
		sb.append(fibo(n)).append("\n");

		// BufferedWriter로 출력
		bw.write(sb.toString());

		// 자원 해제
		bw.flush();
		bw.close();
		br.close();
	}

	public static int fibo(int num) {
		int[] arr = new int[46];
		arr[0] = 0;
		arr[1] = 1;

		for (int i = 2; i <= num; i++) {
			if (arr[i] != 0) {
				return arr[i];
			} else {
				arr[i] = arr[i - 1] + arr[i - 2];
			}
		}
		return arr[num];
	}
}
