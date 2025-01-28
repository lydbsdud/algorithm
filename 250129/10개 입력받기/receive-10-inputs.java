import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        int i = 0;
        int n = 10;
        double sum=0;
        while(i<10){
            arr[i] = sc.nextInt();
            if(arr[i]==0){
                n=i;
                break;
            }
            sum+=arr[i];
            i++;
        }
        double avg = sum/n;
        System.out.printf("%.0f %.1f",sum,avg);
    }
}