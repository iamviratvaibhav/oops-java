public class demonstrate_overriding{
    public static void main(String[] args) {
        Deer d=new Deer();
        d.run();
        d.eat();
    }
}

class Deer {
    void eat(){
        System.out.println("eats grass:");
    }
    Deer run(){
        System.out.println("run fast:");
        return new Deer();
    }
}
