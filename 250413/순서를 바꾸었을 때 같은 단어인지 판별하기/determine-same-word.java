import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word1 = sc.next();
        String word2 = sc.next();
        // Please write your code here.
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        String st1 = new String(arr1);
        String st2 = new String(arr2);
        if(st1.equals(st2)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    

    }
}