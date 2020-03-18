package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class HerbsDecorator extends AbstractPizzaOrderDecorator {
    public HerbsDecorator(PizzaOrder pizzaOrder) {
        super(pizzaOrder);
    }
    @Override
    public BigDecimal getPrice(){
        return super.getPrice().add(new BigDecimal(5));
    }

    @Override
    public String getIngredients(){
        return super.getIngredients() + " + fresh basil";
    }
}
