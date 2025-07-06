import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
        }
        int result = 0;
        for(int i=0;i<n-2;i++){
            for(int t=i+1;t<n-1;t++){
                for(int k=t+1;k<n;k++){
                    if((arr[i]<=arr[t])&&(arr[t]<=arr[k])){
                        result++;
                    }
                }
                
            }
        }
        System.out.print(result);
    }
}