package net.honux.pieces;

public enum Type {
    PAWN('p', 1.0f),
    ROOK('r', 5.0f),
    KNIGHT('n', 2.5f),
    BISHOP('b', 3.0f),
    QUEEN('q', 9.0f),
    KING('k', 0.0f),
    NONE('.', 0.0f);

    private char representation;
    private double score;

    Type(char representation, double score) {
        this.representation = representation;
        this.score = score;
    }

    public char getRepresentation() {
        return representation;
    }

    public double getScore() {
        return this.score;
    }
}