class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ");
        StringBuilder sb = new StringBuilder();
        
        int max = Integer.parseInt(arr[0]);
        int min = max;
        
        for(int i = 0; i < arr.length; i++) {
            int num = Integer.parseInt(arr[i]);
            if(num > max) {
                max = num;
            }else if(num < min){
                min = num;
            }
        }
        
        sb.append(min)
          .append(" ")
          .append(max);
        
        return sb.toString();
    }
}