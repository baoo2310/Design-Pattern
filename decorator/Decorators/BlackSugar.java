package Decorators;

import Base.MilkTeaDecorator;
import Base.IMilkTea;

public class BlackSugar extends MilkTeaDecorator {
    public BlackSugar(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 2d + _milkTea.cost();
    }
}
