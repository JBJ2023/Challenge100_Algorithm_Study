package JAY.RETRY;

import java.util.*;

public class RE_가장긴팰린드롬 {
    public static String s = "abcdcba";
    public static int answer = Integer.MIN_VALUE;
    public static void main(String[] args) {

        for(int i=0;i<s.length();i++){
            int left=i;
            int right=s.length()-1;
            int length=0;
            int cnt=1;

            while(left<right){
                if(s.charAt(left) == s.charAt(right)){
                    left++;
                    right--;
                    length+=2;
                }else{
                    length=0;
                    left=i;
                    right=s.length()-1-cnt;
                    cnt++;
                }
            }

            if(left==right){
                length++;
            }

            answer = Math.max(answer,length);
        }

        System.out.println(answer);
    }
}
