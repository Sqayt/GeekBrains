import Classes.Market;
import Classes.OrdinaryClient;
import Classes.PromotionClient;
import Classes.SpecialClient;
import Interfaces.iActorBehavior;

public class App {
    public static void main(String[] args) {
        Market market = new Market();

        iActorBehavior item1 = new OrdinaryClient("Boris");
        iActorBehavior item2 = new SpecialClient("Fedor", 1001);
        iActorBehavior item3 = new OrdinaryClient("Dasha");
        iActorBehavior item4 = new PromotionClient("Artem", "Summer", 30);

        market.acceptToMarket(item1);
        market.acceptToMarket(item2);
        market.acceptToMarket(item3);
        market.acceptToMarket(item4);

        market.update();
    }
}
