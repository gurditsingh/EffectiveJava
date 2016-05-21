package com.effective.code.item30;

/**
 * Created by GURDIT_SINGH on 21-05-2016.
 */
public class WeightTable {

    public static double getWeight(double earthWeight, Planet planet){
        double mass = earthWeight / Planet.EARTH.surfaceGravity();
        return planet.surfaceWeight(mass);
    }
}
