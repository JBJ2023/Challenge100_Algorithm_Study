package JAY;

import java.util.*;
public class PGS_양과늑대 {

    public static int[] gInfo;
    public static int[][] gEdges;
    public static int answer = 0;

    public int solution(int[] info, int[][] edges) {
        gInfo = info;
        gEdges = edges;
        dfs(0, new boolean[info.length], 0, 0);

        return answer;
    }

    public void dfs(int idx, boolean[] visited, int sheep, int wolf) {
        visited[idx] = true;
        if (gInfo[idx] == 0) {
            sheep++;
            answer=Math.max(answer,sheep);
        } else {
            wolf++;
        }

        if (sheep <= wolf) {
            return;
        }

        for (int[] edge : gEdges) {
            if (visited[edge[0]] && !visited[edge[1]]) {
                boolean[] nextVisited = new boolean[visited.length];
                for (int i = 0; i < visited.length; i++) {
                    nextVisited[i] = visited[i];
                }
                dfs(edge[1], nextVisited, sheep, wolf);
            }
        }
    }

}
