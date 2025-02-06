import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[]{"apple","banana","grape","blueberry","orange"};
        char n = sc.next().charAt(0);
        int count = 0;
        for(int i=0;i<5;i++){
            if(arr[i].charAt(2)==n || arr[i].charAt(3)==n){
                count++;
                System.out.println(arr[i]);
            }
        }
        System.out.println(count);
    }
}