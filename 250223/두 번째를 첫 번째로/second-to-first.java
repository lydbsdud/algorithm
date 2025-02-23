import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] arr = st.toCharArray();
        char x = st.charAt(0);
        char y = st.charAt(1);
        for(int i=0;i<st.length();i++){
            if(arr[i]==y){
                arr[i]=x;
            }
            System.out.print(arr[i]);
        }
    }
}