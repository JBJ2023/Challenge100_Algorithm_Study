package JAY.RETRY;

import java.util.*;

public class RE_주차요금계산 {
    public static int[] fees = {180, 5000, 10, 600};
    public static String[] records ={"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN", "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"};

    public static void main(String[] args) {
        int[] answer = {};
        Map<String, Integer> map = new TreeMap<>();

        for(int i=0;i<records.length;i++){
            String[] recordArr = records[i].split(" ");
            String[] timeArr = recordArr[0].split(":");

            int time = (recordArr[2].equals("IN")?-1:1)*((Integer.parseInt(timeArr[0]) * 60) + Integer.parseInt(timeArr[1]));
            String car = recordArr[1];

            map.put(car, map.getOrDefault(car,0)+time);
        }

        answer = new int[map.size()];

        int i=0;

        for(String key : map.keySet()){
            int time = map.get(key);
            if(time<=0){
                time=time+((23*60)+59);
            }

            double baseTime=0;

            if(time-fees[0]>=0){
                baseTime=time-fees[0];
            }
            int price = fees[1]+(int)Math.ceil(baseTime/fees[2])*fees[3];

            answer[i++]=price;
        }

        System.out.println(Arrays.toString(answer));
    }

}
