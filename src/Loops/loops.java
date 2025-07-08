package Loops;

public class loops {
    public static void main(String [] args){
        //while loop
        int i=0;
        while(i<10){
            System.out.println("Hello world");
            i++;
        }
        //do-while loop
//        int i=1;
        do{
            System.out.println(i);
            i++;
        }while(i<50);
        //for loop
        for(int j=1;j<=10;j++){
            System.out.println(j);
        }

        /*
        1
        10
        100
        1000
        10000
        100000
         */
//        for(int i=1,j=1;j<=6;i*=10,j++){
//            System.out.println(i);
//        }

        //extract digits
        int digits=19393922;
        int result=0;
        while(digits>0){
            int rem=digits%10;
            result+=1;
            digits=digits/10;
        }

//        System.out.printf("The number of digits are %d",result);
//        for(int i=0;i<6;i++){
//            for(int j=0;j<=i;j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }



    }
}
