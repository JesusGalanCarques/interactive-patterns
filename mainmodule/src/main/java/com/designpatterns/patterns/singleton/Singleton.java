package com.designpatterns.patterns.singleton;

import com.designpatterns.Logger;

public class Singleton {
    private static final Singleton INSTANCE_SINGLETON = new Singleton();

    public static Singleton getInstance() {
        return INSTANCE_SINGLETON;
    }

    private void printMessage() {
        Logger.log("Este metodo es privado y solo se puede acceder a él desde la unica instancia singleton, y solo a través de su método público llamado getInstance.");
        Logger.log();
    }

    public void getMessage() {
        INSTANCE_SINGLETON.printMessage();
    }
}
