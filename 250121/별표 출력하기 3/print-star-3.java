import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    for(int i=0;i<n;i++){
        for(int x=0;x<2*i;x++){
            System.out.print(" ");
        }
        for(int t=0;t<9-2*i;t++){
            System.out.print("* ");
        }
        System.out.println();
    }
    }
}