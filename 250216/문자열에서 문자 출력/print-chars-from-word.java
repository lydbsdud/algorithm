import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        for(int i=0;i<st.length();i++){
            System.out.println(st.charAt(i));
        }
    }
}