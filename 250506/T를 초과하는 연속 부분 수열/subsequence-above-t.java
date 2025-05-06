import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] arr = new int[n];
        int count = 0;
        int sum = 1;
        for (int i = 0; i < n; i++){
            arr[i] = sc.nextInt();
            if(i==0||((arr[i]>t)&&(arr[i-1]>t))){
                count++;
            }
            else{
                count = 1;
            }
            if(sum<count){
                sum = count;
            }
       }
       System.out.print(sum);
    }
}