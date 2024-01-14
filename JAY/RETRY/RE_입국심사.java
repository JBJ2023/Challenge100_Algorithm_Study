package JAY.RETRY;

import java.util.*;


public class RE_입국심사 {

    public static int n = 6;
    public static int[] times ={7,10};
    public static long answer=0;
    public static void main(String[] args) {

        Arrays.sort(times);
        long left=0;
        long right=(long)times[times.length-1]*n;

        while(true){
            if(left>right){
                break;
            }
            long mid=(left+right)/2;
            long sum=0;
            for(int time:times){
                sum+=(mid/time);
            }
            if(sum<n){
                left=mid+1;
            }
            else{
                right=mid-1;
                answer=mid;
            }
        }

        System.out.println(answer);
    }
}
