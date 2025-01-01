package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bruteforce_num_1018 {
    public static String[] BW = {
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
    };

    public static String[] WB = {
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
    };

    public static String[] board;

    // 맨 왼쪽 위 칸이 검은색인 경우
    public static int cntBW(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i].charAt(y + j) != BW[i].charAt(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    // 맨 왼쪽 위 칸이 흰색인 경우
    public static int cntWB(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i].charAt(y + j) != WB[i].charAt(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int M = Integer.parseInt(str[1]);

        board = new String[N];
        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        // 최대 64개까지 칠할 수 있다
        int min = 64;

        for (int i = 0; i + 8 <= N; i++) {
            for (int j = 0; j + 8 <= M; j++) {
                int tmp = Math.min(cntBW(i, j), cntWB(i, j));
                min = Math.min(min, tmp);
            }
        }

        System.out.println(min);
    }
}