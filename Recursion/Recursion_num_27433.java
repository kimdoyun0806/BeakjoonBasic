package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_num_27433 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        System.out.println(Factorial(N));
    }
    public static long Factorial(int n) {
        if (n == 0)
            return 1;
        else
            return n * Factorial(n - 1);
    }

}
