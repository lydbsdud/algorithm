import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                if(t%2==0){
                    System.out.print(a);
                }
                else{
                    System.out.print(n-b);
                }
            }
            a++;
            b++;
            System.out.println();
        }
    }
}