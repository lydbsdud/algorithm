import java.util.Scanner;
public class Main {
    public static boolean isTrue(int m, int d){
        if(m==1||m==3||m==5||m==7||m==8||m==10||m==12){
            if(d>=1&&d<=31){
                return true;
            }
        }
        if(m==2){
            if(d>=1&&d<=28){
                return true;
            }
        }
        if(m==4||m==6||m==9){
            if(d>=1&&d<=30){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int d = sc.nextInt();
        // Please write your code here.
        if(isTrue(m,d)){
            System.out.print("Yes");
        }
        else{
            System.out.print("No");
        }
    }
}