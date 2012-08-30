/**
 * This is Mock Data class. 
 */
package com.wiki.poc.gol;

import com.wiki.poc.gol.bean.Cell;

/**
 * @author Wiki
 */
public class TestData
{
    /**
     * To compare actual output with actual output.
     * @param expectedCell : expected Cell Array.
     * @param actualCell : actual Cell Array.
     * @return : result as true or false.
     */
    public static boolean compareCell( Cell expectedCell[][], Cell actualCell[][] )
    {
        boolean isEqual = true;
        for ( int row = 0; row < expectedCell.length; row++ )
        {
            for ( int column = 0; column < expectedCell[row].length; column++ )
            {
                if ( expectedCell[row][column].getState() != actualCell[row][column].getState() )
                {
                    return false;
                }
            }
        }
        return isEqual;
    }

    public static Cell[][] getTestDataInputCellA()
    {
        Cell inputCell[][] = new Cell[2][2];

        inputCell[0][0] = new Cell();
        inputCell[0][0].setState( 'X' );

        inputCell[0][1] = new Cell();
        inputCell[0][1].setState( 'X' );

        inputCell[1][0] = new Cell();
        inputCell[1][0].setState( 'X' );

        inputCell[1][1] = new Cell();
        inputCell[1][1].setState( 'X' );
        return inputCell;
    }

