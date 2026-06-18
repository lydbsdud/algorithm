import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        Deque<Integer> queue = new ArrayDeque<>();
        Deque<Integer> queue2 = new ArrayDeque<>();
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int progress : progresses){
            queue.offer(progress);
        }
        for(int speed : speeds){
            queue2.offer(speed);
        }
        
        while(!queue.isEmpty()){
            int size = queue.size();
            int count = 0;
            for(int i =0 ; i<size; i++){
                int pro = queue.pollFirst();
                int sp = queue2.pollFirst();
                queue.offerLast(pro+sp);
                queue2.offerLast(sp);
            }
            while(!queue.isEmpty() && queue.peekFirst()>=100){
                queue.pollFirst();
                queue2.pollFirst();
                count++;
            }
            if(count != 0){
                list.add(count);
            }
        }
        int[] answer = new int[list.size()];
        int index = 0;
        for(int num : list){
            answer[index++] = num;
        }
        return answer;
    }
}