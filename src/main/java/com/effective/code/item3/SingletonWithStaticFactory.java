package com.effective.code.item3;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithStaticFactory  {

    public String value="";
    private static final SingletonWithStaticFactory instance = new SingletonWithStaticFactory();

    private SingletonWithStaticFactory(){}

    public static SingletonWithStaticFactory getInstance(){
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingletonWithStaticFactory)) return false;

        SingletonWithStaticFactory that = (SingletonWithStaticFactory) o;

        if (!value.equals(that.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
