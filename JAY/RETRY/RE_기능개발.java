package JAY.RETRY;

import java.util.*;

public class RE_기능개발 {

    public static int[] progresses = {93,30,35};
    public static int[] speeds = {1,30,5};

    public static void main(String[] args) {
        ArrayList<Integer> result= new ArrayList<>();
        Queue<Integer> pro =new LinkedList<> ();
        Queue<Integer> spd =new LinkedList<> ();

        int day=1;

        for(int i=0;i<progresses.length;i++){
            pro.add(progresses[i]);
        }

        for(int i=0;i<speeds.length;i++){
            spd.add(speeds[i]);
        }

        while(!pro.isEmpty()){
            int count=0;
            while(!pro.isEmpty()&&pro.peek()+(spd.peek()*day)<100)
                day++;
            while(!pro.isEmpty()&&pro.peek()+(spd.peek()*day)>=100){
                pro.remove();
                spd.remove();
                count++;
            }
            if(count>0)
                result.add(count);
        }

        System.out.println(result);

    }
}
