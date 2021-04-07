package fr.wildcodeschool.unittesting;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class StringUtilsTest {
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
    @Test
    public void testVowels()
    {
        StringUtils s = new StringUtils();
        String stg = s.vowels("alooooo");
        assertEquals("ooooo",stg);
        //assertTrue( stg, "ooooo");
    }
    @Test
    public void testVowels2()
    {
        StringUtils s = new StringUtils();
        String stg = s.vowels("Mustafa_123546-");
        assertEquals("uaa",stg);
        //assertTrue( stg, "ooooo");
    }
    @Test
    public void testVowels3()
    {
        StringUtils s = new StringUtils();
        String stg = s.vowels(null);
        assertEquals("",stg);
        //assertTrue( stg, "ooooo");
    }
    @Test
    public void testuniqueVowels()
    {
        StringUtils s = new StringUtils();
        String stg = s.uniqueVowels(null);
        assertEquals("",stg);
    }
    @Test
    public void testuniqueVowels2()
    {
        StringUtils s = new StringUtils();
        String stg = s.uniqueVowels("aaalooooo");
        assertEquals("ao",stg);
    }
    @Test
    public void testuniqueVowels3()
    {
        StringUtils s = new StringUtils();
        String stg = s.uniqueVowels("zrthhhh");
        assertEquals("",stg);
    }
}
