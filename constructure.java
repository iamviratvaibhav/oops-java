public class constructure {
    public static void main(String[] args) {
        Student s1=new Student(); //this is for non paramteriseed constructure
        //ab ham jo changes karenge wo copy constru. ke lya h s2 se phale phale ke
        s1.name="Hello2";
        s1.rollno=45;
        s1.password="abcd";

        Student s2=new Student("Hello"); //this is  for the middle's cons.
        //ise niche wale line kewal copy constructure ke lya h..
        s2.password="xyz"; 
        Student s3=new Student(5);  //this is for last constructure
    
    }
}

class Student{
    String name;
    int rollno;
    String password;
    int marks[];
    // ---------------------------------------------------------
    Student() {  //this is non paramterised constructure...
        System.out.println("constructure called:....");
        marks=new int[3];
    }

    Student(String name){
        this.name=name;
        marks=new int[3];
    }

    Student (int rollno){
        this.rollno=rollno;
        marks=new int[3];
    }
    //----------------------------------------------------------
    //copy constructure 
    Student (Student s1){
        this.name=s1.name;
        this.rollno=rollno;
        this.password=password;
        this.marks=s1.marks;
    }

}

