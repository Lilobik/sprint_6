package com.example;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class FelineTest {
    Feline feline = new Feline();
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    @Test
    public void eatMeat() throws Exception {
        assertEquals(expectedFood, feline.eatMeat());
    }
    @Test
    public void getFamily() {
        assertEquals("Кошачьи", feline.getFamily());
    }
    @Test
    public void getKittensNoCount() {
        assertEquals(1, feline.getKittens());
    }
}
