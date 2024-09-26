import org.w3c.dom.ls.LSOutput;

public class constructure_ {
    public static void main(String[] args) {
        Student s=new Student("Virat");
        System.out.println(s.name);
    }



}
class Student{
    String name;
    int roll;
    Student(String name){
        this.name=name;
    }
}