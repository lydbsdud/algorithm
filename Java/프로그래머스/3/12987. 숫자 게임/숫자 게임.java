import java.util.*;

class Solution {
    public int solution(int[] A, int[] B) {
        PriorityQueue<Integer> a = new PriorityQueue<>();
        PriorityQueue<Integer> b = new PriorityQueue<>();
    
        int score = 0;
        
        for (int i = 0; i < A.length; i++) {
            a.offer(A[i]);
            b.offer(B[i]);
        }
        while(!b.isEmpty()){
            if(a.peek() < b.peek()) {
                score++;
                a.poll();
                b.poll();
            } else {
                b.poll();
            }
        }
        return score;
    }
}