    public static Cell[][] getTestDataExpectedInputCellA()
    {
        Cell expectedInputCell[][] = new Cell[2][2];

        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( 'X' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( 'X' );

        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( 'X' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( 'X' );
        return expectedInputCell;
    }

    public static Cell[][] getTestDataEnrichedInputCellA()
    {
        Cell expectedInputCell[][] = new Cell[4][4];
        //Row 1
        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( '-' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( '-' );

        expectedInputCell[0][2] = new Cell();
        expectedInputCell[0][2].setState( '-' );

        expectedInputCell[0][3] = new Cell();
        expectedInputCell[0][3].setState( '-' );
        //Row 2
        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( '-' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( 'X' );

        expectedInputCell[1][2] = new Cell();
        expectedInputCell[1][2].setState( 'X' );

        expectedInputCell[1][3] = new Cell();
        expectedInputCell[1][3].setState( '-' );
        //Row 3
        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( '-' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( 'X' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( 'X' );

        expectedInputCell[2][3] = new Cell();
        expectedInputCell[2][3].setState( '-' );
        //Row 4
        expectedInputCell[3][0] = new Cell();
        expectedInputCell[3][0].setState( '-' );

        expectedInputCell[3][1] = new Cell();
        expectedInputCell[3][1].setState( '-' );

        expectedInputCell[3][2] = new Cell();
        expectedInputCell[3][2].setState( '-' );

        expectedInputCell[3][3] = new Cell();
        expectedInputCell[3][3].setState( '-' );
        return expectedInputCell;
    }

    public static Cell[][] getTestDataInputCellB()
    {
        Cell inputCell[][] = new Cell[3][3];

        inputCell[0][0] = new Cell();
        inputCell[0][0].setState( 'X' );

        inputCell[0][1] = new Cell();
        inputCell[0][1].setState( 'X' );

        inputCell[0][2] = new Cell();
        inputCell[0][2].setState( '-' );

        inputCell[1][0] = new Cell();
        inputCell[1][0].setState( 'X' );

        inputCell[1][1] = new Cell();
        inputCell[1][1].setState( '-' );

        inputCell[1][2] = new Cell();
        inputCell[1][2].setState( 'X' );

        inputCell[2][0] = new Cell();
        inputCell[2][0].setState( '-' );

        inputCell[2][1] = new Cell();
        inputCell[2][1].setState( 'X' );

        inputCell[2][2] = new Cell();
        inputCell[2][2].setState( '-' );

        return inputCell;
    }

    public static Cell[][] getTestDataExpectedInputCellB()
    {
        //Setting expected enriched input
        Cell expectedInputCell[][] = new Cell[3][3];
        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( 'X' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( 'X' );

        expectedInputCell[0][2] = new Cell();
        expectedInputCell[0][2].setState( '-' );

        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( 'X' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( '-' );

        expectedInputCell[1][2] = new Cell();
        expectedInputCell[1][2].setState( 'X' );

        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( '-' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( 'X' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( '-' );

        return expectedInputCell;
    }

    public static Cell[][] getTestDataInputCellC()
    {
        Cell inputCell[][] = new Cell[3][3];

        inputCell[0][0] = new Cell();
        inputCell[0][0].setState( '-' );

        inputCell[0][1] = new Cell();
        inputCell[0][1].setState( 'X' );

        inputCell[0][2] = new Cell();
        inputCell[0][2].setState( '-' );

        inputCell[1][0] = new Cell();
        inputCell[1][0].setState( '-' );

        inputCell[1][1] = new Cell();
        inputCell[1][1].setState( 'X' );

        inputCell[1][2] = new Cell();
        inputCell[1][2].setState( '-' );

        inputCell[2][0] = new Cell();
        inputCell[2][0].setState( '-' );

        inputCell[2][1] = new Cell();
        inputCell[2][1].setState( 'X' );

        inputCell[2][2] = new Cell();
        inputCell[2][2].setState( '-' );

        return inputCell;
    }

    public static Cell[][] getTestDataExpectedInputCellC()
    {
        //Setting expected enriched input
        Cell expectedInputCell[][] = new Cell[3][3];
        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( '-' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( '-' );

        expectedInputCell[0][2] = new Cell();
        expectedInputCell[0][2].setState( '-' );

        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( 'X' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( 'X' );

        expectedInputCell[1][2] = new Cell();
        expectedInputCell[1][2].setState( 'X' );

        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( '-' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( '-' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( '-' );
        return expectedInputCell;
    }

    public static Cell[][] getTestDataInputCellD()
    {
        Cell inputCell[][] = new Cell[2][4];

        inputCell[0][0] = new Cell();
        inputCell[0][0].setState( '-' );

        inputCell[0][1] = new Cell();
        inputCell[0][1].setState( 'X' );

        inputCell[0][2] = new Cell();
        inputCell[0][2].setState( 'X' );

        inputCell[0][3] = new Cell();
        inputCell[0][3].setState( 'X' );

        inputCell[1][0] = new Cell();
        inputCell[1][0].setState( 'X' );

        inputCell[1][1] = new Cell();
        inputCell[1][1].setState( 'X' );

        inputCell[1][2] = new Cell();
        inputCell[1][2].setState( 'X' );

        inputCell[1][3] = new Cell();
        inputCell[1][3].setState( '-' );

        return inputCell;
    }

    public static Cell[][] getTestDataExpectedInputCellD()
    {
        Cell expectedInputCell[][] = new Cell[4][4];
        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( '-' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( '-' );

        expectedInputCell[0][2] = new Cell();
        expectedInputCell[0][2].setState( 'X' );

        expectedInputCell[0][3] = new Cell();
        expectedInputCell[0][3].setState( '-' );

        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( 'X' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( '-' );

        expectedInputCell[1][2] = new Cell();
        expectedInputCell[1][2].setState( '-' );

        expectedInputCell[1][3] = new Cell();
        expectedInputCell[1][3].setState( 'X' );

        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( 'X' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( '-' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( '-' );

        expectedInputCell[2][3] = new Cell();
        expectedInputCell[2][3].setState( 'X' );

        expectedInputCell[3][0] = new Cell();
        expectedInputCell[3][0].setState( '-' );

        expectedInputCell[3][1] = new Cell();
        expectedInputCell[3][1].setState( 'X' );

        expectedInputCell[3][2] = new Cell();
        expectedInputCell[3][2].setState( '-' );

        expectedInputCell[3][3] = new Cell();
        expectedInputCell[3][3].setState( '-' );

        return expectedInputCell;
    }

    /**
     * @return
     */
    public static Cell[][] getTestDataEnrichedOutputCellA()
    {
        Cell expectedInputCell[][] = new Cell[4][4];
        //Row 1
        expectedInputCell[0][0] = new Cell();
        expectedInputCell[0][0].setState( '-' );

        expectedInputCell[0][1] = new Cell();
        expectedInputCell[0][1].setState( '-' );

        expectedInputCell[0][2] = new Cell();
        expectedInputCell[0][2].setState( '-' );

        expectedInputCell[0][3] = new Cell();
        expectedInputCell[0][3].setState( '-' );
        //Row 2
        expectedInputCell[1][0] = new Cell();
        expectedInputCell[1][0].setState( '-' );

        expectedInputCell[1][1] = new Cell();
        expectedInputCell[1][1].setState( 'X' );

        expectedInputCell[1][2] = new Cell();
        expectedInputCell[1][2].setState( 'X' );

        expectedInputCell[1][3] = new Cell();
        expectedInputCell[1][3].setState( '-' );
        //Row 3
        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( '-' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( 'X' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( 'X' );

        expectedInputCell[2][3] = new Cell();
        expectedInputCell[2][3].setState( '-' );
        //Row 4
        expectedInputCell[2][0] = new Cell();
        expectedInputCell[2][0].setState( '-' );

        expectedInputCell[2][1] = new Cell();
        expectedInputCell[2][1].setState( '-' );

        expectedInputCell[2][2] = new Cell();
        expectedInputCell[2][2].setState( '-' );

        expectedInputCell[2][3] = new Cell();
        expectedInputCell[2][3].setState( '-' );
        return expectedInputCell;
    }

}
