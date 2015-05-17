package com.effective.code.item3;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithPublicField {

    public String value="";
    public static final SingletonWithPublicField instance=new SingletonWithPublicField();
    private SingletonWithPublicField(){}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingletonWithPublicField)) return false;

        SingletonWithPublicField that = (SingletonWithPublicField) o;

        if (!value.equals(that.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
