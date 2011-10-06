package com.wiki;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.wiki.service.AccountDataServiceTest;

public class AllTests
{
    public static ApplicationContext CONTEXT;

    public static void main( final String[] args )
    {
        TestRunner.run( suite() );
    }

    public static Test suite()
    {
        CONTEXT = new ClassPathXmlApplicationContext( "spring-ehcache-test-context.xml" );
        TestSuite suite = new TestSuite( "Test for spring-ehcache" );
        suite.addTestSuite( AccountDataServiceTest.class );
        return suite;
    }
}
