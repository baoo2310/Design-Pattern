package Decorators;


import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class FruitPudding extends MilkTeaDecorator {
    public FruitPudding(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 3.5d + _milkTea.cost();
    }
}
