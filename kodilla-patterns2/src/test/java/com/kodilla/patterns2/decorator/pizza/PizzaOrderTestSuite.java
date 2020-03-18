package com.kodilla.patterns2.decorator.pizza;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.Assert.*;

public class PizzaOrderTestSuite {

    @Test
    public void testPizzaWithCheeseVegetablesAndHerbsPrice(){
        //Given
    PizzaOrder pizza = new BasicPizzaOrder();
    pizza = new CheeseDecorator(pizza);
    pizza = new VegetableDecorator(pizza);
    pizza = new HerbsDecorator(pizza);

    //When
        BigDecimal price = pizza.getPrice();

        //Than
        assertEquals(new BigDecimal(25),price);
    }

    @Test
    public void testPizzaWithCheeseVegetablesAndHerbsIngredients(){
        //Given
        PizzaOrder pizza = new BasicPizzaOrder();
        pizza = new CheeseDecorator(pizza);
        pizza = new VegetableDecorator(pizza);
        pizza = new HerbsDecorator(pizza);

        //When
        String ingredients = pizza.getIngredients();

        //Than
        assertEquals("You have chosen following ingredients on your pizza: mozarella + tomatoes and rocket + fresh basil",ingredients);
    }
}