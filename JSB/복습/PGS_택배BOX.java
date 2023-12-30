package JSB.복습;
import java.util.*;
public class PGS_택배BOX {
    class Solution {
        public int solution(int[] order) {
            int answer = 0;
            Stack<Integer> stack = new Stack<>();
            int index = 0;
            for(int i=1;i<=order.length;i++){
                if(order[index] != i){
                    stack.push(i);
                }else{
                    index++;
                    answer++;
                }
                while(!stack.isEmpty() && stack.peek() == order[index]){
                    stack.pop();
                    index++;
                    answer++;
                }

            }

            return answer;
        }
    }
}
