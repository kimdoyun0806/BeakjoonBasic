package Greedy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class num_16953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        int res = 1;

        while (true) {

            if(A>B) {
                res = -1;
                break;
            }

            String str = String.valueOf(B);

            if (str.charAt(str.length() - 1) != '1' && B % 2 != 0) {
                res = -1;
                break;
            }

            if (B % 2 == 0) {
                B /= 2;
            }
            else {
                str = str.substring(0, str.length()-1);
                B = Long.parseLong(str);
            }
            res++;
            if(A==B){
                break;
            }
        }
        System.out.println(res);
    }
}
