import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char x = sc.next().charAt(0);
        if(x=='z'){
            System.out.print('a');
        }
        else{
            System.out.print((char)((int)x+1));
        }
    }
}