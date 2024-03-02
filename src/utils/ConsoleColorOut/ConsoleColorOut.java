package utils.ConsoleColorOut;

import utils.enums.ConsoleColors;

public class ConsoleColorOut {
    public static void GREEN(String message) {
        System.out.println(ConsoleColors.ANSI_GREEN.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void RED(String message) {
        System.out.println(ConsoleColors.ANSI_RED.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void YELLOW(String message) {
        System.out.println(ConsoleColors.ANSI_YELLOW.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void BLUE(String message) {
        System.out.println(ConsoleColors.ANSI_BLUE.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void PURPLE(String message) {
        System.out.println(ConsoleColors.ANSI_PURPLE.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void CYAN(String message) {
        System.out.println(ConsoleColors.ANSI_CYAN.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }

    public static void WHITE(String message) {
        System.out.println(ConsoleColors.ANSI_WHITE.getColor() + " "+message+" " + ConsoleColors.RESET.getColor());
    }
}
