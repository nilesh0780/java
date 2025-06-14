// polymorphism in java

// class Parent{
//     void sum(int a){
//         System.out.println(a);
//     }

// void sum(int a,int b){                      // compile time
//     System.out.println(a+b);
//    }
// }
// class polymsm{
//     public static void main(String[] args) {
//         Parent obj = new Parent();
//         obj.sum(5);
//         obj.sum(5, 8);
        
//     }
// }


// // ABSTRACT  CLASS methods

// abstract class Payment{
//     abstract void pay(int a);
//     void succes(){
//         System.out.println("payment done");
//     }

    
// }
// class UpiPayment extends Payment{
//     void pay (int a){
//         System.out.println("pay vi upi  : " +a);
//     }
// }
// class Netbanking extends Payment{
//     void pay(int b){
//         System.out.println("payment netbnking  : " +b);
//     }

// }

// class polymsm{
//     public static void main(String[] args) {
//         Payment obj = new UpiPayment();
//         obj.pay(5000);
//         obj.succes();
//         Payment obj1 = new Netbanking();
//         obj1.pay(35000);
//         obj1.succes();

//     }
// }


//// question assignment 1 :

// abstract class Shape{
//     abstract void area(int a);
//     void find(){
//         System.out.println("findinn");
//     }
//   }
// class Circle extends Shape{
//     void area(int a){
//         System.out.println("area circle  :" +a);
//     }
// }
// class rectangle extends Shape{
//     void area(int b){
//         System.out.println("area rectangle  :" +b);
//     }

// }
// class polymsm{

//     public static void main(String[] args) {
//         Shape obj = new Circle();
//         obj.area(45);
//         obj.find();
//         Shape obj1 = new rectangle();
//         obj1.area(76);
//         obj1.find();

//     }
// }

   // Question 2 abstract class and method

// abstract class Animal{
//     abstract void sound();
//     void voice(){
//         System.out.println("voice of animal");
//     }
// }
// class Dog extends Animal{
//     void sound(){
//         System.out.println("barkingg");
//     }
// }
// class Cat extends Animal{
//     void sound(){
//         System.out.println("speach sound");
//     }
// }
// class polymsm{
//  public static void main(String[] args) {
//      Animal obj = new Dog();
//      obj.sound();
//      obj.voice();
//      Animal obj1 = new Cat();
//      obj1.sound();
//      obj1.voice();
//  }
// }



//Quetion 3 

// class atm{
//     private int a;

//     void setrupees(int a){
//         this.a=a;
//     }
//     int getrupees(){
//         return a;
//     }

// }
// class polymorphism{
//     public static void main(String[] args) {
//         atm obj = new atm();
//         obj.setrupees(23333);
//         System.out.println(obj.getrupees());
        
        
//     }
// } 
// class BankAccount{
//     private int a;
//     void getter(){
//         this.a=a;
//     }
//     void setter(){
        
//     }
// }
// class polymorphism{
//     public static void main(String[] args) {
//         BankAccount obj=new BankAccount();
//         obj.setter();
//         obj.getter();
//         System.out.println(obj.setter());
//     }

// }
