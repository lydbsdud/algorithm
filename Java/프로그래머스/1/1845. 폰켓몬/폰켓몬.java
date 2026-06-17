import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int size = nums.length/2;
        HashSet<Integer> map = new HashSet<>();
        for(Integer num : nums){
            map.add(num);
        }
        int answer = map.size() <= size ? map.size() : size;
        return answer;
    }
}