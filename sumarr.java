
import java.util.*;
class sumarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.print("enter size of array:");
        int n= sc.nextInt();
        int[] arr = new int[n];
        int sum =0;

        System.out.println("enter element:");
        for (int i=0; i<n; i++) {
            
            arr[i] = sc.nextInt();
            sum +=arr[i];
        }
        System.out.println("sum="+ sum);

     }
 
    }
        

        
    
