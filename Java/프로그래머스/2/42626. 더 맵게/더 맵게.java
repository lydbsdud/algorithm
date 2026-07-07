import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        
        for (int num : scoville) {
            pq.offer(num);
        }
        
        int count = 0;
        
        while (pq.size() > 1 && pq.peek() < K) {
            int f = pq.poll();
            int s = pq.poll();
            pq.offer(f + s * 2);
            count++;
        }
        return pq.peek() >= K ? count : -1;
    }
}