package JAY;

public class PGS_야근지수 {
    public long solution(int n, int[] works) {
        long answer = 0;
        int[] temp = new int[works.length];
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
        }


        return answer;
    }
}
