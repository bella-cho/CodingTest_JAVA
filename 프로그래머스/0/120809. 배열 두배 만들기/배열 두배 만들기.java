class Solution {
    public int[] solution(int[] numbers) {
    
        //정수배열 사이즈 먼저 쓰기
        int[] answer = new int[numbers.length];
        for(int i=0 ; i<numbers.length; i++){
            answer[i] = numbers[i]*2;
        }
        
        return answer;
    }
}