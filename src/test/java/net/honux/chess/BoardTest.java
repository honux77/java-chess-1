package net.honux.chess;

import org.junit.jupiter.api.*;
import static org.assertj.core.api.Assertions.*;
import static net.honux.utils.StringUtils.appendNewLine;

public class BoardTest {
    Board board;
    private String blackPawn = "PPPPPPPP";
    private String whitePawn = "pppppppp";
    private String empty = "........";

    @BeforeEach
    void setup() {
        board = new Board();
    }

    @Test
    @DisplayName("체스보드 초기화시 크기는 64여야 한다")
    public void initAllPieceSize() {
        assertThat(board).isNotNull();
        assertThat(board.size()).isEqualTo(64);
    }

    @Test
    @DisplayName("체스 File A의 값은 0이고 H의 값은 7 이어야 한다.")
    void fileValue() {
        assertThat(Board.File.A.getColumn()).isEqualTo(0);
        assertThat(Board.File.H.getColumn()).isEqualTo(7);
    }

    @Test
    @DisplayName("체스 File A의 값은 0이고 H의 값은 7 이어야 한다.")
    void fileNext() {
        //TODO: implement
        //assertThat(Board.File.A.next()).isEqualTo(Board.File.B);
    }

    @Test
    @DisplayName("체스보드 초기화후 각 기물들이 제자리이 있어야 한다")
    public void checkBlackRepresentation() {
        String blankRank = appendNewLine("........");
        assertThat(board.getDisplayString()).isEqualTo(
                appendNewLine("RNBQKBNR") +
                        appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        appendNewLine("pppppppp") +
                        appendNewLine("rnbqkbnr"));
    }
}


