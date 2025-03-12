package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Day10 {
	
	static int[][ ] APT = new int[15][15];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		make_APT();
		
		int T = Integer.parseInt(br.readLine());
		
		for(int x = 0; x < T; x++) {
			int k = Integer.parseInt(br.readLine());
			int n =  Integer.parseInt(br.readLine());
			sb.append(APT[k][n]).append("\n");
		}
		bw.write(sb + " ");
		bw.flush();
		bw.close();

	}

	private static void make_APT() {
		
		for(int i =0; i < 15; i++) {
			APT[i][1] = 1;
			APT[0][i] = i;
		}
		
		for(int a = 1; a < 15; a++  ) {
			for(int b = 2; b < 15; b++) {
				APT[a][b] = APT[a-1][b] + APT[a][b-1];
			}
		}
		
	}

}
