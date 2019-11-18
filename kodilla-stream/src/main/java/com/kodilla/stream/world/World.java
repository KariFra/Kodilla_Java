package com.kodilla.stream.world;

import java.math.BigDecimal;

import java.util.ArrayList;
import java.util.List;


public class World {

    public final List<Continent> continents = new ArrayList<>();

    public void  addContinents(List<Continent> continents) {
        continents.addAll(continents);
    }


    public BigDecimal getPeopleQuantity(){
        return continents.stream()
                .flatMap(continent -> continent.getCountries().stream())
                .map(Country::getPeopleQuantity)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
    }
}
