package String;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Basic_num_2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            String B = str[1];
            for (int j = 0; j < B.length(); j++) {
                for (int k = 0; k < A; k++) {
                    System.out.print(B.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
