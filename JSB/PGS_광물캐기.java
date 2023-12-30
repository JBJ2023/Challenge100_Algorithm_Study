package JSB;
import java.util.*;
public class PGS_광물캐기 {
    class Solution {
        public int[] solution(int[] numbers) {
            int[] answer = new int[numbers.length];
            Stack<Integer> s = new Stack<>();

            for(int i=numbers.length -1;i>=0;i--){
                answer[i] = -1; //초기화
                while(!s.isEmpty()){
                    if(s.peek()>numbers[i]){
                        answer[i] = s.peek();
                        break;
                    }
                    s.pop();
                }
                s.add(numbers[i]);
            }
            return answer;
        }
    }

}
