package strategy;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start getting ticket");

        java.util.Random random = new java.util.Random();

        for(int i = 1; i <= 10; i++){
            int StrategyIndex = random.nextInt(0, 2);
            Ticket ticket = new Ticket();
            ticket.setName("Ticket" + (i));
            ticket.setPrice(50d*i);
            switch(StrategyIndex){
                case 0:
                    ticket.setPromoteStrategy(new NoDiscountStrategy());
                    break;
                case 1:
                    ticket.setPromoteStrategy(new QuarterDiscountStrategy());
                    break;
                default:
                    ticket.setPromoteStrategy(new HalfDiscountStrategy());
                    break;
            }
            System.out.println( "Promoted Price of " 
                +ticket.getName() + " is " 
                +ticket.getPromotedPrice()
                +" type of discount is " + ticket.getPromoteStrategy().getType());
        }
    }
}
