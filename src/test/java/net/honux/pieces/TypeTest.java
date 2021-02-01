package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class TypeTest {

    @Test
    @DisplayName("기물들이 타입별로 적절히 표현되는지 확인")
    void pawn() {
        assertThat(Type.PAWN.getRepresentation()).isEqualTo('p');
        assertThat(Type.ROOK.getRepresentation()).isEqualTo('r');
        assertThat(Type.KNIGHT.getRepresentation()).isEqualTo('n');
        assertThat(Type.BISHOP.getRepresentation()).isEqualTo('b');
        assertThat(Type.QUEEN.getRepresentation()).isEqualTo('q');
        assertThat(Type.KING.getRepresentation()).isEqualTo('k');
    }
}
