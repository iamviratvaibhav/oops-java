/**
 * interface_with_multipleInher
 */

/// This is file is wihthout multiple heritance
public class interface_with_multipleInher {
    public static void main(String[] args) {
        Queen q=new Queen();
        q.move();
        Hathi h=new Hathi();
        h.move();    
    }
    
}

interface ChessPlayer{
    void move();
}

class Queen implements ChessPlayer{
    public void move(){
        System.out.println("its queen");
    }
}

class King implements ChessPlayer{
    public void move(){
        System.out.println("its kinggg");
    }
}

class Hathi implements ChessPlayer{
    public void move(){
        System.out.println("its hati");
    }
}
