import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String binary = sc.next();
        // Please write your code here.
        int num = 0;
        int result[] = new int[200];
        int cnt = 0;
        int arr[] = new int[binary.length()];
        for(int i=0;i<binary.length();i++){
            arr[i] = binary.charAt(i)-'0';
            num = num*2+arr[i];
        }
        num = num*17;
        while(true){
            if(num<2){
                result[cnt++]=num;
                break;
            }
            result[cnt++] = num%2;
            num/=2;
        }
        for(int i = cnt-1; i>=0;i--){
            System.out.print(result[i]);
        }
    }
}