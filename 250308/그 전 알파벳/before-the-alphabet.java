import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x=='a'){
            System.out.print('z');
        }else{
            System.out.print((char)(x-1));
        }
    }
}