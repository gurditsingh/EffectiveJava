package com.effective.code.item30;

import java.io.Serializable;

/**
 * Created by GURDIT_SINGH on 21-05-2016.
 */
enum Apple {

    FUJI(0),PIPPIN(1),SMITH(2);

    private final int value;
    Apple(int value) {
        this.value=value;
    }

    public int getValue(){
        return value;
    }
}
