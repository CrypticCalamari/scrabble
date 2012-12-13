package com.gatesunder.scrabble;

public class Letter extends Character
{
	public Letter( char character, int points ) {
		super( character );

		this.points = points;
	}

	public int getPoints() {return points;}
	public void setPoints( int points ) {this.points = points;}

	private int points;
}
