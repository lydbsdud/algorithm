import java.util.Scanner;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            nums[i] = sc.nextInt();
        }
        // Please write your code here.
        Integer[] num = Arrays.stream(nums).boxed().toArray(Integer[]::new);
        Arrays.sort(num);
        System.out.print(num[1]+num[2*n-1]);
    }
}