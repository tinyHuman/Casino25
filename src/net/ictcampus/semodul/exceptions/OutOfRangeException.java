package net.ictcampus.semodul.exceptions;

public class OutOfRangeException extends Exception {
    public OutOfRangeException() {
        super("Die Eingabe liegt ausserhalb des Bereichs");
    }

    public OutOfRangeException(String message) {
        super(message);
    }
}
