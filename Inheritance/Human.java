import java.util.Scanner;

public class Human {

    private int code;
    private String name;
    private int age;

    public Human(int code, String name, int age) {
        this.code = code;
        this.name = name;
        this.age = age;
    }

    public Human() {

    }

    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void input() {
        Scanner ip = new Scanner(System.in);
        System.out.println("Input code:");
        code = ip.nextInt();
        System.out.println("Input age:");
        age = ip.nextInt();
        ip.nextLine();
        System.out.println("Input name:");
        name = ip.nextLine();
    }

    public void output(){
        System.out.println("Human code: " + code);
        System.out.println("Human name: " + name);
        System.out.println("Human age: " + age);
    }

}
