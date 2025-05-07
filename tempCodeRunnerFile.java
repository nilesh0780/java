class Animal{
    void eat(){
        System.out.println("eatinggg");
    }
}

class Dog extends Animal{
    void bark(){
        System.out.println("barkkk");                  //single level inheritance
    }
}



class inheritance{
  public static void main(String[] args) {
      
    Dog obj = new Dog();
    obj.bark();
    obj.eat();



}
}


