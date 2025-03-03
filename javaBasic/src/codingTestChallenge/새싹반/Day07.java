package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day07 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str = br.readLine();

		StringBuilder sb = new StringBuilder(str);

		if (str.equals(sb.reverse().toString())) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}

	}

}
