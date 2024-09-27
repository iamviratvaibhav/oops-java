public class inheritance_ {
    public static void main(String[] args) {
        Animal a=new Animal();
        a.Breath();
        a.run();
        Fish f=new Fish();
        f.sleep();
        f.setColor("Blue");
//        System.out.println("fish color"+ f.getColor());

    }
}
class Animal{
    private String color;
    void eat(){
        System.out.println("eat");
    }
    void run(){
        System.out.println("Everyone is able to run");
    }
    String Breath(){
        return "is brathing";
    }
    public void setColor(String color){
        this.color=color;
    }
    public void getColor(){
//        return this.color;
    }
}

class Fish extends Animal{
    void sleep(){
        System.out.println("ITs sleep for some time");
    }
}
