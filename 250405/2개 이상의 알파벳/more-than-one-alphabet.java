import java.util.Scanner;
public class Main {
    public static boolean isMagicString(String x){
        char[] arr = new char[x.length()];
        int count = 0;
        for(int i=0;i<x.length()-1;i++){
            arr[i]=x.charAt(i);
        }
        for(int i=0;i<x.length()-1;i++){
            if(arr[i]!=arr[i+1]){
                count++;
            }
        }
        if(count>=2){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        // Please write your code here.
        if(isMagicString(A)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}