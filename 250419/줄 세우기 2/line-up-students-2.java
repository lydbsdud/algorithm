import java.util.Scanner;
import java.util.Arrays;
class Stu implements Comparable<Stu>{
    int h;
    int w;
    int num;
    public Stu(int h, int w, int num){
        this.h = h;
        this.w = w;
        this.num = num;
    }
    public int compareTo(Stu stu){
        if(stu.h==this.h){
            return stu.w-this.w;
        }
        return this.h-stu.h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Stu[] stu = new Stu[n];
        for (int i = 0; i < n; i++) {
            int height = sc.nextInt();
            int weight = sc.nextInt();
            stu[i] = new Stu(height,weight,i+1);
        }
        // Please write your code here.
        Arrays.sort(stu);
        for(int i=0;i<n;i++){
            System.out.println(stu[i].h+" "+stu[i].w+" "+stu[i].num);
        }

    }
}