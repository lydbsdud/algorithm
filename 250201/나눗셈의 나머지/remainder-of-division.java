import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int arrMod[] = new int[100];
        int arrCount[] = new int[10];
        int sum=0;
        for(int i=0;i<100;i++){
            arrMod[i]=a%b;
            a/=b;
            arrCount[arrMod[i]]++;
            if(a<=1){
                break;
            }
        }
        for(int i=0;i<10;i++){
            arrCount[i]*=arrCount[i];
            sum+=arrCount[i];
            //System.out.print(arrCount[i]);
        }
        System.out.print(sum);
    }
}