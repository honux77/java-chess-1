package net.honux.pieces;

import java.time.Period;

public class Piece {

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final char WHITE_PAWN_REPRESENTATION = 'p';
    public static final char BLACK_PAWN_REPRESENTATION = 'P';
    public static final String PAWN = "pawn";


    private String color;
    private String name;
    private char representation;

    private Piece(String color, String name) {
        this.color = color;
        this.name = name;
        if (color == WHITE) createWhitePiece(name);
        else createBlackPiece(name);
    }

    private void createWhitePiece(String name) {
        if (name == PAWN) {
            this.representation = WHITE_PAWN_REPRESENTATION;
        }
    }

    private void createBlackPiece(String name) {
        if (name == PAWN) {
            this.representation = BLACK_PAWN_REPRESENTATION;
        }
    }

    public static Piece createWhitePawn() {
        return new Piece(WHITE, PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(BLACK, PAWN);
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
