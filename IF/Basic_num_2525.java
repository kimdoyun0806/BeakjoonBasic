import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Basic_num_2525 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(br.readLine());
        int minute = B + C;
        if (minute >= 60) {
            A += minute / 60;
            if (A < 24) {
                System.out.println(A + " " + (minute % 60));
            } else {
                System.out.println(A - 24 + " " + (minute % 60));
            }
        } else
            System.out.println(A + " " + minute);
    }
}
