import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

/*public class Basic_num_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split(" ");
        int v = Integer.parseInt(br.readLine());
        List<Integer> arr = new ArrayList<>();
        for(String s : str) {
            arr.add(Integer.parseInt(s));
        }
        int cnt = 0;
        for(int num : arr) {
            if(num==v) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
*/
public class Basic_num_10807 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N= Integer.parseInt(br.readLine());
        int cnt = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int b = Integer.parseInt(br.readLine());
        for(int i=0; i<arr.length; i++) {
            if(b==arr[i]) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}