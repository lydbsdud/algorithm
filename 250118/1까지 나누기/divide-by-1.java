import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int i=1;
        int count=0;
        while(n>1){
            n/=i;
            i++;
            count++;
        }
        System.out.print(count);
    }
}