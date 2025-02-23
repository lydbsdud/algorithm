import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] arr = st.toCharArray();
        int x = st.length();
        arr[1]='a';
        arr[x-2]='a';
        for(int i=0;i<x;i++){
            System.out.print(arr[i]);
        }
    }
}