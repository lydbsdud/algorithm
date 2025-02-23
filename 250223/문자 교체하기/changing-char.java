import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s2 = sc.next();
        char[] arr = s1.toCharArray();
        char[] arr2 = s2.toCharArray();
        arr2[0]=arr[0];
        arr2[1]=arr[1];
        for(int i=0;i<s2.length();i++){
            System.out.print(arr2[i]);
        }
    }
}