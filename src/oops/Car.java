package oops;

public class Car {
    private String brand;
    private String color;
    private String model;

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    int year;
    int speed;
    public void accelerate(int no){
        speed+=no;
    }
    public void brake(){
        speed-=1;
        if(speed<0){
            speed=0;
        }
    }
}
