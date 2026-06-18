import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        Deque<Integer> queue = new ArrayDeque<>();
        for(int num : arr){
            if(!queue.isEmpty() && queue.peekLast() == num){
                continue;
            }
            queue.offer(num);
        }
        int[] answer = new int[queue.size()];
        int index = 0;
        for(int num : queue){
            answer[index++] = num;
        }

        return answer;
    }
}