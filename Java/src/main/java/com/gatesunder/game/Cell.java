package com.gatesunder.game;

public class Cell
{
	public Cell( int x, int y ) {
		this.x = x;
		this.y = y;
	}

	public int getX() {return x;}
	public int getY() {return y;}

	public void setX( int x ) {this.x = x;}
	public void setY( int y ) {this.y = y;}

	private int x;
	private int y;
}
