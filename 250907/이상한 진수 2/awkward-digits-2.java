import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        int t = -1;
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='0'){
                t = i;
                break;
            }
        }
        int result = 0;
        int k = 1;
        for(int i=a.length()-1;i>=0;i--){
            if(a.length()==1){
                if(a.charAt(0)=='0'){
                    result = 1;
                    break;
                }
                else{
                    result = 0;
                    break;
                }
            }
            if(t==-1 && i==a.length()-1){
                result+=k*0;
                k*=2;
                continue;
            }
            if(i==t){
                result+=k*1;
                k*=2;
                continue;
            }
            result+=k*(a.charAt(i)-'0');
            k*=2;
        }
        System.out.print(result);
    }
}