package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class EggPudding extends MilkTeaDecorator {
    public EggPudding(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 2.5d + _milkTea.cost();
    }
}
