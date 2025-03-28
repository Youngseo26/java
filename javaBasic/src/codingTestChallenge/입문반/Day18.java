package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Day18 {
	
	static int n= 0;
	static int answer = 0;
	static boolean check[];

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		int m = Integer.parseInt(br.readLine());
		List<Integer> list[] = new ArrayList[n+1];
		for(int i = 1; i< list.length; i++) {
			list[i] = new ArrayList<>();
		}
		for(int i =0; i < m; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			list[a].add(b);
			list[b].add(a);
		}
		check = new boolean[n+1];
		check[1] = true;
		dfs(1, list, 0);
		for(int i =2; i < check.length; i++) {
			if(check[i]) answer++;
		}
		System.out.println(answer);
	}

	private static void dfs(int num, List<Integer>[] list, int depth) {
		if(depth ==2) {
			return;
		}
		for(int i =0; i < list[num].size(); i++) {
			int next = list[num].get(i);
			check[next] = true;
			dfs(next, list, depth+1);
		}
	}

}
