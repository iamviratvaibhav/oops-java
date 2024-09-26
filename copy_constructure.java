//public class copy_constructure {
//    public static void main(String[] args) {
//        Student1 s1=new Student1();
//        s1.name="Virat";
//        s1.roll =55;
//        s1.marks[0]=100;
//        s1.marks[1]=99;
//        s1.marks[2]=99;
////        s1.name=nam
//
//        Student1 s2=new Student1(s1);
//        s2.pass="xyz";
//        s1.marks[2]=100;
//        for(int i=0; i<3; i++){
//            System.out.println(s2.marks[i]);
//        }
//        //print the marks s2 after changes
//        for(int i=0; i<3; i++){
////            System.out.println(s2.marks[i]);
////        }
//    }
//}
//class Student1 {
//    String name;
//    int roll;
//    String pass;
//    int marks[];
//
//    Student1() {
//        marks = new int[3];
//        System.out.println("Cons called");
//    }
//
//    Student1(String name) {
//        marks = new int[3];
//        this.name = name;
//    }
//
//    //copy constructure
//    Student1(Student s1){
//        marks=new int[3];
//        this.name=s1.name;
//        this.roll=s1.roll;
////        this.marks=s1.marks;
//    }
//}



public class copy_constructure {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Virat";
        s1.roll = 55;
        s1.marks[0] = 100;
        s1.marks[1] = 99;
        s1.marks[2] = 98;

        // Copy constructor to create a new student s2 from s1
        Student1 s2 = new Student1(s1);

        // Modify the marks of s1 (to check deep copy)
        s1.marks[2] = 100;

        // Print marks of s2 (should reflect original marks of s1, before modification)
        System.out.println("Marks of s2 (copied from s1):");
        for (int i = 0; i < 3; i++) {
            System.out.println(s2.marks[i]);
        }

        // Print marks of s1 (should reflect modified marks)
        System.out.println("Marks of s1 after modification:");
        for (int i = 0; i < 3; i++) {
            System.out.println(s1.marks[i]);
        }
    }
}

class Student1 {
    String name;
    int roll;
    String pass;
    int marks[];

    // Default constructor
    Student1() {
        marks = new int[3]; // Initialize marks array
        System.out.println("Constructor called");
    }

    // Constructor with name parameter
    Student1(String name) {
        marks = new int[3];
        this.name = name;
    }

    // Copy constructor
    Student1(Student1 s1) {
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;

        // Perform deep copy of the marks array
        for (int i = 0; i < 3; i++) {
            this.marks[i] = s1.marks[i];
        }
    }
}
