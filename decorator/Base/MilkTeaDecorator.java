package Base;
public abstract class MilkTeaDecorator implements IMilkTea {
    protected IMilkTea _milkTea;
    protected MilkTeaDecorator(IMilkTea inner){
        _milkTea = inner;
    }
    public double cost(){
        return _milkTea.cost();
    }
}
