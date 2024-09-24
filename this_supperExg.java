public class this_supperExg {
    public static void main(String[] args) {
        Child child=new Child("Parent","Child");
        child.print();
        Parent p=new Parent("Parent");
    }
}
class Parent{
    String name;
    Parent(String n){
        name=n;
    }
}
class Child extends Parent{
    Child(String n1 , String n2){
        super(n1);
        this.name=n2;
//        this.print();
    }
    void print(){
        System.out.println(super.name+"<- this is super name: "+ name);
    }
}


