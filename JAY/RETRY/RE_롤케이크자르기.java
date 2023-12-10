package JAY.RETRY;

import java.util.*;

public class RE_롤케이크자르기 {
    public static int[] topping ={1, 2, 1, 3, 1, 4, 1, 2};

    public static void main(String[] args) {
        int answer=0;

        int[] big = new int[topping.length];
        int[] small = new int[topping.length];

        HashSet<Integer> set = new HashSet<>();

        for(int i=0;i<topping.length;i++){
            set.add(topping[i]);
            big[i]=set.size();
        }

        set.clear();

        for(int i=topping.length-1; i>=0; i--){
            set.add(topping[i]);
            small[i]=set.size();
        }

        for(int i=0;i<topping.length-1;i++){
            if(big[i]==small[i+1])
                answer++;
        }

        System.out.println(answer);

    }
}
