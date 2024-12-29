package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BruteForce_num_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++) {
            int sum = i;
            String str = Integer.toString(i);

            for(int j=0; j<str.length(); j++) {
                //sum += str.charAt(j) - '0' ;
                sum += Character.getNumericValue(str.charAt(j));
            }
            if(sum==N) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(0);
    }
}
