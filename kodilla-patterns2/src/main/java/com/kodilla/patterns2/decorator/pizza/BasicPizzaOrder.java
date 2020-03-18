package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class BasicPizzaOrder implements PizzaOrder {
    @Override
    public BigDecimal getPrice() {
        return new BigDecimal(10);
    }

    @Override
    public String getIngredients() {
        return "You have chosen following ingredients on your pizza: ";
    }
}
