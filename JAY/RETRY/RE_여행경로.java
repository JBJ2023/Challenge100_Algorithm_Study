package JAY.RETRY;

import java.util.*;

public class RE_여행경로 {
    public static String[][] tickets = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
    public static boolean[] visited = new boolean[tickets.length];
    public static List<String> list = new ArrayList<>();

    public static void main(String[] args) {
        dfs("ICN", "ICN", 0);
        Collections.sort(list);

        String[] answer=list.get(0).split(",");

        System.out.println(Arrays.toString(answer));
    }

    public static void dfs(String now, String path, int cnt){
        if(cnt==tickets.length){
            list.add(path);
            return;
        }

        for(int i=0;i<tickets.length;i++){
            if(!visited[i] && now.equals(tickets[i][0])) {
                visited[i] = true;
                String newPath = path+","+tickets[i][1];
                dfs(tickets[i][1], newPath, cnt + 1);
                visited[i] = false;
            }
        }
    }
}
