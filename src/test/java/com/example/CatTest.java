package com.example;

import com.example.Cat;
import com.example.Feline;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {
    List<String> expectedFood = List.of("Животные", "Птицы", "Рыба");
    Cat cat;
    @Mock
    Feline feline;

    @Before
    public void setUp() {
        cat = new Cat(feline);
    }
    @Test
    public void getSound() {
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    public void getFood() throws Exception {
        Mockito.when(feline.eatMeat()).thenReturn(expectedFood);
        assertEquals(expectedFood, cat.getFood());
    }
}

