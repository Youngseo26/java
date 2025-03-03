package codingTestChallenge.새싹반;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Day21 {
    static long n, answer = 0;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        n = Long.parseLong(br.readLine());
        System.out.println(binarySearch(n));
    }

    static long binarySearch(long num) {
        long left = 0;
        long right = num;
        long result = 0;
        while (left <= right) {
            long mid = (left + right) / 2;
            if (num <= Math.pow(mid, 2)){
            	result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return result;
    }
}
