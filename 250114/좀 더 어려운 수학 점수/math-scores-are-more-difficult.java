import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner (System.in);
        int a_math = sc.nextInt();
        int a_en = sc.nextInt();
        int b_math = sc.nextInt();
        int b_en = sc.nextInt();
        if(a_math>b_math){
            System.out.print("A");
        }
        if(b_math>a_math){
            System.out.print("B");
        }
        if(a_math==b_math){
            if(a_en>b_en){
                System.out.print("A");
            }
            else if (b_en>a_en){
                System.out.print("B");
            }
        }
    }
}