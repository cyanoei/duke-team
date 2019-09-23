package duke;

import java.util.Scanner;

/**
 * Manages the UI of Duke.
 * Prints intro and exit messages, and the standard newline.
 */

public class Ui {

    private Scanner in;

    public Ui() {
        this.in = new Scanner(System.in);
    }

    /**
     * Prints duke introduction message.
     */
    public void printIntro() {
        String logo = "  _      __    __                     __         ____         _   __         __               \n" +
                " | | /| / /__ / /______  __ _  ___   / /____    / __/__ ____ | | / /__ ___  / /____  ______ __\n" +
                " | |/ |/ / -_) / __/ _ \\/  ' \\/ -_) / __/ _ \\  / _// _ `/ _ `/ |/ / -_) _ \\/ __/ _ \\/ __/ // /\n" +
                " |__/|__/\\__/_/\\__/\\___/_/_/_/\\__/  \\__/\\___/ /___/\\_, /\\_, /|___/\\__/_//_/\\__/\\___/_/  \\_, / \n" +
                "                                                  /___//___/                           /___/  \n";


        printNewLine();
        System.out.println(logo);
        System.out.println("Hello! I'm Humpty Dumpty\n" + "What can I do for you?");
    }

    /**
     * Prints the standard newline.
     */
    public void printNewLine() {
        System.out.println("____________________________________________________________");
    }

    /**
     * Prints the duke exit message.
     */
    public void printExitMessage() {
        printNewLine();
        System.out.println("Bye! Hope to see you again soon!");
        printNewLine();
        System.exit(0);
    }

    public String read() {
        return in.nextLine();
    }

}
