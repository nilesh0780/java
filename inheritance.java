// class Animal{
//     void eat(){
//         System.out.println("eatinggg");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("barkkk");                  //single level inheritance
//     }
// }



// class inheritance{
//   public static void main(String[] args) {
      
//     Dog obj = new Dog();
//     obj.bark();
//     obj.eat();



// }
// }




// class Animal{
//     void eat(){
//         System.out.println("eatinggg");
//     }
// }

// class Dog extends Animal{
//     void bark(){
//         System.out.println("barkkk");
//     }
// }

// class puppy extends Dog{
//     void lazy(){
//        System.out.println("cutiee");             // multiple inheritance
//     }
// }

// class inheritance{
//   public static void main(String[] args) {
      
//     puppy obj = new puppy();
//     obj.bark();
//     obj.eat();
//     obj.lazy();


// }
// }



//  Question single level inherit

// class Employee{
//     void work(){
//         System.out.println(" workingg");
//     }
// }

// class manager extends Employee{
//     void attendmitting(){
//         System.out.println("maintance");
//     }
// }


// class inheritance{
//   public static void main(String[] args) {
      
//     manager obj = new manager();

//     obj.work();
//     obj.attendmitting();
 


// }
// }


//  Question multilevel

// class Person{
//     void displayName(){
//         System.out.println(" asus");
//     }
// }

// class student extends Person{
//     void displayclass(){
//         System.out.println("screen");
//     }
// }

// class monitor extends student{
//     void checkdiscipline(){
//        System.out.println("mobile");             // multiple inheritance
//     }
// }

// class inheritance{
//   public static void main(String[] args) {
      
//     monitor obj = new monitor();
//     obj.displayName();
//     obj.displayclass();
//     obj.checkdiscipline();


// }
// }

 // Question single level
 
 class Book{
    void read(){
        System.out.println("readingg");
    }
 }
 class Novel extends Book{
    void storyline(){
        System.out.println("story");
    }
     
 }
 class inheritance{
    public static void main(String[] args) {
        Novel obj= new Novel();

        obj.read();
        obj.storyline();
    }
 }


