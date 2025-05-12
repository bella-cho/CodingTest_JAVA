import java.util.*;

class Solution {
    public int solution(int[] array) {
        
        int answer = 0;
        
        Arrays.sort(array);
        
        int max = array[array.length-1];
        int[] count = new int[max + 1];
        
        int[] arrayCopy = new int[array.length];
        
        for(int num : array){
            count[num]++;
        }
        int prev = -1;
        for(int i=0; i<count.length; i++){
            if(prev < count[i]){
                prev = count[i];
                answer = i;
            }else if(prev == count[i]){
                answer = -1;
            }
        }
        
        return answer;
    }
}

