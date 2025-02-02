import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        final int MIN = Integer.MIN_VALUE;
        int max = MIN;
        int max2 = MIN;
        int idx = -1;
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
            if(max<arr[i]){
                max=arr[i];
                idx = i;
            }
        }
        for(int i=0;i<n;i++){
            if(max2<arr[i]&& arr[i]<=max && idx!=i){
                max2=arr[i];
            }
        }
        System.out.print(max+" "+max2);
    }
}