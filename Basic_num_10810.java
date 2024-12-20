import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic_num_10810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int[] arr = new int[N];
        for (int x = 0; x < M; x++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());
            for (int y = i; y <= j; y++) {
                arr[y-1] = k;
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
