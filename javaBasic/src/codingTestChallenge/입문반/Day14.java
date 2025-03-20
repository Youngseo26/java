package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day14 {

	public static void main(String[] args) throws  IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());

		int[] student = new int[N];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			student[i] = Integer.parseInt(st.nextToken());
		}

		int m = 0;
		int cnt = 0;
		int tmp = 0;
		boolean flag = false;
		boolean[] isVisited = new boolean[N + 1];

		while (true) {
			if (student[tmp] == K) { // 보성이 번호에 걸리는경우 문제예시에서는 인덱스1이 3(보성)을 가리킬때
				cnt++;
				break;
			} else if (isVisited[student[tmp]]) { // k없는 싸이클생성
				flag = true;
				break;
			} else {
				tmp = student[tmp];
				isVisited[tmp] = true;
				cnt++;
			}
		}
		if (flag) {
			System.out.println(-1);
		} else {
			System.out.println(cnt);
		}

	}
}
