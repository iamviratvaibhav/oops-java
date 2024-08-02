public class getter_setter {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("kala");
    }


}

class Pen{
    private String color;
    private int tip;

    String getColor(){
        return this.color;
    }
    int getTip(){
        return this.tip;
    }
    void setTip(int tip){
        this.tip=tip;
    }
    void setColor(){
        this.color=color;
    }
    
}
