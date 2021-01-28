package net.honux.chess;

import net.honux.pieces.Piece;
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
        assertThat(board).isNotNull();
        assertThat(board.size()).isEqualTo(0);
        assertThat(board.getSize(Piece.Color.WHITE)).isEqualTo(0);
        assertThat(board.getSize(Piece.Color.BLACK)).isEqualTo(0);
    }

    @Test
    @DisplayName("체스보드 초기화시 크기는 32여야 한다")
    public void initAllPieceSize() {
        board.init();
        assertThat(board.size()).isEqualTo(32);
    }

    @Test
    @DisplayName("체스보드 초기화후 블랙이 제자리이 있어야 한다")
    public void checkBlackRepresentation() {
        board.init();
        String blankRank = appendNewLine("........");
        assertThat(board.getDisplayString()).isEqualTo(
                appendNewLine("RNBQKBNR") +
                        appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        appendNewLine("pppppppp") +
                        appendNewLine("rnbqkbnr"));
    }

    @Test
    @DisplayName("보드가 생성되고 폰을 추가할 수 있어야 한다.")
    void create() {
        checkAddPawn(Piece.Color.WHITE, 1);
        checkAddPawn(Piece.Color.BLACK, 1);
        checkAddPawn(Piece.Color.WHITE, 2);
        checkAddPawn(Piece.Color.BLACK, 2);
    }

    void checkAddPawn(Piece.Color color, int size) {
        if (color == Piece.Color.WHITE) board.add(Piece.create(Piece.PAWN, Piece.Color.WHITE));
        if (color == Piece.Color.BLACK) board.add(Piece.create(Piece.PAWN, Piece.Color.BLACK));
        assertThat(board.getSize(color)).isEqualTo(size);
        assertThat(board.getPiece(color, size - 1).getColor()).isEqualTo(color);
    }
}


