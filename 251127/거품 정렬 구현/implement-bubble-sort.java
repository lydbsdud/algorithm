import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        for(int i=0; i<n-1; i++){
            for(int t=0; t<n-1-i; t++){
                if(arr[t]>arr[t+1]){
                    int tmp = arr[t];
                    arr[t] = arr[t+1];
                    arr[t+1] = tmp;
                }
            }
        }
        for (int i = 0; i < n; i++)
            System.out.print(arr[i]+" ");
    }
}