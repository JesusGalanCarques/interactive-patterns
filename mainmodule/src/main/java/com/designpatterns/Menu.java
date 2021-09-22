package com.designpatterns;

import java.util.Scanner;


/**
 * Provide Menu as a singleton instance
 * 
 */
public class Menu {
    private static final Menu INSTANCE_MENU = new Menu();

    public static Menu getInstance() {
        return INSTANCE_MENU;
    }

    private void printOptions() {
        Logger.log();
        Logger.log("1: Singleton");
        Logger.log("2: Facade");
        Logger.log("0: Salir de la ejecución actual.");
        Logger.log();
    }

    public void getOptions() {
        INSTANCE_MENU.printOptions();
    }

}
