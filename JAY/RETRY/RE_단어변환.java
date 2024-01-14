package JAY.RETRY;

import java.util.*;

public class RE_단어변환 {

    public static String begin = "hit";
    public static String target = "cog";
    public static String[] words ={"hot", "dot", "dog", "lot", "log", "cog"};

    public static int answer=0;
    public static boolean[] visited;

    public static void main(String[] args) {
        visited = new boolean[words.length];
        dfs(begin,0);
        System.out.println(answer);
    }

    public static void dfs(String begin, int count){
        if(begin.equals(target)){
            answer=count;
            return;
        }

        for(int i=0;i<words.length;i++){
            if(visited[i]==true)
                continue;
            int k=0;
            for(int j=0;j<begin.length();j++){
                if(begin.charAt(j)==words[i].charAt(j))
                    k++;
            }

            if(k==begin.length()-1){
                visited[i]=true;
                dfs(words[i],count+1);
                visited[i]=false;
            }
        }

    }
}
