import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Basic_num_2480 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);
        int result = 0;
        if (A == B && B == C) {
            result = 10000 + A * 1000;
        } else if (A == B || A == C)
            result = 1000 + A * 100;
        else if (B == C)
            result = 1000 + B * 100;
        else
            result = Math.max(A, Math.max(B, C)) * 100;
        System.out.println(result);
        br.close();
    }
}
