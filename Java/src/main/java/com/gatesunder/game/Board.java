package com.gatesunder.game;

import com.gatesunder.game.Cell;

public class Board< CellType extends Cell >
{
	public Board( int x, int y ) {
		this.x = x;
		this.y = y;

		board = new CellType[ x ][];

		for (int i = 0; i < x; i++)
			board[ i ] = new CellType[ y ];

		for (int i = 0; i < x; i++)
			for (int j = 0; j < y; j++)
				board[ i ][ j ] = new CellType( i, j );
	}

	public CellType getCell( int x, int y ) {return board[ x ][ y ];}

	private int x;
	private int y;
	private CellType[][] board;
}
