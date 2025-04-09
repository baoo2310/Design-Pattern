package Object;
import CarParts.Engine;
import CarParts.Seatbelt;
import CarParts.Windscreen;

public class Car {
    private int _numberOfWheels;
    private Seatbelt _seatBelt;
    private String _color;
    private Windscreen _winscreen;
    private Engine _engine;

    public Car(int numberOfWheels, Seatbelt seatBelt, String color, Windscreen windscreen, Engine engine) {
        this._numberOfWheels = numberOfWheels;
        this._seatBelt = seatBelt;
        this._color = color;
        this._winscreen = windscreen;
        this._engine = engine;
    }

    public int getNumberOfWheels() {
        return _numberOfWheels;
    }

    public void setNumberOfWheels(int numberOfWheels) {
        this._numberOfWheels = numberOfWheels;
    }

    public Seatbelt getSeatBelt() {
        return _seatBelt;
    }

    public void setSeatBelt(Seatbelt seatBelt) {
        this._seatBelt = seatBelt;
    }

    public String getColor() {
        return _color;
    }

    public void setColor(String color) {
        this._color = color;
    }

    public Windscreen getWindscreen() {
        return _winscreen;
    }

    public void setWindscreen(Windscreen windscreen) {
        this._winscreen = windscreen;
    }

    public Engine getEngine() {
        return _engine;
    }

    public void setEngine(Engine engine) {
        this._engine = engine;
    }
    @Override
    public String toString() {
        return "Car{" +
                "numberOfWheels=" + _numberOfWheels +
                ", seatBelt=" + _seatBelt.getSeat() +
                ", color='" + _color + '\'' +
                ", windscreen=" + _winscreen.getWind() +
                ", engine=" + _engine.getEngin() +
                '}';
    }
}
