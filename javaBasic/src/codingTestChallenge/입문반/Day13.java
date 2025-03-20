package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Day13 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= T; i++) {
			int answer = 0;
			int size = Integer.parseInt(br.readLine());
			int [] arr = new int[size+1];
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j = 1; j < arr.length; j++ ) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			boolean visit[] = new boolean[size+1];
			for(int x = 1; x< arr.length; x++) {
				if(!visit[x]) {
					visit[x] = true;
					int go = arr[x];
					while(true) {
						if(visit[go]) {
							answer++;
							break;
						}
						visit[go] = true;
						go = arr[go];
					}
				}
			}
			System.out.println(answer);
		}
	}
}
