public class method_overloading {
    public static void main(String[] args) {
        Sum cal=new Sum();
        System.out.println(cal.calculator(1, 3));
        System.out.println(cal.calculator((float)4.5, (float)6.7));
        System.out.println(cal.calculator(4, 5, 6));

    }
}

class Sum {
    int calculator(int a, int b){
        return a+b;
    }

    float calculator(float a , float b){
        return a+b;
    }

    int calculator(int a, int b, int c){
        return a+b+c;
    }
}
