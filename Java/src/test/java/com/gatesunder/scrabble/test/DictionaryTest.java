package com.gatesunder.scrabble.test;

import com.gatesunder.scrabble.Dictionary;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.TreeSet;

public class DictionaryTest
{
	public static void main( String... args ) {
		Dictionary dict = new Dictionary();

		load( dict, "TWL06.txt" );

		TreeSet< String > wordBank = dict.getWords( new StringBuilder( "AAHCTQI" ) );

		for (String word: wordBank)
			System.out.println( word );
	}

	public static void load( Dictionary dict, String file ) {
		try {
			BufferedReader bf = new BufferedReader( new FileReader( file ) );

			while (bf.ready()) {
				String word = bf.readLine();
				dict.add( word );
			}

			bf.close();
		} catch (Exception ex) {
			System.out.println( ex.getMessage() );
		}
	}
}
