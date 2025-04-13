import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        int f = 2*n-1;
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(num);
        for(int i=0; i<n;i++){
            if(sum<=num[i]+num[f]){
                sum=num[i]+num[f];
            }
            f--;
        }
        System.out.print(sum);
    }
}