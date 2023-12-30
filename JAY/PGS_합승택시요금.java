package JAY;

import java.util.*;

public class PGS_합승택시요금 {
    public int solution(int n, int s, int a, int b, int[][] fares) {
        int answer = 0;
        int max=100001*n;

        int[][] map=new int[n+1][n+1];

        for (int i = 0; i <= n; i++) {
            Arrays.fill(map[i], max);
            map[i][i] = 0;
        }

        for(int i = 0; i < fares.length; i++) {
            int start = fares[i][0];
            int end = fares[i][1];
            int cost = fares[i][2];

            map[start][end] = cost;
            map[end][start] = cost;
        }

        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    if(map[j][k]>map[j][i]+map[i][k]){
                        map[j][k]=map[j][i]+map[i][k];
                    }
                }
            }
        }

        //합승X
        answer = map[s][a] + map[s][b];

        //합승O
        for(int i = 1; i <= n; i++) {
            answer = Math.min(answer, map[s][i] + map[i][a] +map[i][b]);
        }

        return answer;
    }
}
