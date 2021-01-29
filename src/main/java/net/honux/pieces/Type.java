package net.honux.pieces;

public enum Type {
    PAWN('p'),
    ROOK('r'),
    KNIGHT('n'),
    BISHOP('b'),
    QUEEN('q'),
    KING('k'),
    NONE('.');

    private char representation;

    Type(char representation) {
        this.representation = representation;
    }

    public char getRepresentation() {
        return representation;
    }
}