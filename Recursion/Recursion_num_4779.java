package Recursion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Recursion_num_4779 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String s;
        while ((s = br.readLine()) != null) {
            int N = Integer.parseInt(s);
            int len = (int) Math.pow(3, N);

            char[] arr = new char[len];
            for (int i = 0; i < len; i++) {
                arr[i] = '-';
            }

            recursion(0, len, arr);
            System.out.println(new String(arr));
        }
    }

    private static void recursion(int start, int len, char[] arr) {
        if (len == 1) return;

        len /= 3;

        for (int i = start + len; i < start + 2 * len; i++) {
            arr[i] = ' ';
        }

        recursion(start, len, arr);
        recursion(start + 2 * len, len, arr);
    }
}
