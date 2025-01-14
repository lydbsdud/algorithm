import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int age1 = sc.nextInt();
        String s_sex1 = sc.next();
        char sex1 = s_sex1.charAt(0);
        int age2 = sc.nextInt();
        String s_sex2 = sc.next();
        char sex2 = s_sex2.charAt(0);
        if((age1>=19 && sex1=='M')||(age2>=19 && sex2=='M')){
            System.out.print(1);
        }
        else{
            System.out.print(0);
        }

    }
}