package net.honux.pieces;

public enum Type {
    PAWN('p'),
    ROOK('r');

    private char representation;

    Type(char representation) {
        this.representation = representation;
    }

    public char getRepresentation() {
        return representation;
    }
}