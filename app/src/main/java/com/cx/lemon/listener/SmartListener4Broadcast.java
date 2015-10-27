package com.cx.lemon.listener;

import android.content.Intent;

public abstract class SmartListener4Broadcast extends SmartListener<Intent> {

    public abstract void onChange(int type, Intent a);

}
