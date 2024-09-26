public class encapsule_wthPrivate {
    public static void main(String[] args) {
//        System.out.println("Hello world!");
    Person person=new Person();
    person.setAge(22);
    person.setName("Virat");
    int a=person.getAge();
    System.out.println(a);
    System.out.println(person.getAge());
    System.out.println( person.getName());
    }
}
class Person{
    private String name;
    private int age;

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


}
//class void setAge(int age){
