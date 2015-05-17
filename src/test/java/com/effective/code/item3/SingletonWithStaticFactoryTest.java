package com.effective.code.item3;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithStaticFactoryTest {

    @Test
    public void itShouldReturnSingleObject1(){

        SingletonWithStaticFactory object1 = SingletonWithStaticFactory.getInstance();
        object1.value="object1";

        SingletonWithStaticFactory object2 = SingletonWithStaticFactory.getInstance();
        object2.value="object1";

        Assert.assertTrue(object1.equals(object2));
    }

    @Test
    public void itShouldReturnSingleObject2(){

        try {
            Constructor constructor = SingletonWithStaticFactory.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonWithStaticFactory object1 = (SingletonWithStaticFactory) constructor.newInstance();

            SingletonWithStaticFactory object2 = SingletonWithStaticFactory.getInstance();

            Assert.assertTrue(object1.equals(object2));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
