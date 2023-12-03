package JAY.RETRY;

import java.util.*;

public class RE_무인도여행 {
    public static String[] maps = {"X591X","X1X5X","X231X", "1XXX1"};
    public static boolean[][] visited;
    public static char[][] cMap;
    public static List<Integer> result = new ArrayList<>();
    public static int count=0;

    public static void main(String[] args) {
        cMap = new char[maps.length][maps[0].length()];
        visited = new boolean[maps.length][maps[0].length()];

        for (int i = 0; i < maps.length; i++) {
            cMap[i] = maps[i].toCharArray();
        }

        for(int i=0;i< cMap.length;i++){
            for(int j=0; j<cMap[i].length; j++) {
                dfs(i,j);
                if(count>0) {
                    result.add(count);
                    count=0;
                }
            }
        }

        if(result.size()!=0){
            Collections.sort(result);
        }else{
            result.add(-1);
        }

        System.out.println(result);
    }

    public static void dfs(int i ,int j){
        if(i<0||j<0||i>=cMap.length || j>=cMap[0].length||cMap[i][j]=='X'||visited[i][j]){
            return;
        }else{
            visited[i][j]=true;
            count+=Integer.parseInt(String.valueOf(cMap[i][j]));
        }

        dfs(i+1,j);
        dfs(i-1,j);
        dfs(i,j+1);
        dfs(i,j-1);

    }
}
