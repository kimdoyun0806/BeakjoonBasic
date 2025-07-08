package Deepening;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class num_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        int[] arr = new int[50];
        int max = 0;
        char result = '?';

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                arr[str.charAt(i) - 'a']++;
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                arr[str.charAt(i) - 'A']++;
        }

        for (int i = 0; i < 50; i++) {

            if(arr[i] > max) {
                max = arr[i];
                result = (char) (i+'A');
            }
            else if(arr[i] == max)
                result = '?';
        }
        System.out.println(result);
    }
}
