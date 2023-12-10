package JAY.RETRY;

public class RE_네트워크 {
    public static int n=3;
    public static int[][] computers={{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
    public static boolean[] visited = new boolean[n];

    public static void main(String[] args) {
        int answer = 0;

        for(int i=0;i<n;i++){
            if (!visited[i]) {
                dfs(i);
                answer++;
            }
        }

        System.out.println(answer);
    }

    public static void dfs(int idx){
        visited[idx]=true;

        for (int j = 0; j < computers.length; j++) {
            if (idx != j && computers[idx][j] == 1 && !visited[j]) {
                dfs(j);
            }
        }
    }

}
