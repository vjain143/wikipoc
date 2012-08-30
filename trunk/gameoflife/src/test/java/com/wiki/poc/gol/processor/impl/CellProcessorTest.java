/**
 * * Test class is use to test integration of input and output processor.
 *  It also test functionality of 'Game of Life' for inputs.
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
public class CellProcessorTest extends TestCase
{
    /* GOL InputProcessor */
    private GenericProcessor inputProcessor  = null;
    /* GOL OutputProcessor */
    private GenericProcessor outputProcessor = null;

    @Before
    public void setUp()
    {
        //Initializing processors.
        this.inputProcessor = new CellInputProcessor();
        this.outputProcessor = new CellOutputProcessor();
    }

    @Test
    public void testprocessA()
    {
        //Printing Input data.
        this.inputProcessor.printCell( TestData.getTestDataInputCellA() );
        //Processing Input data.
        Cell[][] actualOutput = this.outputProcessor.process( this.inputProcessor.process( TestData.getTestDataInputCellA() ) );
        //Printing Output data.
        this.outputProcessor.printCell( actualOutput );
        //Verify actual output against expected output.
        assertEquals( "CellProcessorTest Process For Input A", true, TestData.compareCell( TestData.getTestDataExpectedInputCellA(), actualOutput ) );
    }

    @Test
    public void testprocessB()
    {
        //Printing Input data.
        this.inputProcessor.printCell( TestData.getTestDataInputCellB() );
        //Processing Input data.
        Cell[][] actualOutput = this.outputProcessor.process( this.inputProcessor.process( TestData.getTestDataInputCellB() ) );
        //Printing Output data.
        this.outputProcessor.printCell( actualOutput );
        //Verify actual output against expected output.
        assertEquals( "CellProcessorTest Process For Input B", true, TestData.compareCell( TestData.getTestDataExpectedInputCellB(), actualOutput ) );
    }

    @Test
    public void testprocessC()
    {
        //Printing Input data.
        this.inputProcessor.printCell( TestData.getTestDataInputCellC() );
        //Processing Input data.
        Cell[][] actualOutput = this.outputProcessor.process( this.inputProcessor.process( TestData.getTestDataInputCellC() ) );
        //Printing Output data.
        this.outputProcessor.printCell( actualOutput );
        //Verify actual output against expected output.
        assertEquals( "CellProcessorTest Process For Input C", true, TestData.compareCell( TestData.getTestDataExpectedInputCellC(), actualOutput ) );
    }

    @Test
    public void testprocessD()
    {
        //Printing Input data.
        this.inputProcessor.printCell( TestData.getTestDataInputCellD() );
        //Processing Input data.
        Cell[][] actualOutput = this.outputProcessor.process( this.inputProcessor.process( TestData.getTestDataInputCellD() ) );
        //Printing Output data.
        this.outputProcessor.printCell( actualOutput );
        //Verify actual output against expected output.
        assertEquals( "CellProcessorTest Process For Input D", true, TestData.compareCell( TestData.getTestDataExpectedInputCellD(), actualOutput ) );
    }
}
