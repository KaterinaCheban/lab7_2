package ad211.cheban.PizzaShop;

import ad211.cheban.Pizza;
import ad211.cheban.PizzaType;
import ad211.cheban.SecondStyle.SecondStyleCheasy;
import ad211.cheban.SecondStyle.SecondStyleHawaiian;
import ad211.cheban.SecondStyle.SecondStyleMargarita;
import ad211.cheban.SecondStyle.SecondStyleMeaty;

public class SecondPizzaShop extends PizzaShop{

    public Pizza createPizza (PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case MARGARITA:
                pizza = new SecondStyleMargarita();
                break;
            case HAWAIIAN:
                pizza = new SecondStyleHawaiian();
                break;
            case CHEESY:
                pizza = new SecondStyleCheasy();
                break;
            case MEATY:
                pizza = new SecondStyleMeaty();
                break;
        }

        return pizza;
    }
}
