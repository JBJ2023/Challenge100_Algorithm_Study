package JAY.RETRY;

import java.util.Arrays;

public class RE_최고의집합 {
    public static int n = 2;
    public static int s = 9;
    public static void main(String[] args) {
        int[] answer = new int[n];

        if(n>s){
            System.out.println(-1);
        }else {
            for (int i = 0; i < answer.length; i++) {
                answer[i] = s / n;
            }

            for (int i = 0; i < s % n; i++) {
                answer[i]++;
            }

            Arrays.sort(answer);

            System.out.println(Arrays.toString(answer));
        }
    }
}
