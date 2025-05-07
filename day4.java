
import java.util.*;
class day4{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter size of the arr");        // array i/p user se lena
        // int n=sc.nextInt();
        // System.out.println("Enter arr values");
        // int[] arr = new int[n];
        // for (int i=0; i<n; i++){
        //     arr[i]=sc.nextInt();

        // }
        // int sum=0;
        // for(int j=0; j<arr.length; j++){
        //    // System.out.print(arr[j]);
        //   System.out.print(sum+=arr[j]);     // array ka sum
          
        // }

        // int[] arr1 = {1,2,3,4,6,7};
        // int even=0;
        // int odd=0;
        // for( int i=0; i<arr1.length; i++){
        //     if(arr1[i]%2==0){
        //        System.out.print(even++);
        
        //     }else{
        //         System.out.print(odd++);
        //     }
        // }
        // System.out.println("even" + "  " + even + " "+ "odd" +" ");       even/odd


        int[] arr1={1,2,3,4};
        int[] arr2={2,3,4,5};
        int[] sum= new int[arr1.length];
        for(int i=0; i<arr1.length; i++){
               sum[i]=arr1[i]+arr2[i];
        }
        for(int j=0; j<4; j++){
            System.out.print(sum[j]+ " ");      // sum of   two arry
        }

            
        } 
    }
