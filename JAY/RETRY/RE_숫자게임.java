package JAY.RETRY;

import java.util.*;

public class RE_숫자게임 {

    public static int[] A = {5,1,3,7};
    public static int[] B = {2,2,6,8};

    public static void main(String[] args) {
        int answer = 0;

        Arrays.sort(A);
        Arrays.sort(B);

        int idx=B.length-1;

        for(int i=A.length-1; i>=0;i--){
            if(B[idx]>A[i]){
                answer++;
                idx--;
            }
        }

        System.out.println(answer);
    }
}
