/**
 * Interface to provide functionality of generic process for multiple operation for Cell object. 
 */
package com.wiki.poc.gol.processor;

import com.wiki.poc.gol.bean.Cell;

/**
 * @author Wiki
 */
public interface GenericProcessor
{
    /**
     * This method is use to process input given cell array and return a new cell array after
     * processing.
     * 
     * @param cell
     * @return
     */
    public Cell[][] process( Cell[][] cell );

    /**
     * To print given cell object in console.
     * 
     * @param cell
     */
    public void printCell( Cell[][] cell );
}
