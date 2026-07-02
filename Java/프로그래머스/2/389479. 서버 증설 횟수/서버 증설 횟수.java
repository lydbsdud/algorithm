class Solution {
    public int solution(int[] players, int m, int k) {
        int count = 0;
        int serverCount = 1;
        int[] arr = new int[24];
        for(int i=0; i<players.length; i++){
            if(i-k>=0 && arr[i-k]>0){
                serverCount -= arr[i-k];
            }
            if(players[i] >= serverCount*m ){
                if(players[i] == serverCount*m){
                    serverCount++;
                    count++;
                    arr[i]++;
                }else{
                    int serverplus = (players[i]-(serverCount*m))/m + 1;
                    serverCount += serverplus;
                    count += serverplus;
                    arr[i] += serverplus;
                }
            }
        }
        return count;
    }
}