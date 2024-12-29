package BruteForce;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class BruteForce_num_1436 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int n = 666;
        int cnt = 1;

        while (cnt < N) {
            n++;
            if (String.valueOf(n).contains("666")) {
                cnt++;
            }
        }
        System.out.println(n);
    }
}
