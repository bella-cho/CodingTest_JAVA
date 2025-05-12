class Solution {
    public int[] solution(int n) {
        //홀수이기때문에 +1을 한 후 /2
        int[] answer = new int[(n+1)/2];
        
        // 인덱스를 지정해주기위해 임의로 변수 작성
        int a=0;
        for(int i=1 ; i<=n ; i++){
            if(i%2 != 0){
                answer[a] = i;
                a++;
            }
        }
        
        return answer;
    }
}