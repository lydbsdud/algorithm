import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int n = st.length();
        System.out.println(st);
        for(int i=0;i<n;i++){
            st=st.substring(n-1)+st.substring(0,n-1);
            System.out.println(st);
        }
    }
}