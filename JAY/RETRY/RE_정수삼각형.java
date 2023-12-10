package JAY.RETRY;

import java.util.*;

public class RE_정수삼각형 {

    public static int[][] triangle ={{7}, {3, 8}, {8, 1, 0}, {2, 7, 4, 4}, {4, 5, 2, 6, 5}};
    public static void main(String[] args) {
        int answer = 0;
        int[][] sum = new int[triangle.length][triangle.length];

        sum[0][0]=triangle[0][0];

        for(int i=1;i<triangle.length;i++){
            sum[i][0]=sum[i-1][0]+triangle[i][0];
            sum[i][i]=sum[i-1][i-1]+triangle[i][i];

            for(int j=1;j<=i;j++){
                sum[i][j]=Math.max(sum[i-1][j],sum[i-1][j-1])+triangle[i][j];
                answer=Math.max(answer,sum[i][j]);
            }
        }

        System.out.println(answer);
    }
}
