package net.honux.pieces;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class TypeTest {
    @Test
    @DisplayName("폰타입은 p로 출력되어야 한다")
    void pawn() {
        assertThat(Type.PAWN.getRepresentation()).isEqualTo('p');
    }
}
