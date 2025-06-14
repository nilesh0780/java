//......
//validAnagramUsingMap.java

// import java.util.HashMap;
// class day36{     
// public static void main(String[] args) {
//     String str = "program";
//     HashMap<String,Integer> map=new HashMap<>();
//     System.out.println(str);
// }
// }

// SpiralMatrix
class SpiralPrint{
    public static void main(String[] args) {
       int[][] arr = {
        {1,2,3},
        {4,5,6},
        {7,8,9}
       };
       SpiralPrint(arr);
    }
       public static void SpiralPrint(int[][] matrix){
        int top =0;
        int bottom= matrix.length-1;
        int left =0;
        int right=matrix[0].length-1;
        while(top<=bottom&& left<=right){
            // top row
            for (int i=left; i<=right; i++){
                System.out.print(matrix[top][i]+" ");
            }
            top++;
            // rihgt colom
            for(int i=top; i<=bottom; i++){
                System.out.print(matrix[i][right] +" ");
            }
            right--;
            // bottom row
            if (top<=bottom){
                    for (int i = right; i >= left; i--) {
                    System.out.print(matrix[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
  }

