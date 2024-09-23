public class var_shadowing {
    public static void main(String[] args) {
        B b=new B();
        b.print();

    }
}

class  A{
    String city;
}

class B extends A{
    String city;
    void print (){
        super.city="Beas";
        city="Delhi";
        System.out.println("Parents city "+ super.city );
        System.out.println("Child city " +city);
    }
}

