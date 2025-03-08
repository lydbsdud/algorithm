import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int len = st.length();
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
            int k = sc.nextInt();
            if(k==1){
                st = st.substring(1) + st.substring(0,1);
                System.out.println(st);
            }
            else if(k==2){
                st = st.substring(len-1) + st.substring(0,len-1);
                System.out.println(st);
            }
            else if(k==3){
                for(int t=n-1;t>=0;t--){
                    st+=st.substring(t,t+1);
                } 
                st = st.substring(len);
                System.out.println(st);
            }
        }
    }
}