import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        int index = st.indexOf('e');
        if(index==0){
            st=st.substring(1);
        }
        else{
            st = st.substring(0, index) + st.substring(index+1);
        }
        System.out.print(st);
    }
}