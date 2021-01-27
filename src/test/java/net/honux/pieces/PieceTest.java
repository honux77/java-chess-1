package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static java.lang.Character.toUpperCase;

public class PieceTest {

    @Test
    @DisplayName("흑백 폰들을 생성하고 적당한 표현문자를 가져야 한다")
    void createPawn() {
        Piece wp = Piece.createWhitePawn();
        Piece bp = Piece.createBlackPawn();
        assertThat(wp.getColor()).isEqualTo(Piece.WHITE);
        assertThat(bp.getColor()).isEqualTo(Piece.BLACK);
        assertThat(wp.getRepresentation()).isEqualTo(Piece.PAWN_REPRESENTATION);
        assertThat(bp.getRepresentation()).isEqualTo(toUpperCase(Piece.PAWN_REPRESENTATION));
    }

    @Test
    void createKing() {
        Piece wKing = Piece.createWhiteKing();
        Piece BKing = Piece.createBlackKing();
        assertThat(wKing.getColor()).isEqualTo(Piece.WHITE);
        assertThat(BKing.getColor()).isEqualTo(Piece.BLACK);
        assertThat(wKing.getRepresentation()).isEqualTo(Piece.KING_REPRESENTATION);
        assertThat(BKing.getRepresentation()).isEqualTo(toUpperCase(Piece.KING_REPRESENTATION));
    }

}

