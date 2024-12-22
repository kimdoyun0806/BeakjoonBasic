package Deepening;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.sql.SQLOutput;

public class Basic_num_2444 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        //공백은 -1 줄어들고, 별은 +2 늘어난다
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 0; k < i * 2 - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //공백은 +1, 별은 -2
        for (int i = N - 1; i > 0; i--) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(" ");
            }
            for (int k = i * 2- 1; k>0; k--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
