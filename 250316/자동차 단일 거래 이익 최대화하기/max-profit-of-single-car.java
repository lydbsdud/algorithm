import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int max = 0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                if(i<t && max< arr[t]-arr[i]){
                    max=arr[t]-arr[i];
                }
            }
        }
        System.out.print(max);
    }
}