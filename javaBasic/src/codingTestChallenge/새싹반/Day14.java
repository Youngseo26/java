package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Day14 {
	
	static Deque<Integer> queue = new LinkedList<Integer>();
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			String str = st.nextToken();
			
			if(str.contains("push")) {
				push(Integer.parseInt(st.nextToken()));
			} else if(str.contains("pop")) {
				pop();
			} else if(str.contains("size")) {
				size();
			} else if(str.contains("empty")) {
				empty();
			} else if (str.contains("front")) {
		    	front();
		    } else {
		    	back();
		    }
	}
		
		System.out.print(sb);
}
	
	public static void push(int num) {
		queue.offer(num);
	}
	
	public static void pop() {
		if(queue.isEmpty()) {
			sb.append("-1\n");
		} else {
			sb.append(queue.poll()).append("\n");
		}
	}
	
	public static void size() {
		sb.append(queue.size()).append("\n");
	}
	
	public static void empty() {
		if(queue.isEmpty()) {
			sb.append("1\n");
		} else {
			sb.append("0\n");
		}
	}
	
	public static void front() {
		if(queue.isEmpty()) {
			sb.append("-1\n");
		} else {
			sb.append(queue.peek()).append("\n");
		}
	}
	
	public static void back() {
		if(queue.isEmpty()) {
			sb.append("-1\n");
		} else {
			sb.append(queue.peekLast()).append("\n");
		}
	}
}

