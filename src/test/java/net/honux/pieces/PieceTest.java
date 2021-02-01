package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static java.lang.Character.toUpperCase;

public class PieceTest {

    @Test
    @DisplayName("흑백 폰 생성 및 표현문자 체크")
    void createPieces() {
        pieceCheck(Piece.create(Type.PAWN, Piece.Color.WHITE), Piece.create(Type.PAWN, Piece.Color.BLACK), Type.PAWN.getRepresentation());
    }

    @Test
    @DisplayName("흑백 룩 생성 및 표현문자 체크")
    void createRook() {
        pieceCheck(Piece.create(Type.ROOK, Piece.Color.WHITE), Piece.create(Type.ROOK, Piece.Color.BLACK), Type.ROOK.getRepresentation());
    }

    @Test
    @DisplayName("흑백 기사 생성 및 표현문자 체크")
    void createKnight() {
        pieceCheck(Piece.create(Type.KNIGHT, Piece.Color.WHITE), Piece.create(Type.KNIGHT, Piece.Color.BLACK), Type.KNIGHT.getRepresentation());
    }

    @Test
    @DisplayName("흑백 비숍 생성 및 표현문자 체크")
    void createBishop() {
        pieceCheck(Piece.create(Type.BISHOP, Piece.Color.WHITE), Piece.create(Type.BISHOP, Piece.Color.BLACK), Type.BISHOP.getRepresentation());
    }

    @Test
    @DisplayName("흑백 여왕 생성 및 표현문자 체크")
    void createQueen() {
        pieceCheck(Piece.create(Type.QUEEN, Piece.Color.WHITE), Piece.create(Type.QUEEN, Piece.Color.BLACK), Type.QUEEN.getRepresentation());
    }

    @Test
    @DisplayName("흑백 킹 생성 및 표현문자 체크")
    void createKing() {
        pieceCheck(Piece.create(Type.KING, Piece.Color.WHITE), Piece.create(Type.KING, Piece.Color.BLACK), Type.KING.getRepresentation());
    }

    void pieceCheck(Piece p1, Piece p2, char repr) {
        assertThat(p1.getColor()).isEqualTo(Piece.Color.WHITE);
        assertThat(p2.getColor()).isEqualTo(Piece.Color.BLACK);
        assertThat(p1.getRepresentation()).isEqualTo(repr);
        assertThat(p2.getRepresentation()).isEqualTo(toUpperCase(repr));
    }

}

