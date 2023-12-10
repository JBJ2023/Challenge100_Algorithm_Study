package JAY.RETRY;

import java.util.*;

public class RE_다리를지나는트럭 {
    public static int bridge_length=2;
    public static int weight=10;
    public static int[] truck_weights={7,4,5,6};

    public static void main(String[] args) {
        int answer = 0;
        int sum = 0;
        int idx = 0;

        Queue<Integer> que = new LinkedList<>();

        for (int i = 0 ; i < bridge_length ; i++) {
            que.offer(0);
        }

        while (idx < truck_weights.length) {
            int truck = que.poll();
            sum -= truck;

            if (sum + truck_weights[idx] <= weight) {
                sum += truck_weights[idx];
                que.offer(truck_weights[idx++]);
            } else {
                que.offer(0);
            }
            answer++;
        }

        while (!que.isEmpty()) {
            answer++;
            que.poll();
        }

        System.out.println(answer);
    }

}
