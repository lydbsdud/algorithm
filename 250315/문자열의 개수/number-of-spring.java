import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String[] arr = new String[200];
        int count = 0;
        for(int i=0;i<200;i++){
            arr[i]=sc.next();
            if(arr[i].equals("0")){
                break;
            }
            count++;
        }
        System.out.println(count);
        for(int i=0;i<count;i++){
            if(i%2==0){
                System.out.println(arr[i]);
            }
        }
    }
}