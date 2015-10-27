package com.cx.lemon.listener;

import java.util.HashSet;

public class SmartObserver {
    private static SmartObserver observer;

    public static HashSet<SmartListener> Listeners;

    private SmartObserver(){
        if(Listeners == null){
            Listeners = new HashSet<SmartListener>();
        }
    }

    public static SmartObserver getInstance(){
        if(observer == null){
            observer = new SmartObserver();
        }
        return observer;
    }

    public static void setChangeListener(SmartListener listener){
        if(observer == null){
            observer = new SmartObserver();
        }
        Listeners.add(listener);
    }
}
