import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;

public class Basic_num_15552 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            bw.write((A + B) + "\n");
        }
        bw.flush();
        bw.close();
    }
}
