import java.util.Scanner;

public class Student extends Human {
    String grade;
    double score;

    public Student(int code, String name, int age, String grade, double score) {
        super(code, name, age);
        this.grade = grade;
        this.score = score;
    }

    public Student() {
        super();

    }
     public String getGrade() {
        return grade;
     }
     public double getScore() {
        return score;
     }
     public void setGrade(String grade) {
        this.grade = grade;
     }
     public void setScore(double score) {
        this.score = score;
     }
    public void input() {
        super.input();
        Scanner ip = new Scanner(System.in);
        System.out.println("Input Grade :");
        grade = ip.nextLine();
        System.out.println("Input Score :");
        score = ip.nextDouble();
    }

    public void output() {
        super.output();
        System.out.println("Score :" + score);
        System.out.println("Grade :" + grade);
    }

}
