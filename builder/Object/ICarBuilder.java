package Object;

import CarParts.Engine;
import CarParts.Seatbelt;
import CarParts.Windscreen;

public interface ICarBuilder {
    CarBuilder addWheels(int numberOfWheels);
    CarBuilder addSeatBelts(Seatbelt seatbelt);
    CarBuilder Paint(String color);
    CarBuilder addWingScreen(Windscreen windscreen);
    CarBuilder addEngine(Engine engine);
    Car build();
}
