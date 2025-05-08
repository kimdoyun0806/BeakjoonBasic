package DynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Dynamic_num_10870 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        System.out.println(recursion(N));
    }

    public static int recursion(int N) {
        if(N==0) return 0;
        if(N==1) return 1;

        return recursion(N-1) + recursion(N-2);
    }
}
