/* Minden usertől bekért infomációval ez foglalkozik */

import java.awt.*;
import java.util.List;
import java.util.Scanner;

public class Input {
    private static final Scanner INPUT = new Scanner(System.in);

    //Ha bárminek szüksége van koordinátára azt az alábbi függvény fogja intézni:
    static Point getRowColumn(String message, int boardSize) { //a message az, amit kiír kérdésként, pl első hajó helyzete
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    //Menüválasztásért felel, pl vs AI or Human
    static Object selectOption(String message, List<Object> menuItem){
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    //Opcionálisak:

/* Validálást végzi: megnézi, hogy az adott pontunk belefér a játéktérbe */

    private static boolean validateRow(int y, int boardSize){
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    private static boolean validateColumn(int x, int boardSize){
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }

    // x és y egyben vizsgálva,validálva, ha szükséges:
    private static boolean validatePoint(Point point, int boardSize){
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }


    // A menüválasztást validája
    private static boolean validateOption(String selection, int numberOfOptions) { //Selection=mit választott a user
        // TODO
        throw new UnsupportedOperationException("Not implemented yet");
    }
}
