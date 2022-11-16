package ad211.cheban;

import ad211.cheban.PizzaShop.FirstPizzaShop;
import ad211.cheban.PizzaShop.PizzaShop;
import ad211.cheban.PizzaShop.SecondPizzaShop;

public class Main {
    public static void main(String[] args) {
        PizzaShop firsPizzaShop = new FirstPizzaShop();
        firsPizzaShop.orderPizza(PizzaType.CHEESY);

        PizzaShop secondPizzaShop = new SecondPizzaShop();
        secondPizzaShop.orderPizza(PizzaType.MEATY);
    }
}