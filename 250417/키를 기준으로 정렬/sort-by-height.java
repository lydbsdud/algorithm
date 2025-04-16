import java.util.Scanner;
import java.util.Arrays;
class Student {
    String name;
    int cm;
    int kg;
    public Student (String name, int cm, int kg){
        this.name = name;
        this.cm = cm;
        this.kg = kg;
    }

}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // Please write your code here.
        Student[] students = new Student[n];
        for(int i=0;i<n;i++){
            String name = sc.next();
            int cm = sc.nextInt();
            int kg = sc.nextInt();
            students[i]= new Student(name, cm, kg);
        }
        Arrays.sort(students, (a,b)->(a.cm-b.cm));
        for(int i=0;i<n;i++){
            System.out.println(students[i].name+" "+students[i].cm+" "+students[i].kg);
        }
    }
}