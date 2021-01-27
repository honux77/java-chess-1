package net.honux.pieces;

public class Piece {

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final char WHITE_REPRESENTATION = 'p';
    public static final char BLACK_REPRESENTATION = 'P';

    private String color;
    private String name;
    private char representation;

    public Piece(String color, String name) {
        this.color = color;
        this.name = name;

        if (color == BLACK) {
            this.representation = BLACK_REPRESENTATION;
        } else {
            this.representation = WHITE_REPRESENTATION;
        }
    }

    public String getColor() {
        return color;
    }

    public String getName() {
        return name;
    }

    public char getRepresentation() {
        return representation;
    }
}
