package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Day17 {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		HashMap<String, Integer> map = new HashMap<>();
		
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		for(int i = 0; i < n; i++) {
			map.put(st.nextToken(), 0);
		}
		
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for(int j = 0; j < m; j++  ) {
			if(map.get(st.nextToken()) != null) {
				sb.append("1" + " ");
			} else {
				sb.append("0" + " ");
			}
		}
		bw.write(sb.toString());
		bw.flush();
		bw.close();
	}
}
