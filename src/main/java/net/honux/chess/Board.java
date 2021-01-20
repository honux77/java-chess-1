package net.honux.chess;

import net.honux.pieces.Pawn;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Pawn> whitePawnList= new ArrayList<>();
    private List<Pawn> blackPawnList = new ArrayList<>();
    private final static int W = 8;
    private final static int H = 8;
    private final static int BLACK_POS = 1;
    private final static int WHITE_POS = 6;
    private String[] display = new String[H];

    public void init() {
        whitePawnList.clear();
        blackPawnList.clear();
        addPawns(Pawn.WHITE);
        addPawns(Pawn.BLACK);
        cleanDisplay();
        displayPawns();
    }

    private void cleanDisplay() {
        for (int i = 0; i < H; i++) {
            display[i] = emptyPieces();
        }
    }

    public void print() {
        for (String line: display) {
            System.out.println(line);
        }
    }

    public String[] getDisplay() {
        return display;
    }

    public int getSize(String color) {
        return getPawnList(color).size();
    }

    public void add(Pawn pawn) {
        if (pawn.getColor() == Pawn.BLACK) {
            blackPawnList.add(pawn);
        } else {
            whitePawnList.add(pawn);
        }
    }

    public Pawn getPawn(String color, int index) {
        return getPawnList(color).get(index);
    }

    private List<Pawn> getPawnList(String color) {
        if (color == Pawn.WHITE) return whitePawnList;
        else return blackPawnList;
    }

    public String getPawns(String color) {
        StringBuilder sb = new StringBuilder();
        for(Pawn p: getPawnList(color)) {
            sb.append(p.getRepresentation());
        }
        return sb.toString();
    }

    private void addPawns(String color) {
        for (int i = 0; i < W; i++) {
            getPawnList(color).add(new Pawn(color));
        }
    }

    private void displayPawns() {
        display[BLACK_POS] = getPawns(Pawn.BLACK);
        display[WHITE_POS] = getPawns(Pawn.WHITE);
    }

    private String emptyPieces() {
        return "........";
    }
}
