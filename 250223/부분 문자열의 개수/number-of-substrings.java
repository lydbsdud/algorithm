import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String x = sc.next();
        int count =0;
        char[] arr = new char[1000];
        for(int i=0;i<st.length();i++){
            arr[i]=st.charAt(i);
        }
        for(int i=0;i<st.length()-1;i++){
            if(arr[i]==x.charAt(0)&& arr[i+1]==x.charAt(1)){
                count++;
            }
        }
        System.out.print(count);
    }
}