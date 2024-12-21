import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic_num_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        int max = arr[0];
        int num = 1;

        for (int i = 1; i < 9; i++) {
            if (arr[i] > max) {
                max = arr[i];
                num = i + 1;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}
