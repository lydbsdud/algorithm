import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        if(st1.length()>st2.length()){
            System.out.print(st1+" "+st1.length());
        }
        else if(st1.length()<st2.length()){
            System.out.print(st2+" "+st2.length());
        }else{
            System.out.print("same");
        }
    }
}