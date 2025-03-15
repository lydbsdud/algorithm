import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int sum=0;
        int count = 0;
        for(int i=0;i<10;i++){
            int n = sc.nextInt();
            if(n>=250){
                break;
            }
            count++;
            sum+=n;
        }
        double avg = (double)sum/count;
        System.out.printf("%d %.1f",sum,avg);
    }
}