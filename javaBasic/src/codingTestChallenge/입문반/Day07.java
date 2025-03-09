package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Day07 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(br.readLine());
		int[][] arr = new int[n][2];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = Integer.parseInt(st.nextToken()); //키
			arr[i][1] = Integer.parseInt(st.nextToken()); //몸무게
		}
		for(int i = 0; i < n; i++) {
			int rank = 1; // rank는 1부터
			for(int  j = 0; j < n; j++) {
				if(i  == j) continue;  //같은 사람은 비교가 필요없음
				if(arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1]) {
					rank++;
				}
			}
			sb.append(rank).append(" ");
		}
		bw.write(sb + " ");
		bw.flush();
		bw.close();
	}
}
