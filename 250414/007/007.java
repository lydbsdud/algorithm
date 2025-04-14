import java.util.Scanner;
class F{
    String a;
    char b;
    int c;
    public F(String a, char b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String sCode = sc.next();
        char mPoint = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        F f = new F(sCode, mPoint, time);
        System.out.println("secret code : "+sCode);
        System.out.println("meeting point : "+mPoint);
        System.out.println("time : "+time);
    }
}