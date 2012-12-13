package com.gatesunder.scrabble;

public class Play
{
	public Play( int x, int y, String word, int score ) {
		this.x = x;
		this.y = y;
		this.word = word;
		this.score = score;
	}

	public int x() {return x;}
	public int y() {return y;}
	public String word() {return word;}
	public int score() {return score;}

	private int x;
	private int y;
	private String word;
	private int score;
}
