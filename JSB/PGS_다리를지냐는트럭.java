package JSB;

import java.util.LinkedList;
import java.util.Queue;
import java.util.*;
public class PGS_다리를지냐는트럭 {
    class Solution {
        public int solution(int bridge_length, int weight, int[] truck_weights) {
            int time = 0;   //소요시간
            Queue<Integer> bridge = new LinkedList<>();
            int sum =0;
            for(int i=0;i<truck_weights.length;i++){
                int truck = truck_weights[i];

                while(true){
                    if(bridge.isEmpty()){ //다리가 비었을때
                        bridge.add(truck);
                        sum += truck;
                        time++;
                        break;
                    }
                    else if(bridge.size() == bridge_length){ //다리 길이 만큼 다리에 올라간 사이즈가 클 때 다리에서 내린다.
                        sum -= bridge.poll();
                    }
                    else{
                        if(sum + truck <= weight){ //다리와 추가될 트럭의 합이 무게보다 낮거나 같으면 다리에 올리고 시간을 추가한다.
                            bridge.add(truck);
                            sum += truck;
                            time++;
                            break;
                        }
                        else { //다리와 추가될 트럭이 합이 무게보다 크면 0을 더하고 시간만 추가한다.(그다음에 다리에서 내리는걸 추가하게 될거다.)
                            bridge.add(0);
                            time++;
                        }
                    }
                }
            }
            time+=bridge_length; //다리에 올라있는 트럭들을 내리기 위해 추가한다.

            return time;
        }
    }
}
