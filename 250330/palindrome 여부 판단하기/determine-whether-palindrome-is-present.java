import java.util.Scanner;
public class Main {
    public static boolean palindrom(String st){
        int right = st.length()-1;
        int left = 0;
        char[] arr = st.toCharArray();
        while(left<right){
            char temp = arr[left];
            arr[left]=arr[right];
            arr[right]=temp;
            left++;
            right--;
        }
        return st.equals(new String (arr));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        // Please write your code here.
        if(palindrom(input)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }
    }
}