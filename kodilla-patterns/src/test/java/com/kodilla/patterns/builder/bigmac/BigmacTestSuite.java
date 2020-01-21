package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBicmac(){
     //Given
        Bigmac bicmac = new Bigmac.BicmacBuilder()
                .bun("With sesam")
                .burgers(0)
                .sauce("Barbeque")
                .ingredients("Chilli peppers")
                .ingredients("Salat")
                .ingredients("Onion")
                .ingredients("Cheese")
                .ingredients("Impossible meat")
                .build();
     //When
      int chosenIngredientsNumber = bicmac.getIngredients().size();

     //Than
        Assert.assertEquals(5,chosenIngredientsNumber);
    }
}
