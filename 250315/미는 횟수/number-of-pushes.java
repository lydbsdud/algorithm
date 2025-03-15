import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();
        int count =0 ;
        for(int i=0;i<st1.length();i++){
            st1 = st1.charAt(st1.length()-1)+st1.substring(0,st1.length()-1);
            count++;
            if(st1.equals(st2)){
                break;
            }
        }
        if(count==st1.length()){
            System.out.print(-1);
        }
        else{
            System.out.print(count);
        }
    }
}