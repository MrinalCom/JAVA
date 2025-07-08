package ConditionalMethods;

public class ConditionalMethods {
    public static void main(String [] args){
        //relational operators
            //it compares two values and return a boolean result
        int a =1;
        int b=2;
        boolean isTrue=b>a;
        System.out.println(!isTrue);
        //logical operators
            // && logical and
            // || logical or
            // !  logical not
            //it is used to combine boolean expressions
        int ramMarks=90;
        int ramAge=18;

        System.out.println(ramMarks>=33 && ramAge>=18);
        //conditional statements
        int age=20;
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are not an adult");
        }

    }
}
