import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[200000];
        int k = 100000;
        int w = 0;
        int b = 0;
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            char d = sc.next().charAt(0);
            if(d=='R'){
                for(int j=k;j<k+x;j++){
                    arr[j] = -1;
                }
                k=k+x-1;
            }
            else{
                for(int j=k;j>k-x;j--){
                    arr[j] = 1;
                }
                k=k-x+1;
            }
        }
        for(int j=0;j<200000;j++){
            if(arr[j]==-1){
                b++;
            }
            else if(arr[j]==1){
                w++;
            }
        }
        System.out.print(w+" "+b);
    
    }
}