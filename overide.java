// class Vehicle{
//     void run(){
//         System.out.println("run krta h");
//     }
// }
// class Bike extends Vehicle{
//     void run(){
//         System.out.println("ye bhi chlti h");            // over riding inherit

//         super.run(); // perent ko coll krta h 
//     }
// }
// class overide{
//     public static void main(String[] args) {
//         Vehicle obj= new Bike();
//         obj.run();
//     }
// }

class Animal{
    void Sound(){
        System.out.println("sound krta h ");
    }
}
class Dog extends Animal{
    void Sound(){
        System.out.println("bark");
       // super.Sound();
    }
}
class overide{
    public static void main(String[] args) {
        Animal obj = new Dog();
        obj.Sound();
    }
}