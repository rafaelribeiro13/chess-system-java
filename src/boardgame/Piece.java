package boardgame;

public class Piece {

	protected Position position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
	}
	
	// só pode de ser acessado por classes do mesmo pacote
	// ou subclasses
	protected Board getBoard() {
		return board;
	}
	
}
