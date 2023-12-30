package JSB.복습;
import java.util.*;
public class PGS_무인도여행 {

    class Solution {
        static int x=0;
        static int y=0;
        static int day = 0;
        public int[] solution(String[] maps) {

            x = maps.length;
            y = maps[0].length();
            int[][] map = new int[x][y];
            for(int i=0;i<x;i++){
                char[] ch = maps[i].toCharArray();
                for(int j=0;j<ch.length;j++){
                    if(ch[j] =='X'){
                        map[i][j] = 0;
                    }
                    else{
                        map[i][j] = ch[j]-'0';
                    }
                }
            }//2차원 배열에 넣기

            List<Integer> answer = new ArrayList<>();
            int[][] visit = new int[x][y]; //방문 1 미방문 0
            for(int i=0;i<x;i++){
                for(int j=0;j<y;j++){
                    if(visit[i][j]==0 && map[i][j]>0){
                        dfs(map,visit,i,j);
                        answer.add(day);
                        day=0;
                    }
                }
            }
            if(answer.isEmpty()){
                return new int[]{-1};
            }
            Collections.sort(answer);
            int[] an = new int[answer.size()];
            for(int i=0;i<an.length;i++){
                an[i] = answer.get(i);
            }
            return an;
        }
        private void dfs(int[][] map , int[][] vi ,int a, int b){
            day += map[a][b];
            vi[a][b] = 1;

            int[] height = {0,0,1,-1};
            int[] width = {1,-1,0,0};

            for(int i=0;i<4;i++){
                int newX = a + width[i];
                int newY = b + height[i];

                if(newX <0 || newY <0 || newX>=x ||newY>=y){
                    continue;
                }
                if(vi[newX][newY]==0 && map[newX][newY]>0){
                    dfs(map,vi,newX,newY);
                }
            }
        }
    }
}
