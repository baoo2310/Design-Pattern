package Object;

import CarParts.Seatbelt;
import CarParts.Windscreen;
import CarParts.Engine;
// Use for large amount of parameter
public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(4, 
        new Seatbelt("seatBelt1"), 
        "red", 
        new Windscreen("WindScreen1"), 
        new Engine("Foot"));
        System.out.println(car1.toString());
        Car car2 = new CarBuilder()
                        .addWheels(6)
                        .addSeatBelts(new Seatbelt("SETABELT"))
                        .addWingScreen(new Windscreen("cc3m hahaha"))
                        .addEngine(new Engine("SIEU TO KHONG LO"))
                        .Paint("blu")
                        .build();
        System.out.println(car2.toString());
    }
}
