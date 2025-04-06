package strategy;

public class QuarterDiscountStrategy implements IPromoteStrategy {
    public double doDiscount(double price){
        return price*0.75;
    }

    public String getType(){
        return "QuarterDiscountStrategy";
    }
}
