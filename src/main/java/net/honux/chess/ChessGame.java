package net.honux.chess;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Scanner;

public class ChessGame {

    private Board board;
    private final static String PROMPT = "CHESS> ";
    private static Logger logger = LoggerFactory.getLogger(ChessGame.class);

    public ChessGame() {
        board = new Board();
    }

    public void loop() {
        Scanner s = new Scanner(System.in);
        while (true) {
            System.out.println("Available command: (start, end)");
            System.out.print("CHESS> ");
            String cmd = s.nextLine();
            if (cmd.equals("end")) break;
            board.print();
        }
        s.close();
    }

    public static void main(String[] args) {
        logger.info("Start Chess Game");
        ChessGame game = new ChessGame();
        game.loop();
        System.out.println("Bye");
        logger.info("Start Chess Game Ended");

    }
}
