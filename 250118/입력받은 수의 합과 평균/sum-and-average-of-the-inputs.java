import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int count = 0;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            sum+=num;
            count++;
        }
        double avg = (double)sum/count;
        System.out.printf("%d %.1f",sum,avg);
    }
}