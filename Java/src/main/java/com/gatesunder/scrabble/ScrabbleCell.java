package com.gatesunder.scrabble;

import com.gatesunder.game.Cell;

public class ScrabbleCell
	extends Cell
{
	// Constructors
	// =========================================================================
	public ScrabbleCell( int x, int y ) {
		Super(x, y);
	}
	// =========================================================================

	// Accessor Methods
	// =========================================================================
	public Bonus getBonus() {return bonus;}
	public Letter getLetter() {return letter;}

	public void setBonus( Bonus bonus ) {this.bonus = bonus;}
	public void setLetter( Letter letter ) {this.letter = letter;}
	// =========================================================================

	// Private Data Members
	// =========================================================================
	private Bonus bonus;
	private Letter letter;
	// =========================================================================
}
