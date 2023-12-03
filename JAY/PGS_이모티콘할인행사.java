package JAY;

import java.util.*;
public class PGS_이모티콘할인행사 {
    public static int[] discounts = {10, 20, 30, 40};
    public static int maxSub=0;
    public static int maxCost=0;

    public int[] solution(int[][] users, int[] emoticons) {
        int[] answer = new int[2];

        dfs (0, new int[emoticons.length],users,emoticons);

        answer[0] = maxSub;
        answer[1] = maxCost;
        return answer;
    }

    public static void dfs(int idx, int[] discount, int[][] users, int[] emoticons) {
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
            dfs(idx + 1, discount, users, emoticons);
        }
    }
}
