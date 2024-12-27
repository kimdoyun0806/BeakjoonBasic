/*
시간초과 뜸
package Math1;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Basic_num_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 1;
        int cnt = 1;
        while (true) {
            if (N == 1) {
                System.out.println(1);
                break;
            }
            else if ((res = res + (6 * cnt)) >= N && N >= res + 1) {
                System.out.println(cnt + 1);
                break;
            }
            res = res + (6 * cnt);
            cnt++;
        }
    }
}*/

package Math1;

import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Basic_num_2292 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 1;
        int cnt = 1;
        while (N > res) {
            res += cnt * 6;
            cnt++;
        }
        System.out.println(cnt);
    }
}