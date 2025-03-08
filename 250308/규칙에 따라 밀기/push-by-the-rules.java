import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String xr = sc.next();
        int n = st.length();
        for(int i=0;i<xr.length();i++){
            char x = xr.charAt(i);
            if(x=='L'){
                st = st.substring(1)+st.charAt(0);
            }
            else if(x=='R'){
                st = st.substring(n-1)+st.substring(0,n-1);
            }
        }
        System.out.print(st);
    }
}