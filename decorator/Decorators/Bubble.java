package Decorators;

import Base.MilkTeaDecorator;
import Base.IMilkTea;

public class Bubble extends MilkTeaDecorator {
    public Bubble(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 1d + _milkTea.cost();
    }
}
