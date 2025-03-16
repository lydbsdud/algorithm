import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        char[] arr = new char[st.length()];
        int count1 = 0;
        int count2 = 0;
        for(int i=0;i<st.length();i++){
            arr[i]=st.charAt(i);
        }
        for(int i=0;i<=st.length()-2;i++){
            if(arr[i]=='e'&&arr[i+1]=='e'){
                count1++;
            }
            if(arr[i]=='e'&&arr[i+1]=='b'){
                count2++;
            }
        }
        System.out.print(count1+" "+count2);
        
    }
}