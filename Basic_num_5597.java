import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Basic_num_5597 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[30];
        for(int i=0; i<28; i++) {
            int A = Integer.parseInt(br.readLine());
            arr[A-1] = A;
        }
        for(int i=0; i<30; i++) {
            if(arr[i]==0)
                System.out.println(i+1);
        }
    }
}
