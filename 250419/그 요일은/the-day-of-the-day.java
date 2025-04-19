import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m1 = sc.nextInt();
        int d1 = sc.nextInt();
        int m2 = sc.nextInt();
        int d2 = sc.nextInt();
        String A = sc.next();
        // Please write your code here.
        int[] num_of_days = new int[]{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] days = new String[]{"Mon", "Tue","Wed","Thu","Fri","Sat","Sun"};
        int totalA = 0;
        int totalB = 0;
        for(int i=1;i<=m1;i++){
            totalA+=num_of_days[i];
        }
        for(int i=1;i<=m2;i++){
            totalB+=num_of_days[i];
        }
        int m = (Math.abs(totalA-totalB)+2)%7;
        System.out.print(m);
    }
}