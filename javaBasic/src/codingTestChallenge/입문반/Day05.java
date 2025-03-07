package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day05 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		int[] score = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			score[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(score);
		bw.write(score[n-k] + ""); // 작은 수 -> 큰 수로 정렬했으므로 응시자수 - 커트라인 하면 해당 커트라인 점수가 된다.
		bw.flush();
		bw.close();
		
	}
}
