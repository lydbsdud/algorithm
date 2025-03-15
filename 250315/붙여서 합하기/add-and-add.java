import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        int a = Integer.parseInt(st1+st2);
        int b = Integer.parseInt(st2+st1);
        System.out.print(a+b);

    }
}