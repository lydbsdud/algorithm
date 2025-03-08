import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        String str = st.substring(1)+st.substring(0,1);
        System.out.print(str);
    }
}