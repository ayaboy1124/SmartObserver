package com.cx.lemon.listener;

public abstract class SmartListener <T> {
    public static final String SEPARATOR = "$";
    public static final int HASH_CODE = 200;

    public abstract void onChange(int type,T a);

    @Override
    public int hashCode() {
        return HASH_CODE;
    }

    /*
        为了防止用户多次添加同一个listener，导致调用的时候重复调用，以listener所在的类名为判断条件，进行排重。
        这样做的后果就是同一个类中 类型为SmartListener 的成员变量只能有一个。
     */
    @Override
    public boolean equals(Object o) {
        return this.toString().split(SEPARATOR)[0].equals(o.toString().split(SEPARATOR)[0]);
    }
}
