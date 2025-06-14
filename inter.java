  // start 21-05-25

  // interface Client{
  //   void print();
  //   void show();
  // }

  // class Dev implements Client{
  //   public void print(){
  //       System.out.println("print the bill");
  //   }
  //   public void show(){
  //       System.out.println("show the manu");
  //   }
  // }
  // class inter{
  //   public static void main(String[] args){
  //       Dev obj = new Dev();
  //       obj.print();
  //       obj.show();
  //   }
  // }


      // ......
 
  // interface Client {
  //   void show();
  // }
  // interface Client2{
  //   void show();
  // }
   
  // class Helo implements Client , Client2 {
  //   public  void show(){
  //     System.out.println("this is common features for client && client2");
    
    
  // }
  //  // class inter{
  //   public static void main(String[] args) {
  //       Helo obj = new Helo();
  //       obj.show();
  //   }
  // }


    // Q1 creat intrface

    interface Walkable{
      void walk();
    }
    interface Runnable{
      void run();
    }

    class Human implements Walkable, Runnable{
      public void walk(){
        System.out.println("wlk");
      }
      public void run(){
        System.out.println("running");
      }
    }
      class inter{
      public static void main(String[] args) {
          Human obj = new Human();
          obj. walk();
          obj.run();
      }
    }
 