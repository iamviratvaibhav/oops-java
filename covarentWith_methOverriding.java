public class covarentWith_methOverriding {
    public static void main(String[] args) {
        Car car=new Car();
        car.manufacture();
        Ford ford=new Ford();
        ford.manufacture();
    }
}


class Car{
    Car manufacture(){
        System.out.println("Car sell");
        return new Car();
    }
}

class Ford extends Car{
    @Override
    Ford manufacture(){
        System.out.println("Ford cars");
        return new Ford();
    }
}
