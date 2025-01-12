package SetMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class SetMap_num_1620 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        LinkedHashMap<String,Integer> map = new LinkedHashMap<>();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        String[] pokemon = new String[N+1];

        for(int i= 1; i<=N; i++) {
            pokemon[i] = br.readLine();
            map.put(pokemon[i],i);
        }

        for(int i=0; i<M; i++) {
            String input = br.readLine();
            if(Character.isDigit(input.charAt(0))) {
                int num = Integer.parseInt(input);
                sb.append(pokemon[num]).append("\n");
            }
            else
                sb.append(map.get(input)).append("\n");
        }
        System.out.println(sb);
    }
}
