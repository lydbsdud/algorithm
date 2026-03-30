import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        Map<String, String> nameMap = new HashMap<>();
        List<String> result = new ArrayList<>();
        
        for(int i =0; i<record.length; i++){
            String s[] = record[i].split(" ");
            if(!s[0].equals("Leave")){
                nameMap.put(s[1], s[2]);
            }
        }
        
        for(int i=0; i<record.length; i++){
            String s[] = record[i].split(" ");
            if(s[0].equals("Change")){ continue; }
            
            String action = s[0].equals("Enter")? "들어왔습니다.":"나갔습니다.";
            result.add(nameMap.get(s[1])+"님이 "+action);
        }
        return result.toArray(new String[0]);
    }
}