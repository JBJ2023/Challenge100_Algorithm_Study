package BKS;

import java.util.Arrays;

public class PGS_최고의집합 {
    public static void main(String[] args) {
        int n = 2;
        int s = 9;
        int[] answer = new int[n];
        if (n > s) {
            System.out.println(-1);
            return;
        }
        // n : 몫의 개수
        // s : 수
        int num = s / n;
        int mod = s % n;

        Arrays.fill(answer, num);
        for (int i = 0 ; i < mod ; i++) {
            answer[i] += 1;
        }

        Arrays.sort(answer);
        System.out.println(Arrays.toString(answer));
    }
}
