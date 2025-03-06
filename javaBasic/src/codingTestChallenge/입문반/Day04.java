package codingTestChallenge.입문반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Day04 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		String[][] arr = new String[n][4];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			arr[i][0] = st.nextToken(); //이름
			arr[i][1] = st.nextToken(); // 일
			arr[i][2] = st.nextToken(); // 월
			arr[i][3] = st.nextToken(); // 년
		}
		
		Arrays.sort(arr ,new Comparator<String[]>() {
			@Override
			public int compare(String[] o1, String[] o2) {
				if(o1[3].equals(o2[3])) {
					if(o1[2].equals(o2[2])) {
						return Integer.parseInt(o1[1]) - Integer.parseInt(o2[1]); // 태어난 월이 같으면 태어난 일로 정렬
					}
					return Integer.parseInt(o1[2]) - Integer.parseInt(o2[2]); //태어난 해가 같으면 태어난 월로 정렬
				}
				return Integer.parseInt(o1[3]) - Integer.parseInt(o2[3]); // 태어난 해 정렬
			}			
		});
		
		StringBuilder sb = new StringBuilder();
		sb.append(arr[n-1][0]).append("\n").append(arr[0][0]); // 맨 뒤에 있는 사람이 가장 어린 사람, 맨 앞에 있는 사람이 가장 나이 많은 사람
		System.out.print(sb);

	}
}
