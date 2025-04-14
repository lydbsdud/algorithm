import java.util.Scanner;
class F {
    String code;
    char color;
    int second;
    public F (String code, char color, int second){
        this.code = code;
        this.color = color;
        this.second = second;
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uCode = sc.next();
        char lColor = sc.next().charAt(0);
        int time = sc.nextInt();
        // Please write your code here.
        F f = new F(uCode,lColor,time);
        System.out.println("code : "+f.code);
        System.out.println("color : "+f.color);
        System.out.println("second : "+f.second);
    }
}