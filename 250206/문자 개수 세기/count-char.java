import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        int count = 0;
        char s = sc.next().charAt(0);
        for(int i=0;i<st1.length();i++){
            if(st1.charAt(i)==s){
                count++;
            }
        }
        System.out.print(count);
    }
}