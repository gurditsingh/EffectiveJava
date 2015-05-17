package com.effective.code.item4;

/**
 * Created by GURDIT_SINGH on 17-05-2015.
 */
public class SingletonWithThrowError {
    public String value="";
    private static final SingletonWithThrowError instance = new SingletonWithThrowError();

    private SingletonWithThrowError(){throw new AssertionError("can't create new instance");
    }

    public static SingletonWithThrowError getInstance(){
        return instance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof SingletonWithThrowError)) return false;

        SingletonWithThrowError that = (SingletonWithThrowError ) o;

        if (!value.equals(that.value)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return value.hashCode();
    }
}
