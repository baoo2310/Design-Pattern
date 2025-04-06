package strategy;
public class NoDiscountStrategy implements IPromoteStrategy {
    public double doDiscount(double price){
        return price;
    }
    public String getType(){
        return "NoDiscountStrategy";
    }
}
