

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class DemoTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class DemoTest
{
    /**
     * Default constructor for test class DemoTest
     */
    public DemoTest()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void createNewOwner()
    {
        Owner owner1 = new Owner();
        owner1.firstName = "John";
        owner1.lastName = "Smith";
    }
}

