import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<10;i++){
            String st = sc.next();
            if(st.equals("END")){
                break;
            }
            char[] arr = st.toCharArray();
            int left =0;
            int right=(st.length()-1);
            while(left<right){
                char temp = arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            String reversed = new String(arr);
            System.out.println(arr);
        }
    }
}