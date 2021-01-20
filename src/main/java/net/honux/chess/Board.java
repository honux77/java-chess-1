package net.honux.chess;

import net.honux.pieces.Pawn;

import java.util.ArrayList;
import java.util.List;

public class Board {

    private List<Pawn> whitePawnList= new ArrayList<>();
    private List<Pawn> blackPawnList = new ArrayList<>();

    public void init() {
        whitePawnList.clear();
        blackPawnList.clear();
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


    public String getWhitePawn() {
        //TODO: implement
        return null;
    }

    public String getBlackPawn() {
        //TODO: implement
        return null;
    }
}
