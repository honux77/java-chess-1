package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PieceTest {

    @Test
    @DisplayName("흑백 기물을 생성하고 갖자 적당한 표현문자를 가져야 한다")
    void create() {
        verifyPawn(Piece.WHITE);
        verifyPawn(Piece.BLACK);
    }

    void verifyPawn(String color) {
        Piece p = new Piece(color, "pawn");
        assertThat(p.getColor()).isEqualTo(color);
        assertThat(p.getName()).isEqualTo("pawn");
        if (color == Piece.WHITE) {
            assertThat(p.getRepresentation()).isEqualTo(Piece.WHITE_REPRESENTATION);
        } else {
            assertThat(p.getRepresentation()).isEqualTo(Piece.BLACK_REPRESENTATION);
        }
    }
}
