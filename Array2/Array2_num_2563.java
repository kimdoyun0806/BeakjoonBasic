package Array2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Array2_num_2563 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // 색종이의 방문 여부
        int[][] visited = new int[100][100];
        // 검은 영역 넓이
        int dimensions = 0;

        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), " ");
            // x,y 좌표
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    if (visited[j][k] == 0) {
                        visited[j][k] = 1;
                        dimensions += 1;
                    }
                }
            }
        }
        System.out.println(dimensions);
    }
}
