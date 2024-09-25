public class upcastin_downcastin {
    public static void main(String[] args) {
        Parents p=new Parents();
        p.display();
    ////////////////////////
        p=(Parents) new Childs();
        p.display();
    /////////////////////////         the these 3 partition has same output

        Childs c=(Childs) p;
        c.display();
   ///////////////////////////////
//        Parents pp=new Childs();
//        pp.display();
    }

}
class Parents{
    void display(){
//        super
        System.out.println("Parent class");
    }
}

class Childs extends Parents{
    void display(){
        System.out.println("Child clss with Parent ");
    }
}