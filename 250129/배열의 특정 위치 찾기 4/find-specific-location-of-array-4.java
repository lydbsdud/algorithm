import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int arg[]= new int[10];
        int k = 10;
        int count = 0;
        int sum = 0;
        for(int i=0;i<10;i++){
            arg[i]=sc.nextInt();
            if(arg[i]==0){
                k = i;
                break;
            }
        }
        for(int j=0;j<k;j++){
            if(arg[j]%2==0){
                count++;
                sum+=arg[j];
            }
        }
        System.out.print(count+" "+sum);
    }
}