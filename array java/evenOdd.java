import java.util.*;
class evenOdd{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int even = 0, odd=0;

        System.out.println("enter element :");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
            if(n%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
        System.out.println("even :" + even + " odd:" + odd);
    }
}