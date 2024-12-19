import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;

public class Basic_num_10951 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String[] str = br.readLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            System.out.println(A+B);
        }
    }
}
