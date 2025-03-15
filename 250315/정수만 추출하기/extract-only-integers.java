import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st1 = sc.next();
        String st2 = sc.next();
        String a ="";
        String b ="";
        for(char ch : st1.toCharArray()){
            if(!Character.isDigit(ch)){
                break;
            }
            a+=ch;    
        }
        for(char ch : st2.toCharArray()){
            if(!Character.isDigit(ch)){
                break;
            }
            b+=ch;    
        }
        System.out.print(Integer.parseInt(a)+Integer.parseInt(b));
    }
}