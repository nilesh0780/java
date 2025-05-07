class pattern{
    public static void main(String[] args){
     for( int i=1; i<=5; i++){

    //   1st: for(int j=1; j<=i; j++){
    //        System.out.print("*");
    //    }
    // 2nd:  for( int j=5; j>=i; j--){
    //     System.out.print("*");
    //   }
          
        //   3rd: for(int j=1; j<=i; j++){
        //    System.out.print(" ");
        //   }
        //   for(int k=5; k>=i; k--){
        //     System.out.print("*");
        //   }

    // 4rth:   for(int j=5; j>=i; j--){
    //         System.out.print(" ");
    //    }
        
    //     for(int k=1; k<=i; k++){
    //         System.out.print((char)(64+k));
    //     }
    //     for(int p=1; p<i; p++){
    //         System.out.print((char)(67+p));
    //    }
     for(int j=1; j<=i; j++){
         System.out.print(" ");
     }
      for(int k=5; k>=i; k--){
         System.out.print("*");
     }
     for(int p=5; p>i; p--){
         System.out.print("*");
     }
        
        System.out.println( );
        }
     
        
     }
    }
