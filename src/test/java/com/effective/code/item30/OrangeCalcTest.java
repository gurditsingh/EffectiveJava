package com.effective.code.item30;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by GURDIT_SINGH on 21-05-2016.
 */
public class OrangeCalcTest {

    @Test
    public void getThePriceOfOrange(){
        Assert.assertEquals(98, OrangeCalc.getApplePrice(IntEnumPattern.APPLE_PIPPIN));
    }
}
