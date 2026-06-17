import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        HashSet<String> set = new HashSet<>();
        for(String num : phone_book){
            set.add(num);
        }
        for(String phone: set) {
            for(int i=1; i<phone.length(); i++){
                String prefix = phone.substring(0, i);
                
                if(set.contains(prefix)){
                    return false;
                }
            }
        }
        return true;
    }
}