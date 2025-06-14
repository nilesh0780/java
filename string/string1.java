class string1{
   public static void main(String[] args) {
      String str = "hello";
       for(int i=0; i<str.length(); i++){     // print char
        System.out.println(str.charAt(i));
    
       }
       for(int j=str.length()-1; j>=0; j--){
         System.out.println(str.charAt(j));     // revers
       }

//     String str="eye";
//     String rev="";
//     for( int i=str.length()-1; i>=0; i--){
//         rev+=str.charAt(i);
//     }
//     System.out.println(rev);
//     if(str.equals(rev)){
//          System.out.println("palindrom");
//     }
//     else{
//          System.out.println("not");
//     }
       
       
   } 
}