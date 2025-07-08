package Arrays;

public class array {
    public static void main(String[] args){
//        int []array={1,2,3};
        //type [] variableName
//        int[] arr=new int[10];
//        System.out.println(arr.length);
//        for(int i:array){
//            System.out.println(i);
//        }

        //2d array
//        int [][]arr=new int[3][3];

        //jagged array=array of arrays of different length
        int [][]arr={
                {1,2,3},
                {3,4,5,6},
                {6,7,8}
        };
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.println(arr[i][j]);
            }
        }
    }
}
