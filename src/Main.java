class Student{
    int age;
    String name;

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
            "age=" + age +
            ", name='" + name + '\'' +
            '}';
    }
}
public class Main {

    public static void main(String[] args) {
        System.out.println("Sveikas pasaulį!");
    }
}
