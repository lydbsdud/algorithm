import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        boolean x = false;
        for(int i=a; i<=b;i++){
            if(1920%i==0 && 2880%i==0){
                x=true;
            }
        }
        if(x==true){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }
    }
}