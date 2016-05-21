package com.effective.code.item30;

/**
 * Created by GURDIT_SINGH on 21-05-2016.
 */
 enum Orange {

    NAVEL(0),TAMPLE(1),BLOOD(2);

    private int value;
    Orange(int value) {
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
