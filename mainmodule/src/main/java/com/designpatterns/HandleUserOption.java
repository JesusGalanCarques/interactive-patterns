package com.designpatterns;

import java.util.Scanner;

import com.designpatterns.patterns.facade.Facade;
import com.designpatterns.patterns.singleton.App;

/**
 * Hello world!
 */
public final class HandleUserOption {
    private static int option = -1;
    private static final HandleUserOption INSTANCE_HANDLE_OPTION = new HandleUserOption();
    private static Boolean shouldAppExit = Boolean.FALSE;

    public static HandleUserOption getInstance() {
        return INSTANCE_HANDLE_OPTION;
    }

    private static void handleOption(Integer option) {
        switch (INSTANCE_HANDLE_OPTION.option)
        {
            case 1:
                App.main();
                Logger.log("Se ejecutó el programa correspondiente. El patrón usado fue Singleton.");
                break;
            case 2:
                Facade appFacade = new Facade();
                appFacade.main();
                Logger.log("Se ejecutó el programa correspondiente. El patrón usado fue FaÇade.");
                break;
            case 0:
                shouldAppExit = Boolean.TRUE;
                Logger.log("Gracias por usar nuestro software. Que pases un buen dia.");
                break;
        }
        Logger.log("");
    }

    public static void getTheOptionHandled() {
        INSTANCE_HANDLE_OPTION.handleOption(option);
    }

    private static Integer askUserOption() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        Logger.log("Escribe un numero correspodiente: ");
        int n = reader.nextInt(); // Scans the next token of the input as an int.
        option = n;
        //once finished
        reader.close();
        Logger.log();

        return n;
    }

    public static Integer getUserOption() {
        return INSTANCE_HANDLE_OPTION.askUserOption();
    }

    public static Boolean getUserExit() {
        return INSTANCE_HANDLE_OPTION.shouldAppExit;
    }
}