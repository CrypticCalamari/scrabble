package com.gatesunder.scrabble;

import com.gatesunder.scrabble.Letter;

import java.util.ArrayList;

public class TileBag
{
	public TileBag() {
		for (int i = 0; i < 9; i++)
			bag.add( new Letter('A', 1) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('B', 3) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('C', 3) );
		for (int i = 0; i < 4; i++)
			bag.add( new Letter('D', 2) );
		for (int i = 0; i < 12; i++)
			bag.add( new Letter('E', 1) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('F', 4) );
		for (int i = 0; i < 3; i++)
			bag.add( new Letter('G', 2) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('H', 4) );
		for (int i = 0; i < 9; i++)
			bag.add( new Letter('I', 1) );
			bag.add( new Letter('J', 8) );
			bag.add( new Letter('K', 5) );
		for (int i = 0; i < 4; i++)
			bag.add( new Letter('L', 1) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('M', 3) );
		for (int i = 0; i < 6; i++)
			bag.add( new Letter('N', 1) );
		for (int i = 0; i < 8; i++)
			bag.add( new Letter('O', 1) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('P', 3) );
			bag.add( new Letter('Q', 10) );
		for (int i = 0; i < 6; i++)
			bag.add( new Letter('R', 1) );
		for (int i = 0; i < 4; i++)
			bag.add( new Letter('S', 1) );
		for (int i = 0; i < 6; i++)
			bag.add( new Letter('T', 1) );
		for (int i = 0; i < 4; i++)
			bag.add( new Letter('U', 1) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('V', 4) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('W', 4) );
			bag.add( new Letter('X', 8) );
		for (int i = 0; i < 2; i++)
			bag.add( new Letter('Y', 4) );
			bag.add( new Letter('Z', 10) );
	}

	public ArrayList< Letter > draw( int pieces ) {
		Collections.shuffle( bag );
		int drawSize = pieces;
		ArrayList< Letter > letters = new ArrayList< Letter >();

		drawSize = (pieces > bag.size()) ? bag.size() : pieces;

		for (int i = 0; i < drawSize; i++)
			letters.add( bag.get( i ) );

		bag.removeRange( 0, drawSize );

		return letters;
	}
	public ArrayList< Letter > exchange( Letter... discard ) {
		ArrayList< Letter > letters = new ArrayList< Letter >();

		if (bag.size() < 7)
			return letters;

		for (Letter L: discard)
			bag.add( L );

		Collections.shuffle( bag );

		for (int i = 0; i < discard.length(); i++)
			letters.add( bag.get( i ) );

		bag.removeRange( 0, discard.length() );

		return letters;
	}
	public int size() {return bag.size();}

	private ArrayList< Letter > bag;
}
