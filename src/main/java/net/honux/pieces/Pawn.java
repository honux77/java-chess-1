package net.honux.pieces;

public class Pawn {

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final char WHITE_REPRESENTATION = 'p';
    public static final char BLACK_REPRESENTATION = 'P';

    private String color;
    private char representation;

    public Pawn() {
        this(WHITE);
        representation = WHITE_REPRESENTATION;
    }

    public Pawn(String color) {
        this.color = color;
        if (color == BLACK) {
            this.representation = BLACK_REPRESENTATION;
        } else {
            this.representation = WHITE_REPRESENTATION;
        }
    }

    public String getColor() {
        return color;
    }

    public char getRepresentation() {
        return representation;
    }
}
