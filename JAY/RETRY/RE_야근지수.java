package JAY.RETRY;

public class RE_야근지수 {
    public static int[] works={4, 3, 3};
    public static int n = 4;
    public static long answer=0;
    public static int[] temp;
    public static void main(String[] args) {

        temp = new int[works.length];
        int total=-n;

        for(int i=0;i<works.length;i++){
            total+=works[i];
        }

        if(total<= 0){
            answer=0;
        }else{
            int time=total;

            for (int i=0; i<works.length; i++) {
                if(works[i] < total/works.length){
                    temp[i]=works[i];
                }else{
                    temp[i]=total/works.length;
                }
                time -= temp[i];
            }

            for (int i=0; i<works.length; i++) {
                if (time <= 0)
                    break;
                if (works[i] > temp[i]) {
                    temp[i]++;
                    time--;
                }
                if (i == works.length - 1) {
                    i = -1;
                }
            }

            for (int work : temp) {
                answer += work * work;
            }

            System.out.println(answer);
        }
    }
}
