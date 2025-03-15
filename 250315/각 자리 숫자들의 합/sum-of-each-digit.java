import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = 0;
        String st = Integer.toString(a);
        for(char ch: st.toCharArray()){
            b+=Character.getNumericValue(ch);
        }
        System.out.print(b);
    }
}