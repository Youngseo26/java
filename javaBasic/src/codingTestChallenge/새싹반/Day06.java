package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day06 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());

		int[][] arr1 = new int[N][M];
		int[][] arr2 = new int[N][M];
		int[][] result = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine()); // 한 줄 입력 공백기준으로 나눔
			for (int j = 0; j < M; j++) {
				arr1[i][j] = Integer.parseInt(st.nextToken()); // 나눈 값 정수변환해서 대입
			}
		}

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				arr2[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				result[i][j] = arr1[i][j] + arr2[i][j];
			}
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				bw.write(result[i][j] + ""); // 값을 문자열로 변환 후 작성
				if (j < M - 1) { // 열 사이에 공백 추가
					bw.write(" ");
				}
			}
			bw.write("\n"); // 행이 끝날 때 줄바꿈 추가_
		}

		bw.flush(); // 출력 버퍼 비우기
		bw.close(); // 스트림 닫기
	}
}