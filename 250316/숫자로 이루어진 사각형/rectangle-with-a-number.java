import java.util.Scanner;
public class Main {
    public static void square(int n){
        int k = 1;
        for(int i=0;i<n;i++){
            for(int t=0;t<n;t++){
                System.out.print(k+" ");
                k++;
                if(k>9){
                    k=1;
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        square(n);
    }
}