package com.gatesunder.scrabble;

import com.gatesunder.scrabble.ScrabbleCell;
import com.gatesunder.scrabble.Bonus;

import com.gatesunder.game.Board;

public class ScrabbleBoard
	extends Board< ScrabbleCell >
{
	public ScrabbleBoard() {
		super(15, 15);

		// Triple Words
		// ------------------------------------------------------------
		board[ 0 ][ 0 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 0 ][ 7 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 0 ][ 14 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 7 ][ 0 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 7 ][ 14 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 14 ][ 0 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 14 ][ 7 ].setBonus( Bonus.TRIPLE_WORD );
		board[ 14 ][ 14 ].setBonus( Bonus.TRIPLE_WORD );
		// ------------------------------------------------------------

		// Double Words
		// ------------------------------------------------------------
		board[ 1 ][ 1 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 2 ][ 2 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 3 ][ 3 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 4 ][ 4 ].setBonus( Bonus.DOUBLE_WORD );

		board[ 10 ][ 4 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 11 ][ 3 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 12 ][ 2 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 13 ][ 1 ].setBonus( Bonus.DOUBLE_WORD );

		board[ 1 ][ 13 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 2 ][ 12 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 3 ][ 11 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 4 ][ 10 ].setBonus( Bonus.DOUBLE_WORD );

		board[ 10 ][ 10 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 11 ][ 11 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 12 ][ 12 ].setBonus( Bonus.DOUBLE_WORD );
		board[ 13 ][ 13 ].setBonus( Bonus.DOUBLE_WORD );
		// ------------------------------------------------------------

		// Tripple Letters
		// ------------------------------------------------------------
		board[ 5 ][ 1 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 9 ][ 1 ].setBonus( Bonus.TRIPLE_LETTER );

		board[ 1 ][ 5 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 5 ][ 5 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 9 ][ 5 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 13 ][ 5 ].setBonus( Bonus.TRIPLE_LETTER );

		board[ 1 ][ 9 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 5 ][ 9 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 9 ][ 9 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 13 ][ 9 ].setBonus( Bonus.TRIPLE_LETTER );

		board[ 5 ][ 13 ].setBonus( Bonus.TRIPLE_LETTER );
		board[ 9 ][ 13 ].setBonus( Bonus.TRIPLE_LETTER );
		// ------------------------------------------------------------

		// Double Letters
		// ------------------------------------------------------------
		board[ 3 ][ 0 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 11 ][ 0 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 6 ][ 2 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 8 ][ 2 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 0 ][ 3 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 7 ][ 3 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 14 ][ 3 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 2 ][ 6 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 6 ][ 6 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 8 ][ 6 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 12 ][ 6 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 3 ][ 7 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 11 ][ 7 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 2 ][ 8 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 6 ][ 8 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 8 ][ 8 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 12 ][ 8 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 0 ][ 11 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 7 ][ 11 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 14 ][ 11 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 6 ][ 12 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 8 ][ 12 ].setBonus( Bonus.DOUBLE_LETTER );

		board[ 3 ][ 14 ].setBonus( Bonus.DOUBLE_LETTER );
		board[ 11 ][ 14 ].setBonus( Bonus.DOUBLE_LETTER );
		// ------------------------------------------------------------
	}
}
