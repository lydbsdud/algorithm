import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String a_x = sc.next();
        char a = a_x.charAt(0);
        int aTemp = sc.nextInt();
        String b_x = sc.next();
        char b = b_x.charAt(0);
        int bTemp = sc.nextInt();
        String c_x = sc.next();
        char c = c_x.charAt(0);
        int cTemp = sc.nextInt();
        if(a=='Y'&&aTemp>=37){
            if(b=='Y'&&bTemp>=37){
                System.out.print('E');
            }
            else if(c=='Y'&&cTemp>=37){
                System.out.print('E');
            }
            else{
                System.out.print('N');
            }
        }
        else if(b=='Y'&& bTemp>=37){
            if(c=='Y'&&cTemp>=37){
                System.out.print('E');
            }
            else{
                System.out.print('N');
            }
        }
        else{
            System.out.print('N');
        }
    }
}