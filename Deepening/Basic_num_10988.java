package Deepening;
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;

public class Basic_num_10988 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);
        if(str.equals(sb.reverse().toString()))
            System.out.println(1);
        else
            System.out.println(0);
    }
}
