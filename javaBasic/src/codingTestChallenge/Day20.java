package codingTestChallenge;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Day20 {
	static int [] arr;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	    
	    int n = Integer.parseInt(br.readLine());
	    
	    arr = new int[n];
	    
	    StringTokenizer st = new StringTokenizer(br.readLine());
	    
	    for(int i =0; i < n; i++) {
	    	arr[i] = Integer.parseInt(st.nextToken());
	    }
	    // 배열 반드시 sorting 할 것
	    Arrays.sort(arr);
	    
	    int m = Integer.parseInt(br.readLine());
	    
	    st = new StringTokenizer(br.readLine());
	    StringBuilder sb = new StringBuilder();
	    for(int i = 0; i < m; i++) {
	    	if(binarySearch(Integer.parseInt(st.nextToken()))>=0) {  //찾고자 하는 값이 있을 경우
	    		sb.append("1").append("\n");
	    	} else {
	    		sb.append("0").append("\n");
	    	}
	    }
	   bw.write(sb.toString());
	   bw.flush();
	   bw.close();
	}
	
	public static int binarySearch(int num) {
		int low = 0;
		int high = arr.length-1;
		while(low<=high) {
			int mid = (low + high) / 2;
			if(num < arr[mid]) {
				high = mid -1;
			} else if(num > arr[mid]) {
				low = mid + 1;
			} else {
				return mid;
			}
		}
		return -1;
	}

}
