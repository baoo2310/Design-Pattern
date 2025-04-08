package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class WhiteSugar extends MilkTeaDecorator {
    public WhiteSugar(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 3d + _milkTea.cost();
    }
}
