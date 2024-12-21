import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Basic_num_3052 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[] arr = new boolean[42];
        int cnt = 0;
        for(int i=0; i<10; i++) {
            int A = Integer.parseInt(br.readLine());
            arr[A%42] = true;
        }
        for(int i=0; i<42; i++) {
            if(arr[i] == true)
                cnt++;
        }
        System.out.println(cnt);
    }
}
