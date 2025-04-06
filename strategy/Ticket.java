package strategy;

public class Ticket {
    private IPromoteStrategy _promoteStrategy;
    private String _name;
    private double _price;

    Ticket(IPromoteStrategy promoteStrategy){
        this._promoteStrategy = promoteStrategy;
    }

    Ticket(){}

    public IPromoteStrategy getPromoteStrategy(){
        return this._promoteStrategy;
    }

    public void setPromoteStrategy(IPromoteStrategy promoteStrategy){
        this._promoteStrategy = promoteStrategy;
    }

    public String getName() {
        return this._name;
    }

    public void setName(String name) {
        this._name = name;
    }

    public double getPrice(){
        return this._price;
    }

    public void setPrice(double price){
        this._price = price;
    }

    public double getPromotedPrice(){
        return _promoteStrategy.doDiscount(_price);
    }

}
