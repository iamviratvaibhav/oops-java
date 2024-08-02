public class hierarchial_inheritance {
    public static void main(String[] args) {
        // Monkey monkey1=new Monkey();
        // Fish fish1=new Fish();
        Animal dog=new Animal();
        dog.eat();
        dog.breath();
        
        Fish shark=new Fish();
        shark.swim();
        
    }
}

class Animal{
    String color;
    void eat(){
        System.out.println("Eats fruits:");
    }

    void breath(){
        System.out.println("breath from nose");
    }
}

class Fish extends Animal{
    void swim(){
        System.out.println("fish can swim");
    }
}

class Monkey extends Animal{
    void walk(){
        System.out.println("Monkey can walk and run:");
    }
}
