package net.honux.chess;

import net.honux.pieces.Piece;

import java.util.ArrayList;
import java.util.List;
import static net.honux.utils.StringUtils.appendNewLine;

public class Board {

    private List<Piece> whitePieceList = new ArrayList<>();
    private List<Piece> blackPieceList = new ArrayList<>();
    private final static int W = 8;
    private final static int H = 8;
    private final static int BLACK_L1 = 0;
    private final static int BLACK_L2 = 1;
    private final static int WHITE_L1 = 6;
    private final static int WHITE_L2 = 7;
    private String[] display = new String[H];

    public void init() {
        whitePieceList.clear();
        blackPieceList.clear();

        addOthers(Piece.BLACK);
        addPawns(Piece.BLACK);

        addPawns(Piece.WHITE);
        addOthers(Piece.WHITE);


        cleanDisplay();
        displayPawns();
    }

    private void addOthers(String color) {
        List<Piece> list = getList(color);
        list.add(Piece.create(Piece.ROOK, color));
        list.add(Piece.create(Piece.KNIGHT, color));
        list.add(Piece.create(Piece.BISHOP, color));
        list.add(Piece.create(Piece.QUEEN, color));
        list.add(Piece.create(Piece.KING, color));
        list.add(Piece.create(Piece.BISHOP, color));
        list.add(Piece.create(Piece.KNIGHT, color));
        list.add(Piece.create(Piece.ROOK, color));
    }

    private void cleanDisplay() {
        for (int i = 0; i < H; i++) {
            display[i] = emptyPieces();
        }
    }

    public String getDisplayString() {
        String ret = "";
        for (String line: display) {
            ret += appendNewLine(line);
        }
        return ret;
    }

    public void print() {
        System.out.print(getDisplayString());
    }

    public int getSize(String color) {
        return getList(color).size();
    }

    public void add(Piece piece) {
        if (piece.getColor() == Piece.BLACK) {
            blackPieceList.add(piece);
        } else {
            whitePieceList.add(piece);
        }
    }

    public Piece getPiece(String color, int index) {
        return getList(color).get(index);
    }

    private List<Piece> getList(String color) {
        if (color == Piece.WHITE) return whitePieceList;
        else return blackPieceList;
    }

    public String getPieces(String color, int line) {
        StringBuilder sb = new StringBuilder();
        List<Piece> pieces = getList(color);
        int startIdx = 0;
        if (line == 2) startIdx = W;
        for(int i = startIdx; i < startIdx + W; i++) {
            sb.append(pieces.get(i).getRepresentation());
        }
        return sb.toString();
    }

    private void addPawns(String color) {
        for (int i = 0; i < W; i++) {
            getList(color).add(Piece.create(Piece.PAWN, color));
        }
    }

    private void displayPawns() {
        display[BLACK_L1] = getPieces(Piece.BLACK, 1);
        display[BLACK_L2] = getPieces(Piece.BLACK, 2);
        display[WHITE_L1] = getPieces(Piece.WHITE, 1);
        display[WHITE_L2] = getPieces(Piece.WHITE, 2);
    }

    private String emptyPieces() {
        return "........";
    }

    public int size() {
        return this.whitePieceList.size() + this.blackPieceList.size();
    }
}
