import java.util.Scanner;
class F{
    int a;
    String b;
    public F(){
        this.a = 50;
        this.b = "codetree";
    }
    public F(int a, String b){
        this.a = a;
        this.b = b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String id2 = sc.next();
        int code2 = sc.nextInt();
        // Please write your code here.
        F f = new F();
        System.out.println("product "+f.a+" is "+f.b);
        F f2 = new F(code2, id2);
        System.out.println("product "+f2.a+" is "+f2.b);
    }
}