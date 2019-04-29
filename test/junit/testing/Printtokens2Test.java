// Junit test file for Printtoken2
// Project for Software Testing
// Created by:      Carlos Meza, David Benepe

package junit.testing;

import java.io.BufferedReader;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;


public class Printtokens2Test {
    
    public Printtokens2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }

    /**
     * Test of open_character_stream method, of class Printtokens2.
     */
    @Test
    public void testOpen_character_stream() {
        System.out.println("open_character_stream");
        String fname = "";
        Printtokens2 instance = new Printtokens2();
        BufferedReader expResult = null;
        BufferedReader result = instance.open_character_stream(fname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of open_token_stream method, of class Printtokens2.
     */
    @Test
    public void testOpen_token_stream() {
        System.out.println("open_token_stream");
        String fname = "";
        Printtokens2 instance = new Printtokens2();
        BufferedReader expResult = null;
        BufferedReader result = instance.open_token_stream(fname);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of get_token method, of class Printtokens2.
     */
    @Test
    public void testGet_token() {
        System.out.println("get_token");
        BufferedReader br = null;
        Printtokens2 instance = new Printtokens2();
        String expResult = "";
        String result = instance.get_token(br);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_token_end method, of class Printtokens2.
     */
    @Test
    public void testIs_token_end() {
        System.out.println("is_token_end");
        int str_com_id = 0;
        int res = 0;
        boolean expResult = false;
        boolean result = Printtokens2.is_token_end(str_com_id, res);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of token_type method, of class Printtokens2.
     */
    @Test
    public void testToken_type() {
        System.out.println("token_type");
        String tok = "";
        int expResult = 0;
        int result = Printtokens2.token_type(tok);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print_token method, of class Printtokens2.
     */
    @Test
    public void testPrint_token() {
        System.out.println("print_token");
        String tok = "";
        Printtokens2 instance = new Printtokens2();
        instance.print_token(tok);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_comment method, of class Printtokens2.
     */
    @Test
    public void testIs_comment() {
        System.out.println("is_comment");
        String ident = "";
        boolean expResult = false;
        boolean result = Printtokens2.is_comment(ident);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_keyword method, of class Printtokens2.
     */
    @Test
    public void testIs_keyword() {
        System.out.println("is_keyword");
        assertEquals(true, Printtokens2.is_keyword("and"));
        assertEquals(true, Printtokens2.is_keyword("or"));
        assertEquals(true, Printtokens2.is_keyword("if"));
        assertEquals(true, Printtokens2.is_keyword("xor"));
        assertEquals(true, Printtokens2.is_keyword("lambda"));
        assertEquals(true, Printtokens2.is_keyword("=>"));
        
        assertEquals(false, Printtokens2.is_keyword("test"));
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_char_constant method, of class Printtokens2.
     */
    @Test
    public void testIs_char_constant() {
        System.out.println("is_char_constant");
        String str = "";
        boolean expResult = false;
        boolean result = Printtokens2.is_char_constant(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_num_constant method, of class Printtokens2.
     */
    @Test
    public void testIs_num_constant() {
        System.out.println("is_num_constant");
        String str = "";
        boolean expResult = false;
        boolean result = Printtokens2.is_num_constant(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_str_constant method, of class Printtokens2.
     */
    @Test
    public void testIs_str_constant() {
        System.out.println("is_str_constant");
        String str = "";
        boolean expResult = false;
        boolean result = Printtokens2.is_str_constant(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_identifier method, of class Printtokens2.
     */
    @Test
    public void testIs_identifier() {
        System.out.println("is_identifier");
        String str = "";
        boolean expResult = false;
        boolean result = Printtokens2.is_identifier(str);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of print_spec_symbol method, of class Printtokens2.
     */
    @Test
    public void testPrint_spec_symbol() {
        System.out.println("print_spec_symbol");
        String str = "";
        Printtokens2.print_spec_symbol(str);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of is_spec_symbol method, of class Printtokens2.
     */
    @Test
    public void testIs_spec_symbol() {
        System.out.println("is_spec_symbol");
        char c = ' ';
        boolean expResult = false;
        boolean result = Printtokens2.is_spec_symbol(c);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of main method, of class Printtokens2.
     */
    @Test
    public void testMain() throws Exception {
        System.out.println("main");
        String[] args = null;
        Printtokens2.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
