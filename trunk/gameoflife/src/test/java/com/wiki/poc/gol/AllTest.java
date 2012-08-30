/**
 * Test class for running all JUnit test cases in single class
 */
package com.wiki.poc.gol;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import com.wiki.poc.gol.processor.impl.CellInputProcessorTest;
import com.wiki.poc.gol.processor.impl.CellOutputProcessorTest;
import com.wiki.poc.gol.processor.impl.CellProcessorTest;

/**
 * @author Wiki
 */
public class AllTest
{
    public static void main( final String[] args )
    {
        //Calling Test Suite.
        TestRunner.run( suite() );
    }

    public static Test suite()
    {
        //Creating a TestSuite.
        TestSuite suite = new TestSuite( "Test for Game of Life" );

        //Adding Test Suite for Input Processor 
        //suite.addTestSuite( CellInputProcessorTest.class );

        //Adding Test Suite for Output Processor
        //suite.addTestSuite( CellOutputProcessorTest.class );

        //Adding Test Suite for Cell Main Processor
        suite.addTestSuite( CellProcessorTest.class );

        return suite;
    }
}
