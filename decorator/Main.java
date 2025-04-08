import Base.MilkTea;
import Base.MilkTeaDecorator;
import Decorators.BlackSugar;
import Decorators.Bubble;
import Decorators.EggPudding;
import Decorators.FruitPudding;
import Decorators.WhiteBubble;

public class Main {
    public static void main(String[] args) {
        MilkTeaDecorator ouDecorator = new EggPudding(
            new FruitPudding(
                new BlackSugar(
                    new Bubble(
                        new MilkTea()))));
        System.out.println(ouDecorator.cost());

        MilkTeaDecorator ourMilktea = new EggPudding(
            new BlackSugar(
                new WhiteBubble(
                    new MilkTea())));
        System.out.println(ourMilktea.cost());
    }

}
