package ad211.cheban.PizzaShop;

import ad211.cheban.Pizza;
import ad211.cheban.PizzaType;

public abstract class PizzaShop {
    // обрабатываем заказ
    public Pizza orderPizza(PizzaType type) {
        Pizza pizza = createPizza(type);

        pizza.makeDough();
        pizza.pourTheFilling();
        pizza.bakePizza();

        System.out.println("Вот ваш пицца! Приятного аппетита!");
        return pizza;
    }

    protected abstract Pizza createPizza(PizzaType type);
}
