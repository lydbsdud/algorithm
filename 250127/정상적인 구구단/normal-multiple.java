import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1; i<=n;i++){
            for(int t=1; t<=n;t++){
                System.out.print(i+" * "+t+" = "+(t*i));
                if(t<n){
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}