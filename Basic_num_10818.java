import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic_num_10818 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int max = -1000001;
        int min = 1000001;

        while (st.hasMoreTokens()) {
            int M = Integer.parseInt(st.nextToken());
            if (M > max)
                max = M;
            if (M < min)
                min = M;
        }
        System.out.println(min + " " + max);
    }
}
