package JAY;

public class PGS_기지국설치 {
    public int solution(int n, int[] stations, int w) {
        int answer = 0;

        int station=0;
        int location =1;

        while(location <= n){
            //현재위치가 모든 기지국의 범위보다 작고 특정 기지국에 범위내에 있는 경우
            if(station<stations.length && stations[station]-w<=location){
                location=stations[station]+w+1; // 기지국 오른쪽 끝
                station++;
            }else{ //그외 기지국 영향권 밖일 경우 (기지국 미설치)
                answer++;
                location+=(2*w)+1; // 전체전파범위 = 2*전파범위+1
            }
        }

        return answer;
    }
}
