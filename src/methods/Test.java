package methods;

public class Test {
    public static void main(String [] args){
        int[] arr={1,3,4,5};
        int ans=sumOfArray(arr);
        System.out.println(ans);
        String result=upperFunction("  Vipul");
        System.out.println(result);
        System.out.println(isPrime(12));
    }
    public static boolean isPrime(int x){
        int resn=0;
        for(int i=1;i<x/2;i++){
            if(x%i==0){
                resn++;
            }
        }
        return resn==1;
    }
    public static int sumOfArray(int []arr){
        int res =0;
        for(int i:arr){
            res +=i;
        }
        return res;
    }
    private static String upperFunction(String str){
        return str.trim().toUpperCase();
    }

}
