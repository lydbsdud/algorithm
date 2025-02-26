import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int k = st.length();
        while(st.length()!=1){
            int x = sc.nextInt();
        
            if(x==0){
                st = st.substring(1,st.length()-1)+st.substring(st.length()-1);
                System.out.println(st);
                continue;
            }
            if(x==st.length()-1||st.length()<=x){
                st=st.substring(0,st.length()-1);
                System.out.println(st);
                continue;
            }
            st = st.substring(0,x)+st.substring(x+1,st.length()-1)+st.substring(st.length()-1);
            System.out.println(st);
        }
    }
}