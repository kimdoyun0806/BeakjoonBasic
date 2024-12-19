import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Baisc_num_10950 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            int C = A + B;
            System.out.println(C);
        }
    }
}
