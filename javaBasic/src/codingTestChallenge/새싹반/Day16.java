package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Day16 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		HashSet<String>map = new HashSet<String>();
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
			st =new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String log = st.nextToken();
			
			if(log.equals("leave")) {
				map.remove(name);
			} else {
				map.add(name);
			}
		}
		
		ArrayList<String> arr = new ArrayList<String>(map);
		
		Collections.sort(arr,Collections.reverseOrder());
		
		for(int i=0; i<arr.size();i++) {
			bw.write(arr.get(i) + "\n");
		}
		bw.flush();
		bw.close();
	}

}
