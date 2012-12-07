package com.gatesunder.scrabble;

import java.util.ArrayList;

public class Dictionary
{
	// Constructors
	// =================================================
	public Dictionary() {
		this( 0 );
	}
	public Dictionary( int depth )
	{
		this.depth = depth;
		this.size = 0;
	}
	public Dictionary( String [] wordList ) {
		this( 0 );

		for (String word: wordList)
			this.add( word );
	}

	// Accessors
	// ================================================
	public ArrayList< String > getPossibleWords( StringBuilder letterBank ) {
		if (words.length() == 1 && depth > 1)
			return words;
		
		ArrayList< String > wordBank = new ArrayList< String >();

		for (int i = 0; i < letterBank.length(); i++) {
			char c = Character.toUpperCase( letterBank.charAt(i) );
			int val = Character.getNumericValue( c ) - 10;

			if (letters[ val ].size() != 0) {
				StringBuilder newLetterBank = new StringBuilder( letterBank );
				newLetterBank.deleteCharAt(i);
				ArrayList< String > temp = letter[ val ].getPossibleWords( newLetterBank );
				wordBank.addAll( temp );
			}
		}
		return wordBank;
	}

	public void add( String word ) {
		if (words == null)
			init();

		words.add( word );
		size++;

		if (word.length() - 1 > depth) {
			char c = Character.toUpperCase( word.charAt( depth + 1 ) );
			int i = Character.getNumericValue( c ) - 10;
			letters[ i ].add( word );
		}
	}

	private void init() {
		words = new ArrayList< String >();
		letters = new ArrayList< Dictionary >();

		for (int i = 10; i < 36; i++) {
			Dictionary dict = new Dictionary( depth + 1 );
			letters.add( dict );
		}
	}

	// Data
	// ================================================
	private int size;
	private int depth;
	private ArrayList< String > words;
	private ArrayList< LetterNode > letters;
}






