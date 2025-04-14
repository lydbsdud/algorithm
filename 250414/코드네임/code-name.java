import java.util.Scanner;
class CodeName{
    char a;
    int b;
    public CodeName(char a, int b){
        this.a = a;
        this.b = b;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Please write your code here.
        CodeName[] codeNames = new CodeName[5];
        int min = 100 ;
        int idx = 0;
        for(int i=0;i<5;i++){
            char a = sc.next().charAt(0);
            int b = sc.nextInt();
            codeNames[i] = new CodeName(a,b);
            if(min>codeNames[i].b){
                min= codeNames[i].b;
                idx = i;
            }
        }
        System.out.print(codeNames[idx].a+" "+codeNames[idx].b);
    }
}