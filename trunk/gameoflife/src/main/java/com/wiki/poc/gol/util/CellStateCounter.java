package com.wiki.poc.gol.util;

/**
 * This class is use as a state counter. 
 * It has two counter live and dead to count it's all neighbours dead or live state.
 */
import com.wiki.poc.gol.bean.Cell;

/**
 * @author Wiki
 */
public class CellStateCounter
{
    /* Live State Counter */
    private int liveStateCount;
    
    /* Dead State Counter */
    private int deadStateCount;

    public CellStateCounter( Cell inputCell[][], int row, int column )
    {
        this.liveStateCount = 0;
        this.deadStateCount = 0;

        this.setLeftCellState( inputCell, row, column );
        this.setRightCellState( inputCell, row, column );
        this.setTopCellState( inputCell, row, column );
        this.setTopLeftDiagonalCellState( inputCell, row, column );
        this.setTopRightDiagonalCellState( inputCell, row, column );
        this.setBottomCellState( inputCell, row, column );
        this.setBottomLeftDiagonalCellState( inputCell, row, column );
        this.setBottomRightDiagonalCellState( inputCell, row, column );
    }

    /**
     * @return the liveStateCount
     */
    public int getLiveStateCount()
    {
        return liveStateCount;
    }

    /**
     * @param liveStateCount
     *            the liveStateCount to set
     */
    public void setLiveStateCount( int liveStateCount )
    {
        this.liveStateCount = liveStateCount;
    }

    /**
     * @return the deadStateCount
     */
    public int getDeadStateCount()
    {
        return deadStateCount;
    }

    /**
     * @param deadStateCount
     *            the deadStateCount to set
     */
    public void setDeadStateCount( int deadStateCount )
    {
        this.deadStateCount = deadStateCount;
    }

    /**
     * Use to set Left Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setLeftCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row][column - 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set Right Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setRightCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row][column + 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set Top Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setTopCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row - 1][column].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set TopLeft Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setTopLeftDiagonalCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row - 1][column - 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set TopRight Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setTopRightDiagonalCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row - 1][column + 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set Bottom Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setBottomCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row + 1][column].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set BottomLeft Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setBottomLeftDiagonalCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row + 1][column - 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * Use to set BottomRight Cell State and live dead count.
     * 
     * @param cell
     *            : inputcell
     * @param row
     *            : row number
     * @param column
     *            : column number
     */
    private void setBottomRightDiagonalCellState( Cell cell[][], int row, int column )
    {
        char state = '-';
        try
        {
            state = cell[row + 1][column + 1].getState();
        }
        catch ( ArrayIndexOutOfBoundsException e )
        {
            state = '-';
        }
        this.setLiveDeadCount( state );
    }

    /**
     * This method is use to set count based on its state.
     * 
     * @param state
     *            : state of cell
     */
    private void setLiveDeadCount( char state )
    {
        if ( state == 'X' )
        {
            this.liveStateCount++;
        }
        else
        {
            this.deadStateCount++;
        }
    }
}
