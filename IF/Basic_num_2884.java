import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Basic_num_2884 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int H = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        if (M >= 45)
            System.out.print(H + " " + (M - 45));
        else {
            if (H == 0) {
                System.out.println("23 " + (M + 15));
            } else {
                System.out.println((H - 1) + " " + (M + 15));
            }
        }
        br.close();
    }
}
