import java.util.Scanner;

public class Engineer extends Human {
    private String name;
    private int age;
    private String skill;
    private double salary;

    public Engineer(String name, int age, String skill, double salary) {
        this.name = name;
        this.age = age;
        this.skill = skill;
    }
    public Engineer(){
        this.name = "William";
        this.age = 28;
        this.skill = "OOP";
        this.salary = 2.34;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getSkill() {
        return skill;
    }
    public void setSkill(String skill) {
        this.skill = skill;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
