package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PieceTest {

    @Test

    @DisplayName("흑백 폰들을 생성하고 적당한 표현문자를 가져야 한다")
    void createPawn() {
        Piece wp = Piece.createWhitePawn();
        Piece bp = Piece.createBlackPawn();
        assertThat(wp.getColor()).isEqualTo(Piece.WHITE);
        assertThat(bp.getColor()).isEqualTo(Piece.BLACK);
        assertThat(wp.getRepresentation()).isEqualTo(Piece.WHITE_PAWN_REPRESENTATION);
        assertThat(bp.getRepresentation()).isEqualTo(Piece.BLACK_PAWN_REPRESENTATION);
    }

}

