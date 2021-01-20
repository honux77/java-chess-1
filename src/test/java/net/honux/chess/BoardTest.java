package net.honux.chess;

import net.honux.pieces.Pawn;
import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;

public class BoardTest {
    Board board;

    @BeforeEach
    void setup() {
        board = new Board();
        assertThat(board).isNotNull();
        assertThat(board.getSize(Pawn.WHITE)).isEqualTo(0);
        assertThat(board.getSize(Pawn.BLACK)).isEqualTo(0);
    }

    @Test
    @DisplayName("흑백 폰이 각 8개씩 있어야 한다.")
    void init() {
        board.init();
        assertThat(board.getPawns(Pawn.WHITE)).isEqualTo("pppppppp");
        assertThat(board.getPawns(Pawn.BLACK)).isEqualTo("PPPPPPPP");
    }

    @Test
    @DisplayName("보드가 생성되고 폰을 추가할 수 있어야 한다.")
    void create() {
        checkAddPawn(Pawn.WHITE, 1);
        checkAddPawn(Pawn.BLACK, 1);
        checkAddPawn(Pawn.WHITE, 2);
        checkAddPawn(Pawn.BLACK, 2);
    }

    void checkAddPawn(String color, int size) {
        board.add(new Pawn(color));
        assertThat(board.getSize(color)).isEqualTo(size);
        assertThat(board.getPawn(color, size - 1).getColor()).isEqualTo(color);
    }
}

