import java.util.Scanner;

public class Main {
    public static int min(int a, int b, int c){
        int min = 0;
        if(a<=b&&a<=c){
            min=a;
        }
        else if(b<a&&b<=c){
            min=b;
        }
        else{
            min=c;
        }
        return min;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        // Please write your code here.
        int result = min(a,b,c);
        System.out.print(result);
    }
}