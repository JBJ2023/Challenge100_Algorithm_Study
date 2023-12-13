package JAY;

import java.util.*;

public class PGS_최고의집합 {
    public int[] solution(int n, int s) {
        int[] answer;

        if(n>s){
            return new int[]{-1};
        }

        answer = new int[n];

        for(int i=0; i<answer.length; i++){
            answer[i] = s/n;
        }

        for(int i=0; i<s%n; i++){
            answer[i] ++;
        }

        Arrays.sort(answer);

        return answer;
    }
}
