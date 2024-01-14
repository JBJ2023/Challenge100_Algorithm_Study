package JAY.RETRY;

import java.util.*;

public class RE_단속카메라 {

    public static int[][] routes = {{-20,-15}, {-14,-5}, {-18,-13}, {-5,-3}};

    public static void main(String[] args) {
        Arrays.sort(routes, (o1, o2) -> o1[1] - o2[1]);
        int location = routes[0][1];
        int answer = 1;

        for (int i = 1; i < routes.length; i++) {
            if (routes[i][0] > location) {
                answer++;
                location = routes[i][1];
            }
        }

        System.out.println(answer);
    }
}
