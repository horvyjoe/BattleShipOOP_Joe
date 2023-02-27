import java.util.Locale;
import java.util.ResourceBundle;

public class Display {

    //ez opcionális, nyelvválasztáshoz használható:
    //private static final ResourceBundle MESSAGE = ResourceBundle.getBundle("messages", Locale.forLanguageTag("en"));

    void printGameMenu() {
        // TODO
    }

    void printBoard() {
        // TODO
    }

    void printGameStatistics(){

    }

    void printEndResult() {

    }

    void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}
