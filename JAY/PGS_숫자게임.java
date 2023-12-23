package JAY;

import java.util.*;

import java.util.Arrays;

public class PGS_숫자게임 {
    public int solution(int[] A, int[] B) {
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

        return answer;
    }
}
