import java.util.Scanner;
import java.util.Arrays;
class Student{
    String name;
    int height;
    double weight;
    public Student(String name, int height, double weight){
        this.name = name;
        this.weight = weight;
        this.height = height;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        String[] names = new String[n];
        int[] heights = new int[n];
        double[] weights = new double[n];
        Student[] students = new Student[n];
        for (int i = 0; i < n; i++) {
            names[i] = sc.next();
            heights[i] = sc.nextInt();
            weights[i] = sc.nextDouble();
            students[i] = new Student(names[i], heights[i],weights[i]);
        }
        System.out.println("name");
        Arrays.sort(students, (a, b) -> a.name.compareTo(b.name));
        for(int i=0;i<n;i++){
            System.out.println(students[i].name+" "+students[i].height+" "+students[i].weight);
        }
        System.out.println();
        System.out.println("height");
        Arrays.sort(students, (a,b) -> b.height - a.height);
        for(int i=0;i<n;i++){
            System.out.println(students[i].name+" "+students[i].height+" "+students[i].weight);
        }

    }
}