package oops;

public class Test {
    public  static void main(String [] args){
        Car car=new Car();
        car.setModel("i10");
        car.setBrand("Honda");
        car.accelerate(5);
        System.out.println(car.getModel());
        System.out.println(car.speed);

        animal cat=new cat();
        cat.makeSound();

    }

}
