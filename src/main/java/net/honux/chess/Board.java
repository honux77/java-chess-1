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
    private final static int BLACK_POS = 1;
    private final static int WHITE_POS = 6;
    private String[] display = new String[H];

    public void init() {
        whitePieceList.clear();
        blackPieceList.clear();
        addPawns(Piece.WHITE);
        addPawns(Piece.BLACK);
        cleanDisplay();
        displayPawns();
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

    public String[] getDisplay() {
        return display;
    }

    public int getSize(String color) {
        return getPawnList(color).size();
    }

    public void add(Piece piece) {
        if (piece.getColor() == Piece.BLACK) {
            blackPieceList.add(piece);
        } else {
            whitePieceList.add(piece);
        }
    }

    public Piece getPawn(String color, int index) {
        return getPawnList(color).get(index);
    }

    private List<Piece> getPawnList(String color) {
        if (color == Piece.WHITE) return whitePieceList;
        else return blackPieceList;
    }

    public String getPawns(String color) {
        StringBuilder sb = new StringBuilder();
        for(Piece p: getPawnList(color)) {
            sb.append(p.getRepresentation());
        }
        return sb.toString();
    }

    private void addPawns(String color) {
        for (int i = 0; i < W; i++) {
            if (color == Piece.WHITE) {
                getPawnList(color).add(Piece.createWhitePawn());
            }
            else {
                getPawnList(color).add(Piece.createBlackPawn());
            }
        }
    }

    private void displayPawns() {
        display[BLACK_POS] = getPawns(Piece.BLACK);
        display[WHITE_POS] = getPawns(Piece.WHITE);
    }

    private String emptyPieces() {
        return "........";
    }
}
