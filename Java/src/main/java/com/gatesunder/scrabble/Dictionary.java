package com.gatesunder.scrabble;

import java.util.TreeSet;
import java.util.Hashtable;

public class Dictionary
{
	// Constructors
	// =========================================================================
	public Dictionary() {
		this(0);
	}
	public Dictionary( int depth ) {
		this.depth = depth;
	}
	// =========================================================================

	// Query Methods
	// =========================================================================
	public TreeSet< String > getWords( StringBuilder letters ) {
		TreeSet< String > wordBank = new TreeSet< String >();

		if (letterTable != null) {
			for (int i = 0; i < letters.length(); i++) {
				Character c = new Character( letters.charAt( i ) );
				StringBuilder newLetters = new StringBuilder( letters );
				newLetters.deleteCharAt( i );
				wordBank.addAll( letterTable.get( c ).getWords( newLetters ) );
			}
		}
		
		if (theWord != "") {
			wordBank.add( theWord );
		}

		return wordBank;
	}
	// =========================================================================

	// Modification Methods
	// =========================================================================
	public void add( String word ) {
		if (word.length() != depth) {
			if (letterTable == null)
				initialize();
			Character c = new Character( word.charAt( depth ) );
			letterTable.get( c ).add( word );
		}
		else
			theWord = word;
	}
	// =========================================================================

	// Private Helper Methods
	// =========================================================================
	private void initialize() {
		letterTable = new Hashtable< Character, Dictionary >();

		letterTable.put( new Character( 'A' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'B' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'C' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'D' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'E' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'F' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'G' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'H' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'I' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'J' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'K' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'L' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'M' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'N' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'O' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'P' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'Q' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'R' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'S' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'T' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'U' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'V' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'W' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'X' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'Y' ), new Dictionary( depth + 1 ) );
		letterTable.put( new Character( 'Z' ), new Dictionary( depth + 1 ) );
	}
	// =========================================================================

	// Private Data Members
	// =========================================================================
	private String theWord = "";
	private int depth;
	private Hashtable< Character, Dictionary > letterTable;
	// =========================================================================
}
