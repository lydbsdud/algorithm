import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int k = 1000;
        int[] arr = new int[2001];
        for (int i = 0; i < N; i++) {
            int x = sc.nextInt();
            char dir = sc.next().charAt(0);
            // Please write your code here.
            if(dir=='R'){
                for(int j=k;j<k+x;j++){
                    arr[j]++;
                }
                k+=x;
            }
            if(dir=='L'){
                for(int j=k-x;j<k;j++){
                    arr[j]++;
                }
                k-=x;
            }
        }
        int count = 0;
        for(int i=0;i<2001;i++){
            
            if(arr[i]>=2){
                count++;
            }
        }
        System.out.print(count);
    }
}