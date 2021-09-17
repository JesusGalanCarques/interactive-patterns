package com.designpatterns;

/**
 * Hello world!
 */
public final class App {
    static String welcomeMessage = "Bienvenido al menú principal. Elige una opción entre las siguientes:";
    static Boolean shouldAppExit = Boolean.FALSE;
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        clearConsole();
        Logger.log(welcomeMessage);
        Menu.getInstance().getOptions();
        HandleUserOption.getInstance().getUserOption();
        HandleUserOption.getInstance().getTheOptionHandled();
    }

    private static void clearConsole() {
        try {
            // Clear the console
            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
        } catch (Exception exception) {
            Logger.log(exception.getMessage());
        }
    }
}
