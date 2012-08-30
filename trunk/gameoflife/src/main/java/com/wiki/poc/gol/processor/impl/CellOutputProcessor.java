/**
 * CellOutputProcessor is use to convert 'enriched input' to 'actual output'.
 * Each cell of enriched input interacts with its eight neighbours and it's state in enriched array.
 * This enriched array is use for calculation of next genration of input,by its neighbours cell state. 
 * On the time of input processing, new state of each cell is stored in newly created 'enriched output cell array'.
 * This newly created 'enriched output cell' again enriched to 'actual output cell' for surrounding neighbours 'dead row' and 'dead columns';
 * accordingly dead row and column will be removed.   
 */
package com.wiki.poc.gol.processor.impl;

import com.wiki.poc.gol.bean.Cell;
import com.wiki.poc.gol.util.CellStateCounter;

/**
 * @author Wiki
 */
public class CellOutputProcessor extends CellProcessor
{

    /* (non-Javadoc)
     * @see com.wiki.poc.gol.processor.GenericProcessor#process(com.wiki.poc.gol.bean.Cell[][])
     */
    @Override
    public Cell[][] process( Cell[][] enrichedInputCell )
    {
        Cell[][] enrichedOutputCell = new Cell[enrichedInputCell.length][enrichedInputCell[0].length];

        for ( int row = 0; row < enrichedInputCell.length; row++ )
        {
            for ( int column = 0; column < enrichedInputCell[row].length; column++ )
            {
                this.processOutput( enrichedInputCell, row, column, enrichedOutputCell );
            }
        }

        //Enrich First Column
        Cell[][] enrichedFirstColumnCell = enrichFirstColumn( enrichedOutputCell );
        //Enrich Last Column
        Cell[][] enrichedLastColumnCell = enrichLastColumn( enrichedFirstColumnCell );
        //Enrich First Row
        Cell[][] enrichedFirstRowCell = enrichFirstRow( enrichedLastColumnCell );
        //Enrich Last Row
        Cell[][] actualOutputCell = enrichLastRow( enrichedFirstRowCell );

        return actualOutputCell;
    }

    /**
     * This method is use to set next state of cell, based on its all eight neighbours.
     * 
     * @param inputCell
     *            : enriched input cell array.
     * @param row
     *            : row number of cell.
     * @param column
     *            : column number of cell.
     * @param outputCell
     *            : enriched output cell array.
     */
    private void processOutput( Cell inputCell[][], int row, int column, Cell outputCell[][] )
    {
        CellStateCounter cellStateCounter = new CellStateCounter( inputCell, row, column );
        int liveStateCount = cellStateCounter.getLiveStateCount();

        outputCell[row][column] = new Cell();

        if ( liveStateCount < 2 )
        {
            //Condition : Any live cell with fewer than two live neighbours dies, as if by loneliness.
            outputCell[row][column].setState( '-' );
        }
        else if ( liveStateCount > 3 )
        {
            //Condition : Any live cell with more than three live neighbours dies, as if by overcrowding.
            outputCell[row][column].setState( '-' );
        }
        else if ( liveStateCount == 3 )
        {
            //Condition : Any dead cell with exactly three live neighbours comes to life.
            outputCell[row][column].setState( 'X' );
        }
        else
        {
            char state = inputCell[row][column].getState();
            outputCell[row][column].setState( state );
            //Condition : Any live cell with two or three live neighbours lives, unchanged, to the next generation.
        }
    }

    /**
     * This method is use to enrich first column of input cell array. It will remove extra 'first
     * column' of each row; if all dead, those are added on the time of input processing.
     * 
     * @param inputCell
     *            : enriched output cell array.
     * @return outputcell : new enriched output cell array.
     */
    private Cell[][] enrichFirstColumn( Cell[][] inputCell )
    {
        Cell[][] outputCell = null;
        boolean isFirstColumnAlive = false;
        for ( int rowInput = 0; rowInput < inputCell.length; rowInput++ )
        {
            for ( int columnInput = 0; columnInput < inputCell[rowInput].length; columnInput++ )
            {
                if ( columnInput == 0 )
                {
                    if ( 'X' == inputCell[rowInput][columnInput].getState() )
                    {
                        isFirstColumnAlive = true;
                    }
                }
            }
        }
        if ( isFirstColumnAlive )
        {
            outputCell = inputCell;
        }
        else
        {
            outputCell = new Cell[inputCell.length][( inputCell[0].length - 1 )];
            for ( int rowInput = 0; rowInput < outputCell.length; rowInput++ )
            {
                for ( int columnInput = 0; columnInput < outputCell[rowInput].length; columnInput++ )
                {
                    outputCell[rowInput][columnInput] = new Cell();
                    outputCell[rowInput][columnInput].setState( inputCell[rowInput][columnInput + 1].getState() );
                }
            }
        }
        return outputCell;
    }

