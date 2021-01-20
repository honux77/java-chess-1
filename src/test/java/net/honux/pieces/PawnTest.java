package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class PawnTest {

    @Test
    @DisplayName("흑백 폰을 생성하고 갖자 적당한 표현문자를 가져야 한다")
    void create() {
        verifyPawn(Pawn.WHITE);
        verifyPawn(Pawn.BLACK);
    }

    @Test
    @DisplayName("기본 생성자로 흰색 폰이 생성되어야 한다")
    void createDefault() {
        Pawn p = new Pawn();
        assertThat(p.getColor()).isEqualTo(Pawn.WHITE);
    }

    void verifyPawn(String color) {
        Pawn p = new Pawn(color);
        assertThat(p.getColor()).isEqualTo(color);
        if (color == Pawn.WHITE) {
            assertThat(p.getRepresentation()).isEqualTo(Pawn.WHITE_REPRESENTATION);
        } else {
            assertThat(p.getRepresentation()).isEqualTo(Pawn.BLACK_REPRESENTATION);
        }
    }
}
