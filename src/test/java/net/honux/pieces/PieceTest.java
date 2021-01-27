package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static java.lang.Character.toUpperCase;

public class PieceTest {

    @Test
    @DisplayName("흑백 폰들을 생성하고 적당한 표현문자를 가져야 한다")
    void createPawn() {
        pieceCheck(Piece.createWhitePawn(), Piece.createBlackPawn(), Piece.PAWN_REPRESENTATION);

    }

    @Test
    @DisplayName("흑백 킹 생성 및 표현문자 체크")
    void createKing() {
        pieceCheck(Piece.createWhiteKing(), Piece.createBlackKing(), Piece.KING_REPRESENTATION);
    }

    void pieceCheck(Piece p1, Piece p2, char repr) {
        assertThat(p1.getColor()).isEqualTo(Piece.WHITE);
        assertThat(p2.getColor()).isEqualTo(Piece.BLACK);
        assertThat(p1.getRepresentation()).isEqualTo(repr);
        assertThat(p2.getRepresentation()).isEqualTo(toUpperCase(repr));
    }

}

