public class getter_setter {
    public static void main(String[] args) {
        Pen p1=new Pen();
        p1.setColor("kala");
        System.out.println(p1.getColor());
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
    void setColor(String color){
        this.color=color;
    }
    
}
