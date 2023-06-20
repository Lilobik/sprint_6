package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;

@RunWith(Parameterized.class)
public class LionSexTest {
    private final String sex;
    private boolean expectedRes;

    @Mock
    private Feline feline;

    public LionSexTest(String sex, boolean expectedRes) {
        this.sex = sex;
        this.expectedRes = expectedRes;
    }

    @Parameterized.Parameters(name = "Пол. Тестовые данные: {0} {1}")
    public static Object[] getData() {
        return new Object[][]{
                {"Самец", true},
                {"Самка", false},
        };
    }

    @Test
    public void doesHaveManeTest() throws Exception {
        Lion lion = new Lion(sex, feline);
        Assert.assertEquals(expectedRes, lion.doesHaveMane());
    }
}
