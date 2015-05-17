package com.effective.code.item3;

import org.junit.Assert;
import org.junit.Test;

import java.lang.reflect.Constructor;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithPublicFieldTest {

    @Test
    public void itShouldReturnSingleObject(){
        SingletonWithPublicField object1 = SingletonWithPublicField.instance;
        object1.value="object1";

        SingletonWithPublicField object2 = SingletonWithPublicField.instance;
        object2.value="object2";

        Assert.assertTrue(object1.equals(object2));
    }

    @Test
    public void itShouldNotReturnSingleObject(){
        try {
            Constructor constructor=SingletonWithPublicField.class.getDeclaredConstructor();
            constructor.setAccessible(true);
            SingletonWithPublicField object1 = (SingletonWithPublicField) constructor.newInstance();

            SingletonWithPublicField object2 = SingletonWithPublicField.instance;

            Assert.assertTrue(object1.equals(object2));
            } catch (Exception e) {
                 e.printStackTrace();
            }

    }
}