    /**
     * This method is use to enrich last column of input cell array. It will remove extra 'last
     * column' of each row; if all dead, those are added on the time of input processing.
     * 
     * @param inputCell
     *            : enriched output cell array.
     * @return outputcell : new enriched output cell array.
     */
    private Cell[][] enrichLastColumn( Cell[][] inputCell )
    {
        Cell[][] outputCell = null;
        boolean isLastColumnAlive = false;
        for ( int rowInput = 0; rowInput < inputCell.length; rowInput++ )
        {
            for ( int columnInput = 0; columnInput < inputCell[rowInput].length; columnInput++ )
            {
                if ( columnInput == ( inputCell[rowInput].length - 1 ) )
                {
                    if ( 'X' == inputCell[rowInput][columnInput].getState() )
                    {
                        isLastColumnAlive = true;
                    }
                }
            }
        }
        if ( isLastColumnAlive )
        {
            outputCell = inputCell;
        }
        else
        {
            outputCell = new Cell[inputCell.length][( inputCell[0].length - 1 )];
            for ( int rowInput = 0; rowInput < outputCell.length; rowInput++ )
            {
                for ( int columnInput = 0; columnInput < outputCell[rowInput].length; columnInput++ )
                {
                    outputCell[rowInput][columnInput] = new Cell();
                    outputCell[rowInput][columnInput].setState( inputCell[rowInput][columnInput].getState() );
                }
            }
        }
        return outputCell;
    }

    /**
     * This method is use to enrich first row of input cell array. It will remove extra 'first row'
     * of each row; if all dead, those are added on the time of input processing.
     * 
     * @param inputCell
     *            : enriched output cell array.
     * @return outputcell : new enriched output cell array.
     */
    private Cell[][] enrichFirstRow( Cell[][] inputCell )
    {
        Cell[][] outputCell = null;
        boolean isTopRowAlive = false;

        for ( int rowInput = 0; rowInput < inputCell.length; rowInput++ )
        {
            if ( rowInput == 0 )
            {
                for ( int columnInput = 0; columnInput < inputCell[rowInput].length; columnInput++ )
                {
                    if ( 'X' == inputCell[rowInput][columnInput].getState() )
                    {
                        isTopRowAlive = true;
                    }
                }
            }
        }
        if ( isTopRowAlive )
        {
            outputCell = inputCell;
        }
        else
        {
            outputCell = new Cell[inputCell.length - 1][( inputCell[0].length )];
            for ( int rowInput = 0; rowInput < outputCell.length; rowInput++ )
            {
                for ( int columnInput = 0; columnInput < outputCell[rowInput].length; columnInput++ )
                {
                    outputCell[rowInput][columnInput] = new Cell();
                    outputCell[rowInput][columnInput].setState( inputCell[rowInput + 1][columnInput].getState() );
                }
            }
        }
        return outputCell;
    }

    /**
     * This method is use to enrich last row of input cell array. It will remove extra 'last row' of
     * each row; if all dead, those are added on the time of input processing.
     * 
     * @param inputCell
     *            : enriched output cell array.
     * @return outputcell : new enriched output cell array.
     */
    private Cell[][] enrichLastRow( Cell[][] inputCell )
    {
        Cell[][] outputCell = null;
        boolean isLastRowAlive = false;

        for ( int rowInput = 0; rowInput < inputCell.length; rowInput++ )
        {
            if ( rowInput == inputCell.length - 1 )
            {
                for ( int columnInput = 0; columnInput < inputCell[rowInput].length; columnInput++ )
                {
                    if ( 'X' == inputCell[rowInput][columnInput].getState() )
                    {
                        isLastRowAlive = true;
                    }
                }
            }
        }
        if ( isLastRowAlive )
        {
            outputCell = inputCell;
        }
        else
        {
            outputCell = new Cell[inputCell.length - 1][( inputCell[0].length )];
            for ( int rowInput = 0; rowInput < outputCell.length; rowInput++ )
            {
                for ( int columnInput = 0; columnInput < outputCell[rowInput].length; columnInput++ )
                {
                    outputCell[rowInput][columnInput] = new Cell();
                    outputCell[rowInput][columnInput].setState( inputCell[rowInput][columnInput].getState() );
                }
            }
        }
        return outputCell;
    }
}