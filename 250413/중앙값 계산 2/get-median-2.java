import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Integer[] nums = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        for (int i = 0; i < n; i+=2) {
            if(i==0){
                System.out.print(nums[0]+" ");
                continue;
            }
            Arrays.sort(nums,0,i+1);
            System.out.print(nums[i/2]+" ");
        }
        
        // Please write your code here.
    }
}