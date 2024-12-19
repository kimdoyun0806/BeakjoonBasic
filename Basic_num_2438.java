import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;

public class Basic_num_2438 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            for(int j=0; j<i+1; j++) {
                bw.write("*");
            }
            bw.write("\n");
        }
        bw.flush();
        br.close();
        bw.close();
    }
}
