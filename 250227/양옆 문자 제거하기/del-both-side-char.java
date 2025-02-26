import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String str = st.substring(0,1)+st.substring(2,st.length()-2)+st.substring(st.length()-1);
        System.out.print(str);
    }
}