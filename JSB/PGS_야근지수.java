package JSB;
import java.util.*;
public class PGS_야근지수 {
    class Solution {
        public long solution(int n, int[] works) {
            long answer = 0;

            PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < works.length; i++) {
                queue.add(works[i]);
            }

            while (n > 0) {
                if (queue.peek() == 0) {
                    break;
                }
                queue.add(queue.poll() - 1);
                n--;
            }

            while (!queue.isEmpty()){
                answer += Math.pow(queue.poll(), 2);
            }
            return answer;
        }
    }
}
