package Decorators;

import Base.IMilkTea;
import Base.MilkTeaDecorator;

public class WhiteBubble extends MilkTeaDecorator {
    public WhiteBubble(IMilkTea inner){
        super(inner);
    }
    @Override
    public double cost(){
        return 1.75d + _milkTea.cost();
    }
}
