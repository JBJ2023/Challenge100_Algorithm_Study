package JSB.복습;

public class PGS_피로도 {
    class Solution {
        int answer ;
        int[] visit; //1 방문 0 미방문
        public int solution(int k, int[][] d) {
            visit = new int[d.length];

            dfs(0,k,d);

            return answer;
        }
        public void dfs(int dep,int k, int[][] d){
            for (int i=0; i<d.length;i++){
                if(visit[i]==0 && k>=d[i][0]){
                    visit[i]=1;
                    dfs(dep+1,k-d[i][1],d);
                    visit[i]=0; //다시 방문 확인 할때 쓸 수 있게
                }
            }
            answer = Math.max(answer,dep);
        }

    }

}


