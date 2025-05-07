

class str2{
     public static void main(String[] args) {
        //   String str ="heello";
        //  String newstr ="";
        //  for(int i=0; i<str.length(); i++){        // repeat char remove
        //     char c = str.charAt(i);

        //     if(newstr.indexOf(c)==-1){
        //         newstr+=c;
        //     }
            
        //  }
        //  System.out.println(newstr);


          String str ="heellloo";
         char[] ch =str.toCharArray();
         for(int i=0; i<ch.length; i++){
           // System.out.println(ch[i]);
           for( int j=i+1; j<ch.length; j++){
            if(ch[i]==ch[j]){
            System.out.println(ch[i]);
            return;
            }
           }

      
         }
         

        //  for(int i=0; i<str.length(); i++){        // repeat char remove
        //     char c = str.charAt(i);

        //     if(newstr.indexOf(c)==-1){
        //         newstr+=c;
        //     } 
       //  System.out.println(newstr);
        
     }
}