package Math1;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class Math_num_2745 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        String N = str[0];
        int B = Integer.parseInt(str[1]);
        System.out.println(Integer.parseInt(N,B));
    }

}
