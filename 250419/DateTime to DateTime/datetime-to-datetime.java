import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        // Please write your code here.
        int min = 0;
        int day = 11;
        int h = 11;
        int m =11;
        while(true){
            int totalA = 11+11*60+11*60*24;
            int totalB = C+B*60+A*60*24;
            if(totalA>totalB){
                System.out.print(-1);
            }
            if(day==A&&h==B&&m==C){
                System.out.print(min);
                break;
            }
            min++;
            m++;
            if(m==60){
                m=0;
                h++;
            }
            if(h==24){
                day++;
                h=0;
            }
        }
    }
}