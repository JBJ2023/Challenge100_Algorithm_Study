package JSB.복습;
import java.util.*;
public class PGS_등굣길 {
    class Solution {
        public int solution(int m, int n, int[][] puddles) {

            int x = 1000000007;
            int[][] map =new int [n][m];
            for(int[] puddle : puddles){
                map[puddle[1]-1][puddle[0]-1] = -1;
            }
            map[0][0] = 1;

            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    if(map[i][j]==-1){
                        map[i][j]=0;
                        continue;
                    }//물웅덩이
                    if(i!=0){
                        map[i][j] += map[i-1][j]%x;
                    }
                    if(j!=0){
                        map[i][j] += map[i][j-1]%x;
                    }
                }
            }
            int answer = map[n-1][m-1] % x;
            return answer;
        }

    }

}
