import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int n = sc.nextInt();
        int a = 1;
        int b = 0;
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                if(i%2==0){
                    System.out.print(a+" ");
                    a++;
                }
                else{
                    System.out.print(b+" ");
                    b--;
                }
            }
            if(i%2!=0){
                a=b+n+1;
            }
            else{
                b=a+n-1;
            }
            System.out.println();
        }
    }
}