package Activity01;



import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class CardTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class CardTest
{
    /**
     * Default constructor for test class CardTest
     */
    public CardTest()
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
    public void Rank()
    {
        Activity01.Card card2 = new Activity01.Card("King", "Hearts", 13);
        assertEquals("King", card2.rank());
    }

    @Test
    public void Suit()
    {
        Activity01.Card card1 = new Activity01.Card("King", "Hearts", 13);
        assertEquals("Hearts", card1.suit());
    }

    @Test
    public void Point()
    {
        Activity01.Card card1 = new Activity01.Card("King", "Hearts", 13);
        assertEquals(13, card1.pointValue());
    }
}



