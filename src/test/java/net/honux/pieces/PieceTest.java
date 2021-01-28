package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static java.lang.Character.toUpperCase;

public class PieceTest {

    @Test
    @DisplayName("흑백 폰 생성 및 표현문자 체크")
    void createPieces() {
        pieceCheck(Piece.create(Piece.PAWN, Piece.WHITE), Piece.create(Piece.PAWN, Piece.BLACK), Piece.PAWN_REPRESENTATION);
    }

    @Test
    @DisplayName("흑백 룩 생성 및 표현문자 체크")
    void createRook() {
        pieceCheck(Piece.create(Piece.ROOK, Piece.WHITE), Piece.create(Piece.ROOK, Piece.BLACK), Piece.ROOK_REPRESENTATION);
    }

    @Test
    @DisplayName("흑백 기사 생성 및 표현문자 체크")
    void createKnight() {
        pieceCheck(Piece.create(Piece.KNIGHT, Piece.WHITE), Piece.create(Piece.KNIGHT, Piece.BLACK), Piece.KNIGHT_REPRESENTATION);
    }

    @Test
    @DisplayName("흑백 비숍 생성 및 표현문자 체크")
    void createBishop() {
        pieceCheck(Piece.create(Piece.BISHOP, Piece.WHITE), Piece.create(Piece.BISHOP, Piece.BLACK), Piece.BISHOP_REPRESENTATION);
    }

    @Test
    @DisplayName("흑백 여왕 생성 및 표현문자 체크")
    void createQueen() {
        pieceCheck(Piece.create(Piece.QUEEN, Piece.WHITE), Piece.create(Piece.QUEEN, Piece.BLACK), Piece.QUEEN_REPRESENTATION);
    }

    @Test
    @DisplayName("흑백 킹 생성 및 표현문자 체크")
    void createKing() {
        pieceCheck(Piece.create(Piece.KING, Piece.WHITE), Piece.create(Piece.KING, Piece.BLACK), Piece.KING_REPRESENTATION);
    }

    void pieceCheck(Piece p1, Piece p2, char repr) {
        assertThat(p1.getColor()).isEqualTo(Piece.WHITE);
        assertThat(p2.getColor()).isEqualTo(Piece.BLACK);
        assertThat(p1.getRepresentation()).isEqualTo(repr);
        assertThat(p2.getRepresentation()).isEqualTo(toUpperCase(repr));
    }

}

