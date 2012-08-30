/**
 * Test class to test CellInputProcessor.
 */
package com.wiki.poc.gol.processor.impl;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;

import com.wiki.poc.gol.TestData;
import com.wiki.poc.gol.bean.Cell;
import com.wiki.poc.gol.processor.GenericProcessor;

/**
 * @author Wiki
 */
public class CellInputProcessorTest extends TestCase
{
    private GenericProcessor processor = null;

    @Before
    public void setUp()
    {
        this.processor = new CellInputProcessor();
    }

    @Test
    public void testprocessforInput()
    {
        ////Processing actual input to generate enriched input.
        Cell actualInputCell[][] = this.processor.process( TestData.getTestDataInputCellA() );
        //Printing Input Data.
        this.processor.printCell( TestData.getTestDataInputCellA() );
        //Printing Expected Output Data.
        this.processor.printCell( TestData.getTestDataEnrichedInputCellA() );
        //Printing Actual Output Data.
        this.processor.printCell( actualInputCell );
        assertEquals( "CellInputProcessorTest Process For Input A", true, TestData.compareCell( TestData.getTestDataEnrichedInputCellA(), actualInputCell ) );
    }
}
