package JAY;

import java.util.*;

public class PGS_가장긴팰린드롬 {
    public int solution(String s) {
        int answer = Integer.MIN_VALUE;

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


        return answer;
    }
}
