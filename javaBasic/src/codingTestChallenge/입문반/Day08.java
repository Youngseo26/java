package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day08 {
	static int[][] bingo;
	static int bingoCnt = 0;
	static int turn = 1;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		bingo =  new int[5][5];

		for (int i = 0; i < 5; i++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int j = 0; j < 5; j++) {
				bingo[i][j] = Integer.parseInt(st.nextToken()); // 빙고판 입력 받기
			}
		}

		for (int a = 0; a < 5; a++) {
			st = new StringTokenizer(br.readLine(), " ");
			for (int b = 0; b < 5; b++) {
				int num = Integer.parseInt(st.nextToken()); //사회자가 부른 수

				for (int i = 0; i < 5; i++) {
					for (int j = 0; j < 5; j++) {
						if (bingo[i][j] == num) {
							bingo[i][j] = 0;  //사회자가 부른 수 0으로 만들기
						}
					}
				}

				rowCheck(); //가로
				columnCheck(); //세로
				diagonal1(); //좌상우하 대각선
				diagonal2(); //우상좌하 대각선

				if (bingoCnt >= 3) { //3빙고시 출력
					System.out.println(turn); 
					return;
				}
				
				bingoCnt = 0;
				turn++;
			}
		}
	}

	private static void rowCheck() {
		for (int i = 0; i < 5; i++) {
			int zeroCnt = 0;
			for (int j = 0; j < 5; j++) {
				if (bingo[i][j] == 0) { //사회자가 불러서 0으로 만들 수 카운드
					zeroCnt++;
				}
				if (zeroCnt == 5) { //0이 5개면 빙고
					bingoCnt++;
					break;
				}
			}
		}
	}

	private static void columnCheck() {
		for (int i = 0; i < 5; i++) {
			int zeroCnt = 0;
			for (int j = 0; j < 5; j++) {
				if (bingo[j][i] == 0) {
					zeroCnt++;
				}
				if (zeroCnt == 5) {
					bingoCnt++;
					break;
				}
			}
		}
	}

	private static void diagonal1() {
		int zeroCnt = 0;
		for (int i = 0; i < 5; i++) {
			if (bingo[i][i] == 0) {
				zeroCnt++;
			}
			if (zeroCnt == 5) {
				bingoCnt++;
				break;
			}
		}
	}

	private static void diagonal2() {
		int zeroCnt = 0;
		for(int i = 0; i < 5; i ++) {
			if(bingo[i][4-i] == 0) {
				zeroCnt++;
			}
			if(zeroCnt == 5) {
				bingoCnt++;
				break;
			}
		}
	}
}
