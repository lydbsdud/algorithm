import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a=1;
        int N = sc.nextInt();
        for(int i=1;i<=10;i++){
            a*=2;
            if(a==N){
            System.out.print(i);
            break;
            }   
        }
    }
}