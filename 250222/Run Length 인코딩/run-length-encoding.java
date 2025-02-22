import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        char[] arr= new char[1001];
        char[] arr2= new char[1001];
        int[] arr3= new int[1001];
        String st = sc.next();
        int count=1;
        int plus =0;
        int t=0;
        for(int i=0;i<st.length();i++){
            arr[i]=st.charAt(i);
        }
        for(int i=0;i<st.length();i++){
            if(arr[i]==arr[i+1]){
                count++;
                continue;
            }
            arr2[t]=arr[i];
            arr3[t]=(char)count;
            t++;
            if(count>=10){
                plus++;
            }
            count=1;
        }
        System.out.println(t*2+plus);
        for(int i=0;i<t;i++){
            System.out.print(arr2[i]);
            System.out.print(arr3[i]);
        }
    }
}