package method;

public class Student {
    public String name;
    public int age;
    public String grade;

    public Student(String name, int age, String grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
     public void introduce() {
        System.out.println("Hi , i'm  " + name + ", I'm " + age + " years old and my grade is " + grade + "");
    }
}
