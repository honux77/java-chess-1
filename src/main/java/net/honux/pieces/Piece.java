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
    public static final char NONE_REPRESENTATION = 'X';


    public static final String PAWN = "pawn";
    public static final String ROOK = "rook";
    public static final String KNIGHT = "knight";
    public static final String BISHOP = "bishop";
    public static final String QUEEN = "queen";
    public static final String KING = "king";



    private String color;
    private String type;
    private char representation;

    private Piece(String type, String color) {
        this.type = type;
        this.color = color;
        setRepresentation(type);
    }

    public static Piece create(String type, String color) {
        return new Piece(type, color);
    }

    private void setRepresentation(String type) {
        switch(type) {
            case PAWN:
                this.representation = PAWN_REPRESENTATION;
                break;
            case ROOK:
                this.representation = ROOK_REPRESENTATION;
                break;
            case KNIGHT:
                this.representation = KNIGHT_REPRESENTATION;
                break;
            case BISHOP:
                this.representation = BISHOP_REPRESENTATION;
                break;
            case QUEEN:
                this.representation = QUEEN_REPRESENTATION;
                break;
            case KING:
                this.representation = KING_REPRESENTATION;
                break;
            default:
                this.representation = NONE_REPRESENTATION;
        }

        if(this.color == BLACK) {
            this.representation = toUpperCase(this.representation);
        }
    }

    public String getColor() {
        return color;
    }

    public String getType() {
        return type;
    }

    public char getRepresentation() {
        return representation;
    }
}
