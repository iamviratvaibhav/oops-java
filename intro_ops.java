public class intro_ops{
    public static void main(String[] args) {
        Pen p1=new Pen(); //crated a pen object called p1;
        p1.setColor("Blue");
        p1.setTip(6);
        Pen p2=new Pen();
        p2.setColorWithHash("Blueeeeeeee");
        System.out.println(p1.color);
        System.out.println(p1.tip); 
        System.out.println(p2);

    }
}

class Pen{
    String color;
    int tip;

    String getColor(){
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }
    void setColor(String newColor){
        color=newColor;

    }
    void setColorWithHash(String newColor){
        color=newColor;
        tip=50;
    }
    void setTip(int newtip){
        // tip=newtip;
        this.tip=tip;

    }


}