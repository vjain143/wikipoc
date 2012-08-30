/**
 * This class is use as a layer, to decouple common functionality and specific functionality of processors. 
 */
package com.wiki.poc.gol.processor.impl;

import com.wiki.poc.gol.bean.Cell;
import com.wiki.poc.gol.processor.GenericProcessor;

/**
 * @author Wiki
 */
public abstract class CellProcessor implements GenericProcessor
{

    /* (non-Javadoc)
     * @see com.wiki.poc.gol.processor.GenericProcessor#process(com.wiki.poc.gol.bean.Cell[][])
     */
    @Override
    public abstract Cell[][] process( Cell[][] cell );

    /* (non-Javadoc)
     * @see com.wiki.poc.gol.processor.GenericProcessor#printCell(com.wiki.poc.gol.bean.Cell[][])
     */
    @Override
    public void printCell( Cell[][] cell )
    {
        System.out.println( "<----- Start ---->" );
        for ( int row = 0; row < cell.length; row++ )
        {
            for ( int column = 0; column < cell[row].length; column++ )
            {
                System.out.print( cell[row][column].getState() );
            }
            System.out.println();
        }
        System.out.println( "<----- End ---->" );
    }
}