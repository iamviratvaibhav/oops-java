public class abstraction_ {
    public static void main(String[] args) {
        Horse black= new Horse();
        black.eat();
        black.walk();

        Chicken chick =new Chicken();
        chick.eat();
        chick.walk();
    }
}

abstract class Animal{
    void eat(){
        System.out.println("eats food ");
    }

    abstract void walk();
        // System.out.print("hii");
}

class Horse extends Animal {
    void walk(){
        System.out.println("walk with 4 legs");
    }

    void eats(){
        System.out.println("eats green grass");
    }
}


class Chicken extends Animal{
    void walk(){
        System.out.println("walk with 2 legs its chicken");
    }

    void eats(){
        System.out.println("eats oats");
    }
}
