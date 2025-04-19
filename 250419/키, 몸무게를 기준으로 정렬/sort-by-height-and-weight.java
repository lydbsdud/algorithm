import java.util.Scanner;
import java.util.Arrays;
class Student implements Comparable<Student>{
    String name;
    int h,w;
    public Student(String name, int h, int w){
        this.name = name;
        this.h = h;
        this.w =w;
    }
    public int compareTo(Student student){
        if(student.h==this.h){
            return student.w-this.w;
        }
        return this.h-student.h;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            String name = sc.next();
            int height = sc.nextInt();
            int weight = sc.nextInt();
            // Please write your code here.
            students[i] = new Student(name, height, weight);
        }
        Arrays.sort(students);
        for(int i=0;i<n;i++){
            System.out.println(students[i].name+" "+students[i].h+" "+students[i].w);
        }
    }
}