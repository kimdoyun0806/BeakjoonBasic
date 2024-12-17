import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Basic_num_2588 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        String b = br.readLine();
        System.out.println( a * Integer.parseInt(b.substring(2,3)));
        System.out.println( a * Integer.parseInt(b.substring(1,2)));
        System.out.println( a * Integer.parseInt(b.substring(0,1)));
        System.out.println( a * Integer.parseInt(b));
    }
}
