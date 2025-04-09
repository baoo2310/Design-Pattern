package Object;

import CarParts.Engine;
import CarParts.Seatbelt;
import CarParts.Windscreen;

public class CarBuilder implements ICarBuilder {

    private int _numberOfWheels;
    private Seatbelt _seatBelt;
    private String _color;
    private Windscreen _winscreen;
    private Engine _engine;

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
    public CarBuilder addWheels(int numberOfWheels) {
        // TODO Auto-generated method stub
        this._numberOfWheels = numberOfWheels;
        return this;
    }

    @Override
    public CarBuilder addSeatBelts(Seatbelt seatbelt) {
        // TODO Auto-generated method stub
        this._seatBelt = seatbelt;
        return this;
    }

    @Override
    public CarBuilder Paint(String color) {
        // TODO Auto-generated method stub
        this._color = color;
        return this;
    }

    @Override
    public CarBuilder addWingScreen(Windscreen windscreen) {
        // TODO Auto-generated method stub
        this._winscreen = windscreen;
        return this;
    }

    @Override
    public CarBuilder addEngine(Engine engine) {
        // TODO Auto-generated method stub
        this._engine = engine;
        return this;
    }
    @Override
    public Car build(){
        return new Car(_numberOfWheels, _seatBelt, _color, _winscreen, _engine);
    }
}
