public class super_keyword {
    public static void main(String[] args) {
    //    Animal an=new Animal();  
    // yadi ham yee anima ka cons call karenge to (keval animal ka) staetment print karege
    
        B b=new B();
            //yadi ham B ka cons. call karenge to ye animal and B ka constructure call karege dono ka
    }

}

class Animal{
    Animal(){
        System.out.println("This is animal");
    }
}

class B extends Animal{
    B(){
        super(); 

        System.out.println("this is B' s constructure ");
    }
}
