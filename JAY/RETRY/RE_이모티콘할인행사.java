package JAY.RETRY;

import java.util.*;
public class RE_이모티콘할인행사 {
    public static int[][] users ={{40, 10000}, {25, 10000}};
    public static int[] emoticons ={7000, 9000};
    public static int[] discounts = {10, 20, 30, 40};
    public static int maxSub=0;
    public static int maxCost=0;

    public static void main(String[] args) {
        int[] answer = new int[2];

        dfs (0, new int[emoticons.length]);

        answer[0] = maxSub;
        answer[1] = maxCost;

        System.out.println(Arrays.toString(answer));
    }

    public static void dfs(int idx, int[] discount) {
        if(idx == emoticons.length) {
            int userSub = 0;
            int userCost = 0;

            for(int i=0;i<users.length;i++) {
                int userDiscountRate = users[i][0];
                int userPurchaseCost = users[i][1];
                int totalPurchase = 0;

                for(int j = 0 ; j < emoticons.length ; j++) {
                    if(discount[j] >= userDiscountRate) {
                        totalPurchase += (emoticons[j] * (100 - discount[j])) / 100;
                    }
                }


                if (totalPurchase >= userPurchaseCost) {
                    userSub++;
                } else {
                    userCost += totalPurchase;
                }
            }

            if (maxSub < userSub) {
                maxSub = userSub;
                maxCost = userCost;
            } else if (maxSub == userSub) {
                maxCost = Math.max(maxCost, userCost);
            }
            return;
        }

        for(int i = 0 ; i < discounts.length ; i++) {
            discount[idx] = discounts[i];
            dfs(idx + 1, discount);
        }
    }
}
