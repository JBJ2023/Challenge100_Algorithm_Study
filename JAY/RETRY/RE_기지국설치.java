package JAY.RETRY;

public class RE_기지국설치 {
    public static int N = 11;
    public static int[] stations ={4,11};
    public static int w = 1;
    public static int answer=0;
    public static void main(String[] args) {
        int station=0;
        int location =1;

        while(location <= N){
            if(station<stations.length&&stations[station]-w<=location){
                location=stations[station]+w+1;
                station++;
            }else{
                answer++;
                location+=2*w+1;
            }
        }

        System.out.println(answer);
    }
}
