package Builder;


abstract public class CarBuilder {
    Car c;
    public void createCar(){
        c = new Car();
    }
    abstract void setColour();
    abstract void setSpeed();


    Car getC(){return c;}

}
