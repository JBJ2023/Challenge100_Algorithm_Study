package JAY;

public class PGS_스티커모으기2 {
    public int solution(int sticker[]) {
        int answer = 0;

        if(sticker.length == 1){
            answer= sticker[0];
        }else{
            int[] arr1 = new int[sticker.length];
            int[] arr2 = new int[sticker.length];

            arr1[0]=sticker[0];
            arr1[1]=sticker[0];

            arr2[0]=0;
            arr2[1]=sticker[1];

            for(int i=2;i<sticker.length;i++){
                arr1[i] = Math.max(arr1[i-2] + sticker[i], arr1[i-1]);
                arr2[i] = Math.max(arr2[i-2] + sticker[i], arr2[i-1]);
            }

            answer = Math.max(arr1[sticker.length - 2], arr2[sticker.length - 1]);
        }

        return answer;
    }
}
