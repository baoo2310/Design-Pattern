package strategy;
public class HalfDiscountStrategy implements IPromoteStrategy {
    public double doDiscount(double price){
        return price*0.5;
    }

    public String getType(){
        return "HalfDiscountStrategy";
    }
}
