package JAY.RETRY;

import java.util.*;

public class RE_합승택시요금 {

    public static int n=6;
    public static int s =4;
    public static int a=6;
    public static int b=2;
    public static int[][] fares ={{4, 1, 10}, {3, 5, 24}, {5, 6, 2}, {3, 1, 41}, {5, 1, 24}, {4, 6, 50}, {2, 4, 66}, {2, 3, 22}, {1, 6, 25}};
    public static int[][] map =new int[n+1][n+1];
    public static int answer=0;
    public static void main(String[] args) {
        int max=100001*n;

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

        answer = map[s][a] + map[s][b];

        for(int i = 1; i <= n; i++) {
            answer = Math.min(answer, map[s][i] + map[i][a] +map[i][b]);
        }

        System.out.println(answer);
    }
}
