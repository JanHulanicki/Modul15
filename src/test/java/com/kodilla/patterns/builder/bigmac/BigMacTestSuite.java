package com.kodilla.patterns.builder.bigmac;
import org.junit.Assert;
import org.junit.Test;
public class BigMacTestSuite {
    @Test
    public void testBigMacNew() {
    //Given
        BigMac bigMac = new BigMac.BigMacBuilder()
                    .bun("roll")
                    .burgers(5)
                    .sauce("spicy")
                    .ingredients("Ingredient1")
                    .ingredients("Ingredient2")
                    .build();
        System.out.println(bigMac);
        //When
        int howManyIngredients =bigMac.getIngredients().size();
        //Then
        Assert.assertEquals(2, howManyIngredients);
    }
}


