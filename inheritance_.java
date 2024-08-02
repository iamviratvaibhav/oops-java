public class inheritance_ {
    public static void main(String[] args) {
    //jb koi dosre class ka obj bante h toh wo doosre class ka method leta h
        Fish starfish= new Fish();
        starfish.eats();
        starfish.swims();
    }
}


class Animal{
    String color;
    // String eats;
    void eats(){
        System.out.println("eats food:");
    }

    void runs(){
        System.out.println("runs with fins");
    }
}

class Fish extends Animal{
    int fins;

    void swims(){
        System.out.println("swims with fins also");
    }
}