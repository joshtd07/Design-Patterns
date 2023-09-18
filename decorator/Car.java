package decorator;

public class Car extends Vehicle {
    public Car() {
        super(FileReader.getLines("C:/Users/Brandon/OneDrive/Desktop/School/baby back/decorator/decorator/car.txt"));
    }
}