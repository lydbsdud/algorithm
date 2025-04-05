import java.util.Scanner;
public class Main {
    public static int[] isMagic(int a, int b){
        int[] result = new int[2];
        if(a>=b){
            result[0]=a*2;
            result[1]=b+10;
        }
        else{
            result[0]=a+10;
            result[1]=b*2;
        }
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Please write your code here.
        int[] result = isMagic(a,b);
        System.out.print(result[0]+" "+result[1]);
    }
}