import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc= new Scanner (System.in);
        int m = sc.nextInt();
        if (m==12 || m<=2 && m>=1){
            System.out.println("Winter");
        }
        else if(m>=9){
            System.out.println("Fall");
        }
        else if(m>=6){
            System.out.println("Summer");
        }
        else if(m>=3){
            System.out.println("Spring");
        }
    }
}