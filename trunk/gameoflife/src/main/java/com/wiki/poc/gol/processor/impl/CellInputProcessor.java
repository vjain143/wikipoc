/**
 * CellInputProcessor is use to convert 'actual input' to new 'enriched input' array. 
 * Each cell of actual input interacts with its eight neighbours and it's state in enriched array.
 * This enriched array is use for calculation of next genration of input,by its neighbours cell state.  
 */
package com.wiki.poc.gol.processor.impl;

import com.wiki.poc.gol.bean.Cell;

/**
 * @author Wiki
 */
public class CellInputProcessor extends CellProcessor
{

    /* (non-Javadoc)
     * @see com.wiki.poc.gol.processor.GenericProcessor#process(java.lang.Object)
     */
    @Override
    public Cell[][] process( Cell[][] inputCell )
    {
        //Creating new cell array to ensure every cell have all eight surrounding cell.
        Cell enrichedInputCell[][] = new Cell[inputCell.length + 2][inputCell[0].length + 2];
        for ( int row = 0; row < enrichedInputCell.length; row++ )
        {
            //enrich input for first row and last row
            if ( row == 0 || row == enrichedInputCell.length - 1 )
            {
                for ( int column = 0; column < enrichedInputCell[row].length; column++ )
                {
                    enrichedInputCell[row][column] = new Cell();
                    enrichedInputCell[row][column].setState( '-' );
                }
            }
            //putting actual input value in newly created enriched cell array. 
            if ( ( row != 0 ) && ( row != enrichedInputCell.length - 1 ) )
            {
                for ( int column = 0; column < enrichedInputCell[row].length; column++ )
                {
                    //For first column and last column
                    if ( ( column == 0 ) || ( column == ( enrichedInputCell[row].length - 1 ) ) )
                    {
                        enrichedInputCell[row][column] = new Cell();
                        enrichedInputCell[row][column].setState( '-' );
                    }
                    else
                    {
                        enrichedInputCell[row][column] = new Cell();
                        enrichedInputCell[row][column].setState( inputCell[row - 1][column - 1].getState() );
                    }
                }
            }
        }
        return enrichedInputCell;
    }
}
