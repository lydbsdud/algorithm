import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char arr[] = new char[100];
        for(int i=0;i<st.length();i++){
            arr[i]=st.charAt(i);
        }
        for(int i=st.length()-1;i>=0;i--){
            if(i%2!=0){
                System.out.print(arr[i]);
            }
        }
    }
}