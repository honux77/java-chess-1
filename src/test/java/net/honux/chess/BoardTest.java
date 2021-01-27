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
        assertThat(board.getSize(Piece.WHITE)).isEqualTo(0);
        assertThat(board.getSize(Piece.BLACK)).isEqualTo(0);
    }

    @Test
    @DisplayName("체스보드 초기화가 완료되어야 한다.")
    public void initAllPieces() {
        board.init();
        assertThat(board.size()).isEqualTo(32);
        String blankRank = appendNewLine("........");
        assertThat(board.getDisplayString()).isEqualTo(
                appendNewLine("RNBQKBNR") +
                        appendNewLine("PPPPPPPP") +
                        blankRank + blankRank + blankRank + blankRank +
                        appendNewLine("pppppppp") +
                        appendNewLine("rnbqkbnr"));
    }

    @Test
    @DisplayName("흑백 폰이 각 8개씩 있어야 한다.")
    void init() {
        board.init();
        assertThat(board.getPawns(Piece.WHITE)).isEqualTo(whitePawn);
        assertThat(board.getPawns(Piece.BLACK)).isEqualTo(blackPawn);
    }

    @Test
    @DisplayName("보드가 생성되고 폰을 추가할 수 있어야 한다.")
    void create() {
        checkAddPawn(Piece.WHITE, 1);
        checkAddPawn(Piece.BLACK, 1);
        checkAddPawn(Piece.WHITE, 2);
        checkAddPawn(Piece.BLACK, 2);
    }

    void checkAddPawn(String color, int size) {
        if (color == Piece.WHITE) board.add(Piece.create(Piece.PAWN, Piece.WHITE));
        if (color == Piece.BLACK) board.add(Piece.create(Piece.PAWN, Piece.BLACK));
        assertThat(board.getSize(color)).isEqualTo(size);
        assertThat(board.getPiece(color, size - 1).getColor()).isEqualTo(color);
    }
}


