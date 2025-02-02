import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int max = 1;
        int min = 1000;
        for(int i=0;i<10;i++){
            int num = sc.nextInt();
            if(num<500 && num>max){
                max = num;
            }
            if(num>500 && num<min){
                min = num;
            }
        }
        System.out.print(max+" "+min);
    }
}