package ad211.cheban.PizzaShop;

import ad211.cheban.FirstStyle.FirstStyleHawaiian;
import ad211.cheban.FirstStyle.FirstStyleMargarita;
import ad211.cheban.FirstStyle.FirstStyleMeaty;
import ad211.cheban.Pizza;
import ad211.cheban.PizzaType;
import ad211.cheban.FirstStyle.FirstStyleCheasy;


public class FirstPizzaShop extends PizzaShop {
    public Pizza createPizza (PizzaType type) {
        Pizza pizza = null;

        switch (type) {
            case MARGARITA:
                pizza = new FirstStyleMargarita();
                break;
            case HAWAIIAN:
                pizza = new FirstStyleHawaiian();
                break;
            case CHEESY:
                pizza = new FirstStyleCheasy();
                break;
            case MEATY:
                pizza = new FirstStyleMeaty();
                break;
        }

        return pizza;
    }
}