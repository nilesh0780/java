// class MyThread extends Thread{
//     public void run(){
//         System.out.println("hello");
//         try {
//             Thread.sleep(4000);
//         } catch (Exception e) {
//         }
//         System.out.println("hlw");
//     }
// }
// class multithread{
//     public static void main(String[] args) {
//         MyThread t1  = new MyThread();
//         t1.start();
//         System.out.println("hii");
//     }
// }


// class FileDownload{
//     public static void download(String file){
//         for(int i=1; i<=5; i++){
//             System.out.println(file + " "+ "downloading..." + (i*20) + "%");
//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
//         }
//         System.out.println(file + "done");
//     }
        
    
// }
// class multithread{
//     public static void main(String[] args) {
//         FileDownload obj = new FileDownload();
//         obj.download(" file A");
//         obj.download("file B");
//     }
// }



// class downloadFile extends Thread{
//     String fileName;
//     public downloadFile(String fileName){
//         this.fileName=fileName;

//     }
//     public void run(){
//         for (int i=0; i<=5; i++) {
//              System.out.println(fileName + " "+ "downloading..." + (i*20) + "%");

//             try {
//                 Thread.sleep(2000);
//             } catch (Exception e) {
//             }
            
//         }
//         System.out.println(fileName + " " + "done"); 
//     }
// }
// class multithread{
//     public static void main(String[] args) {
//         downloadFile t1 =  new downloadFile("fileName A");
//         downloadFile t2 = new downloadFile("fileName B");
//         t1.start();
//         t2.start();
//     }
// }



// class MyRunnable implements Runnable{
//     public void run(){
//         System.out.println(Thread.currentThread().getName()+ " hii ");
//     } 
// }
// class multithread{
//     public static void main(String[] args) {
//         MyRunnable obj= new MyRunnable();
//         Thread t1= new Thread(obj);
//            t1.start();
//            System.out.println("hlw");
//     }
// }



class WithdrawThread extends Thread{
    static int totalBalance=1000;
    int amount;

    public WithdrawThread(int amount){
        this.amount=amount;
    }
    public void run(){
        if(totalBalance>=amount){
            System.out.println("aapke pass paise a jayga" + amount);
             totalBalance-=amount;
            
            System.out.println(totalBalance);

        }
        else{
            System.out.println("pese nhi h");

        }
    }
}
class multithread{
    public static void main(String[] args) {
      WithdrawThread obj = new WithdrawThread(800);
        WithdrawThread obj1 = new WithdrawThread(500);
       // Thread t1 = new Thread(obj);
        //Thread t2 = new Thread(obj1);
        obj.start();
        obj1.start();
    }
}