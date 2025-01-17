package codingTestChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day12 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int N = Integer.parseInt(br.readLine());
		br.close();

		int M = 0; // 생성자 없으면 0 출력

		for (int i = 1; i <= N; i++) {
			int num = i; // i값
			int res = 0; // 각 자리 수 더한 값을 저장하는 변수

			while (num > 0) {
				res += num % 10; //N의 마지막 자릿수를 res에 더함
				num /= 10; // 숫자를 10으로 나눠 마지막 자릿 수 제거
			} 
			
			//ex) num =123
			//     123 % 10 = 3 -> res = 3
			//     123 / 10 = 12  -> 첫번째 턴 끝
			//     12 % 10 = 2 => res = 5
			//     12 / 10 = 1 -> 두번째 턴 끝

			if (res + i == N) { //위에서 각 자릿수 더해서 나온 res와 i를 더해서 N이면 생성자 i를 M에 넣고 출력
				M = i;
				break;
			}
		}
		bw.write(M + "\n");
		bw.flush();
		bw.close();
	}
}
