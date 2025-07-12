package BruteForce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1018 {

    public static String[] board;

    public static String[] bw = {
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB"
    };
    public static String[] wb = {
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW",
            "WBWBWBWB",
            "BWBWBWBW"
    };

    public static int cntbw(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i].charAt(y + j) != bw[i].charAt(j)) {
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static int cntwb(int x, int y) {
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (board[x + i].charAt(y + j) != wb[i].charAt(j)) {
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
        int result = Integer.MAX_VALUE;

        board = new String[N];

        for (int i = 0; i < N; i++) {
            board[i] = br.readLine();
        }

        for (int i = 0; i + 8 <= N; i++) {
            for (int j = 0; j + 8 <= M; j++) {
                int min = Math.min(cntbw(i, j), cntwb(i, j));
                result = Math.min(result, min);
            }
        }
        System.out.println(result);
    }
}
