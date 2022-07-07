package chess.pieces;

import boardgame.Board;
import chess.ChessPiece;
import chess.Color;

public class Rook extends ChessPiece {

	private static final char ROOK = '\u2656';
	
	public Rook(Board board, Color color) {
		super(board, color);
	}

	@Override
	public String toString() {
		return String.valueOf(ROOK);
	}
	
}
