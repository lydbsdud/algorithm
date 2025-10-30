import java.util.Scanner;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> v = new ArrayList<>();
        for(int i = 0 ; i < n ; i++){
            String str = sc.next();
            if(str.equals("push_back")){
                int num = sc.nextInt();
                v.add(num);
            }else if(str.equals("pop_back")){
                v.remove(v.size()-1);
            }else if(str.equals("size")){
                System.out.println(v.size());
            }else if(str.equals("get")){
                int num = sc.nextInt();
                System.out.println(v.get(num-1));
            }
        }
    }
}