package JSB;

public class PGS_합승택시요금 {
    class Solution {
        public int solution(int n, int s, int a, int b, int[][] fares) {
            int[][] node = new int[n + 1][n + 1];
            for(int i = 1; i < n + 1; i++) {
                for(int j = 1; j < n + 1; j++) {
                    node[i][j] = 20000001; //지점 갯수(200) * 요금(100000) + 1
                }
                node[i][i] = 0;
            }

            for(int i = 0; i < fares.length; i++) {
                node[fares[i][0]][fares[i][1]] = fares[i][2];
                node[fares[i][1]][fares[i][0]] = fares[i][2];
            }

            for(int k = 1; k < n + 1; k++) { //K = 거쳐가는 노드
                for(int i = 1; i < n + 1; i++) { //I = 출발 노드
                    for(int j = 1; j < n + 1; j++) { //J = 도착노드
                        if(node[i][j] > node[i][k] + node[k][j]) {
                            node[i][j] = node[i][k] + node[k][j];
                        }
                    }
                }
            }

            int min = Integer.MAX_VALUE;
            for(int i = 1; i < n + 1; i++) {
                min = Math.min(min, node[s][i] + node[i][a] + node[i][b]);
            }
            return min;
        }
    }
}
