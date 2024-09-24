//public class test_super  {
//
//}
//
//class Test{
//    test(){
//        System.out.println("This is the test");
//    }
//}
//public Demo(int i){
//    System.out.println("argu const...");
//}
//public class Demo extends Test{
//    int a;
//    Demo(){
//        super();
//    }
//}


// File name should be: test_super.java
public class test_super  {
    public static void main(String[] args) {
        Demo demo = new Demo();
        demo.test();
        demo.bath();
        Demo demoWithArg = new Demo(10);
    }
}

class Test {
    // Constructor for the Test class
    Test() {
        System.out.println("This is the Test class constructor.");
    }

    void test() {
        System.out.println("This is the test method.");
    }
    void bath(){
        System.out.println("Take a bath :");
    }
}

class Demo extends Test {
    int a;

    // No-arg constructor
    Demo() {
        super(); // Calls the constructor of the Test class
        System.out.println("No-arg constructor of Demo.");
    }

    // Parameterized constructor
    Demo(int i) {
//        super(); // Calls the constructor of the Test class
        System.out.println("Argu constructor of Demo with value: " + i);
    }
}
