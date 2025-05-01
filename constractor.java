// class Student{
//     String firstName="rahul";
//     int age= 11;

//     Student(String firstName , int age) {                 // constructor

//         this. firstName=firstName;
//         this. age=age;
//        // System.out.println(firstName+  " "+age) ;
//     }
// }

// class day5{
//     public static void main(String[] args) {
//      Student obj= new Student( "nilesh" , 12);
//      Student obj1= new Student("srajal" , 34);

//      System.out.println(obj.firstName );
//      System.out.println(obj1.firstName);
//     }
// }


class Student{
    String firstName="rahul";
   int age= 11;

    Student() {                                            // chain constructor
     System.out.println("hello") ;
    }
    Student(String firstname){
        this();
        System.out.println(firstName);

    }
    Student(String firstName, int age){
       this(firstName);
       this. firstName=firstName;
       this. age= age;
          System.out.println(firstName+  " "+age);
    }
}

class constractor{
    public static void main(String[] args) {
     Student obj= new Student( "nilesh" , 12);
    // Student obj1= new Student("srajal" , 34);

     //System.out.println(obj.firstName );
    // System.out.println(obj1.firstName);
    }
}