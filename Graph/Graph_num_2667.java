package Graph;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Graph_num_2667 {

    public static boolean[][] visited;
    public static int[][] map;
    public static ArrayList<Integer> list; // 각 단지내 집의 수
    public static int cnt = 0;
    public static int house = 0; // 단지 수

    public static void dfs(int x, int y) {
        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};
        visited[x][y] = true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        map = new int[N][N];
        visited = new boolean[N][N];

        // String으로 입력 받아서 정수값으로 변환 후 map에 저장
        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String str = st.nextToken();
            for (int j = 0; j < N; j++) {
                int num = Character.getNumericValue(str.charAt(j));
                map[i][j] = num;
            }
        }

        // map[0][0] ~ map[N+1][N+1] dfs 탐색
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; i++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    house++;
                    dfs(i, j);
                }
            }
        }
    }
}
