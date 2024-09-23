public class method_overriding {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.eats();
        Lion l=new Lion();
        l.eats();
        l.run();
    }
}

class Animal{
    void eats(){
        System.out.println("eats anything");
    }
}
class Lion extends Animal{
    void eats(){
        System.out.println("eats only flesh");
    }
    void run(){
        System.out.println("not run  very fast");
    }
}

