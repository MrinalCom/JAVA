package ArithmeticOperators;

public class ArithmeticOperators {
    public  static void main(String [] args){
        int yourSalary=10000;
        int bonus=500;
        int monthlyTotal=yourSalary-bonus;
        int yearlyTotal=monthlyTotal*12;
        int perChild = yearlyTotal / 3;
        System.out.println(perChild);

        //operator precendce
        int answer=3/5*3+5;
        System.out.println(answer);

        int a=1;
        System.out.println(a++ + a);
    }
}
