package net.honux.pieces;

import static java.lang.Character.toUpperCase;

public class Piece {

    public static final String WHITE = "white";
    public static final String BLACK = "black";
    public static final char PAWN_REPRESENTATION = 'p';
    public static final char ROOK_REPRESENTATION = 'r';
    public static final char KNIGHT_REPRESENTATION = 'n';
    public static final char BISHOP_REPRESENTATION = 'b';
    public static final char QUEEN_REPRESENTATION = 'q';
    public static final char KING_REPRESENTATION = 'k';

    public static final String PAWN = "pawn";
    public static final String ROOK = "rook";
    public static final String KNIGHT = "knight";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";



    private String color;
    private String name;
    private char representation;

    private Piece(String color, String name) {
        this.color = color;
        this.name = name;
        setRepresentation(name);
    }

    public static Piece createWhitePawn() {
        return new Piece(WHITE, PAWN);
    }

    public static Piece createBlackPawn() {
        return new Piece(BLACK, PAWN);
    }

    public static Piece createWhiteRook() {
        return new Piece(WHITE, ROOK);
    }

    public static Piece createBlackRook() {
        return new Piece(BLACK, ROOK);
    }


    public static Piece createWhiteKing() {
        return new Piece(WHITE, KING);
    }

    public static Piece createBlackKing() {
        return new Piece(BLACK, KING);
    }

    private void setRepresentation(String name) {
        switch(name) {
            case PAWN:
                this.representation = PAWN_REPRESENTATION;
                break;
            case KING:
                this.representation = KING_REPRESENTATION;
        }

        if(this.color == BLACK) {
            this.representation = toUpperCase(this.representation);
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
