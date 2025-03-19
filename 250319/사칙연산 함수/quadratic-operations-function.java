import java.util.Scanner;
public class Main {
    public static int cal(int a, int b, char c){
        if (c=='+'){
            return a+b;
        }
        else if(c=='-'){
            return a-b;
        }
        else if(c=='/'){
            return a/b;
        }
        else if(c=='*'){
            return a*b;
        }
        return 100000;   
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        char o = sc.next().charAt(0);
        int c = sc.nextInt();
        // Please write your code here.
        int result = cal(a,c,o);
        if(result==100000){
            System.out.print("False");
        }
        else{
            System.out.print(a+" "+o+" "+c+" = "+result);
        }
    }
}