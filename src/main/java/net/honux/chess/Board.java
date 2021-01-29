package net.honux.chess;

import net.honux.pieces.Piece;
import net.honux.pieces.Type;

import java.util.List;
import static net.honux.utils.StringUtils.appendNewLine;

public class Board {

    private final static int W = 8;
    private final static int H = 8;
    private int size = 0;
    private Piece[][] pieces = new Piece[H][W];

    public enum File {
        A(0), B(1), C(2), D(3), E(4), F(5), G(6), H(7);

        private int column;

        File(int column) {
            this.column = column;
        }

        public int getColumn() {
            return this.column;
        }
    }

    public Board() {
        setEmptyPieces();
        addOthers(Piece.Color.BLACK);
        addPawns(Piece.Color.BLACK);
        addPawns(Piece.Color.WHITE);
        addOthers(Piece.Color.WHITE);
    }

    public int size() {
        return size;
    }

    private void setEmptyPieces() {
        //TODO: refactor using setPiece
        int[] emptyRank = {1,2, 3, 4, 5, 6, 7, 8};
        for (int i: emptyRank) {
            for (int j = 0; j < W; j++) {
                pieces[i - 1][j] = Piece.create(Type.NONE, Piece.Color.NO_COLOR);
                size++;
            }
        }
    }

    public void setPiece(Piece piece, File file, int rank) {
        pieces[rank - 1][file.getColumn()] = piece;
    }

    public Piece getPiece(File file, int rank) {
        return pieces[rank - 1][file.getColumn()];
    }

    private void addOthers(Piece.Color color) {
        int rank = 8;
        if (color == Piece.Color.BLACK) rank = 1;
        setPiece(Piece.create(Type.ROOK, color), File.A, rank);
        setPiece(Piece.create(Type.ROOK, color), File.H, rank);
        setPiece(Piece.create(Type.KNIGHT, color), File.B, rank);
        setPiece(Piece.create(Type.KNIGHT, color), File.G, rank);
        setPiece(Piece.create(Type.BISHOP,color), File.C, rank);
        setPiece(Piece.create(Type.BISHOP,color), File.F, rank);
        setPiece(Piece.create(Type.QUEEN,color), File.D, rank);
        setPiece(Piece.create(Type.KING,color), File.E, rank);
    }

    private void addPawns(Piece.Color color) {
        int rank = 7;
        if (color == Piece.Color.BLACK) rank = 2;
        setPiece(Piece.create(Type.PAWN, color), File.A, rank);
        setPiece(Piece.create(Type.PAWN, color), File.B, rank);
        setPiece(Piece.create(Type.PAWN, color), File.C, rank);
        setPiece(Piece.create(Type.PAWN, color), File.D, rank);
        setPiece(Piece.create(Type.PAWN, color), File.E, rank);
        setPiece(Piece.create(Type.PAWN, color), File.F, rank);
        setPiece(Piece.create(Type.PAWN, color), File.G, rank);
        setPiece(Piece.create(Type.PAWN, color), File.H, rank);
    }

    public String getDisplayString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < H; i++) {
            for (int j =0; j < W; j++) {
                sb.append(pieces[i][j].getRepresentation());
            }
            sb.append('\n');
        }
        return sb.toString();
    }

    public void print() {
        System.out.print(getDisplayString());
    }


}
