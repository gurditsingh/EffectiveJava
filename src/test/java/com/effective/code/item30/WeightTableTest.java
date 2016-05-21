package com.effective.code.item30;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by GURDIT_SINGH on 21-05-2016.
 */
public class WeightTableTest {

    @Test
    public void getTheWeightOfMercury(){
        Assert.assertEquals(1.2478400,WeightTable.getWeight(3.32, Planet.MERCURY),23);
    }
}
