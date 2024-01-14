package JAY.RETRY;

public class RE_양과늑대 {

    public static int[] info={0,0,1,1,1,0,1,0,1,0,1,1};
    public static int[][] edges= {{0,1},{1,2},{1,4},{0,8},{8,7},{9,10},{9,11},{4,3},{6,5},{4,6},{8,9}};

    public static int[] gInfo;
    public static int[][] gEdges;

    public static int answer = 0;

    public static void main(String[] args) {
        gInfo = info;
        gEdges = edges;
        dfs(0, new boolean[info.length], 0, 0);

        System.out.println(answer);

    }


    public static void dfs(int idx, boolean[] visited, int sheep, int wolf) {
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
