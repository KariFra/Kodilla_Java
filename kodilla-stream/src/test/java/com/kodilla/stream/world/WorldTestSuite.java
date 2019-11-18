package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class WorldTestSuite {

    @Test
    public void testGetPeopleQuantity(){
        //Given
        Country poland = new Country(new BigDecimal("10"));
        Country germany = new Country(new BigDecimal("20"));
        Country america = new Country(new BigDecimal("30"));
        Country canada = new Country (new BigDecimal("40"));
        Continent europe = new Continent();
        Continent northAmerica = new Continent();
        List<Continent> continents = new ArrayList<>();
        europe.addCountry(poland);
        europe.addCountry(germany);
        continents.add(europe);
        northAmerica.addCountry(america);
        northAmerica.addCountry(canada);
        continents.add(northAmerica);

        World populationCalculator = new World();
        populationCalculator.addContinents(continents);

        //When
        BigDecimal result = populationCalculator.getPeopleQuantity();

        //Than
        BigDecimal expectedPopulation = new BigDecimal("100");
        Assert.assertEquals(expectedPopulation, result);


    }
}
