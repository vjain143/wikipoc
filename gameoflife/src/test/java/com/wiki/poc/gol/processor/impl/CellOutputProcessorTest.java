/**
 *  * Test class to test CellOutputProcessor.
 */
package com.wiki.poc.gol.processor.impl;

import org.junit.Before;
import org.junit.Test;

import com.wiki.poc.gol.TestData;
import com.wiki.poc.gol.bean.Cell;
import com.wiki.poc.gol.processor.GenericProcessor;

import junit.framework.TestCase;

/**
 * @author Wiki
 */
public class CellOutputProcessorTest extends TestCase
{
    private GenericProcessor processor = null;

    @Before
    public void setUp()
    {
        this.processor = new CellOutputProcessor();
    }

    @Test
    public void testprocessforInput()
    {
        //Processing enriched input to generate output.
        Cell actualOutputCell[][] = this.processor.process( TestData.getTestDataEnrichedInputCellA() );
        //Printing Input Data.
        this.processor.printCell( TestData.getTestDataEnrichedInputCellA() );
        //Printing Expected Output Data.
        this.processor.printCell( TestData.getTestDataInputCellA() );
        //Printing Actual Output Data.
        this.processor.printCell( actualOutputCell );
        assertEquals( "CellOutputProcessorTest Process For Output A", true, TestData.compareCell( TestData.getTestDataInputCellA(), actualOutputCell ) );
    }
}
