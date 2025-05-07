
import java.util.*;


class maxarr{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enrer size of a arry:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("enter elements:");
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        int max= arr[0];
        for (int i=1; i<n; i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        System.out.println("maximum element:" + max);
    }
}