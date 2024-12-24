package Math1;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Math1_num_11005 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        // 10진수를 B진법으로 변환
        System.out.println(Integer.toString(N,B).toUpperCase());
    }
}
