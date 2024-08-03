public class abstraction_with_constructure {
    public static void main(String[] args) {
        // Horse h=new Horse();
        // System.out.println(h.color);

        Mustang mustang=new Mustang();
        //Hierarchial class 's constructure print first :
        // Hierarchial is ---> Anima -> Horse ->Mustang
    }
}


abstract class Animal{
    String color;
    Animal(){
        // color="red"; 
        System.out.println("Animal constructure call");
    }
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse constructur call");
    }
    void changeColor(){
        // System.out.println();
        color="dark brown";
       
    }
}

class Mustang extends Horse{
    Mustang(){
        System.out.println("mustang constructure call");
    }
}

// class Chicken extends Animal{
//     void changeColor(){
//         color="black";
//     }
// }