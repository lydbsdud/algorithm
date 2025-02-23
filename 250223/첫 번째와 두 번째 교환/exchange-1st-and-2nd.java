import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char a = st.charAt(0);
        char b = st.charAt(1);
        char[] arr = st.toCharArray();
        for(int i=0;i<st.length();i++){
            if(arr[i]==a){
                arr[i]=b;
            }
            else if(arr[i]==b){
                arr[i]=a;
            }
            System.out.print(arr[i]);
        }
    }
}