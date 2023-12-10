package JAY.RETRY;

import java.util.*;

public class RE_택배상자 {
    public static int[] order = {4,3,1,2,5};

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();

        int answer = 0;
        int idx=0;

        for(int i=1;i<=order.length;i++){
            if(order[idx]==i){
                idx++;
                answer++;
            }else{
                stack.push(i);
            }

            while(!stack.isEmpty()&&stack.peek()==order[idx]){
                stack.pop();
                idx++;
                answer++;
            }
        }

        System.out.println(answer);
    }
}
