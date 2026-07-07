import java.util.*;
class Solution {
    public long solution(int n, int[] works) {
        PriorityQueue<Integer> maxPq = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int work : works) {
            maxPq.offer(work);
        }
        while(n > 0){
            int max = maxPq.poll();
            if(max == 0){
                return 0;
            }
            maxPq.offer(max - 1);
            n--;
        }
        long answer = 0;
        while(!maxPq.isEmpty()){
            int num = maxPq.poll();
            answer += (long) num * num;
        }
        return answer;
    }
}