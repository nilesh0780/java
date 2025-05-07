// class thiskey{
//     // int age = 15;
//     void data(){
//         System.out.println(this);
//     }

//     public static void main(String[] args) {
//         thiskey obj = new thiskey();
//         obj.data();
//         System.out.println(obj);
//     }
// }


class Student{
    int age;
    Student(int age){
        this.age=age;

    }
    void print(){
        System.out.println(age);
    }
}
class thiskey{
    public static void main(String[] args) {
        
    
    Student obj = new Student(15);
    obj.print();
    }

}