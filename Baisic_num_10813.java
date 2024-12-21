import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;
public class Baisic_num_10813 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);
        int temp = 0;
        int[] arr = new int[N];
        // i번 바구니에 i+1번호의 공 넣기
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i <M; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            temp = arr[A-1];
            arr[A-1] = arr[B-1];
            arr[B-1] = temp;
        }
        for (int i=0; i<N; i++) {
            System.out.print(arr[i]+ " ");
        }
    }
}

