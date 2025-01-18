package codingTestChallenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Day13 {
	
	static Stack<Integer> stack = new Stack<>();

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < N; i++) {
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
			} else {
				top();
			}
		}	
	}
	
	public static void push(int num) {
		stack.push(num);
	}
	
	public static void pop() {
		if(stack.empty()) {
			System.out.println("-1");
		} else {
			System.out.println(stack.pop());
		}
	}
	
	public static void size() {
		System.out.println(stack.size());
	}
	
	public static void empty() {
		if(stack.empty()) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
	
	public static void top() {
		if(stack.empty()) {
			System.out.println("-1");
		} else {
			System.out.println(stack.peek());
		}
	}
}
