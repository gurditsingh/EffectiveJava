package com.effective.code.item4;

import com.effective.code.item3.SingletonWithPublicField;
import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithThrowErrorTest {

    @Test
    public void itShouldReturnSingleObject1(){

        SingletonWithThrowError object1 = SingletonWithThrowError.getInstance();
        object1.value="object1";

        SingletonWithThrowError object2 = SingletonWithThrowError.getInstance();
        object2.value="object1";

        Assert.assertTrue(object1.equals(object2));
    }

    @Test
    public void itShouldReturnSingleObject2(){

        try {
            Constructor constructor = SingletonWithThrowError.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonWithThrowError object1 = (SingletonWithThrowError) constructor.newInstance();

            SingletonWithThrowError object2 = SingletonWithThrowError.getInstance();

            Assert.assertTrue(object1.equals(object2));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
