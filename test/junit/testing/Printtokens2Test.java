// Junit test file for Printtokens2
// Project for Software Testing
// Created by: Carlos Meza, David Benepe

package junit.testing;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import java.io.InputStreamReader;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;


public class Printtokens2Test {
    
    public Printtokens2Test() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    /*
    // Test of open_character_stream method, of class Printtokens2.    
    @Test
    public void testOpen_character_stream() throws FileNotFoundException {
        BufferedReader result = new BufferedReader(new InputStreamReader(System.in)); 
        BufferedReader name_result;
        FileReader fr = new FileReader("MyName");
        name_result = new BufferedReader(fr);
        
        assertEquals(result, Printtokens2.open_character_stream(null));
        assertEquals(name_result, Printtokens2.open_character_stream("MyName"));

    }
    
    // Test of open_token_stream method, of class Printtokens2.
    @Test
    public void testOpen_token_stream() {
        // Expected value into variable to assert
        BufferedReader name, nothing;
        name = Printtokens2.open_character_stream("MyFile");
        nothing = Printtokens2.open_character_stream(null);
        // Assert values expected with open character stream
        assertEquals(name, Printtokens2.open_token_stream("MyFile"));
        assertEquals(nothing, Printtokens2.open_token_stream(null));
    }
    
    //Test of get_token method, of class Printtokens2.
    @Test
    public void testGet_token() {

        
    }
    */
    //Test of is_token_end method, of class Printtokens2.
    @Test
    public void testIs_token_end() {
        // EOF test
        assertEquals(true, Printtokens2.is_token_end(1, -1));

        // Is string token test
        assertEquals(true, Printtokens2.is_token_end(1, 10));
        assertEquals(false, Printtokens2.is_token_end(1, 11));

        // Is comment token test
        assertEquals(true, Printtokens2.is_token_end(2, 10));
        assertEquals(false, Printtokens2.is_token_end(2, 11));

        // Is special symbol test
        assertEquals(true, Printtokens2.is_token_end(0, 28));

        // Checks for empty or spaces
        assertEquals(true, Printtokens2.is_token_end(3, 59));

        // Return false for anything else
        assertEquals(false, Printtokens2.is_token_end(3, 20));
    }
    
    //Test of token_type method, of class Printtokens2.
    @Test
    public void testToken_type() {
        // Test for keyword
        assertEquals(Printtokens2.keyword, Printtokens2.token_type("and"));

        // Test for special symbol
        assertEquals(Printtokens2.spec_symbol, Printtokens2.token_type("("));
        
        // Test for identifier
        assertEquals(Printtokens2.identifier, Printtokens2.token_type("a"));
        
        // Test for number constant
        assertEquals(Printtokens2.num_constant, Printtokens2.token_type("123"));
        
        // Test for string constant
        assertEquals(Printtokens2.str_constant, Printtokens2.token_type("asd"));
        
        // Test for character constant
        assertEquals(Printtokens2.char_constant, Printtokens2.token_type("#c"));
        
        // Test for comments
        assertEquals(Printtokens2.comment, Printtokens2.token_type(";"));
        
        // Test for anything else which should give error
        assertEquals(Printtokens2.error, Printtokens2.token_type("{"));
    }
    
    //Test of print_token method, of class Printtokens2.
    @Test
    public void testPrint_token() {
        // test the "and" token print statement
        Printtokens2 stream = new Printtokens2();
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token("and");
        assertEquals("keyword,\"and\".\n", outContent.toString());

        // Testing for error token print statement
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token("1a");
        assertEquals("error,\"1a\".\n", outContent.toString());

        // Testing special symbol token print statement
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token(")");
        assertEquals("rparen.\n", outContent.toString());

        // Testing for identifier token print statement
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token("a1");
        assertEquals("identifier,\"a1\".\n", outContent.toString()); 

        // Testing for numeric token print statement
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token("123");
        assertEquals("numeric,\"123\".\n", outContent.toString());

        // Testing character token print statement
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        stream.print_token("#a");
        assertEquals("character,\"#a\".\n", outContent.toString());
    }
    
    //Test of is_comment method, of class Printtokens2.
    @Test
    public void testIs_comment() {
        // Test for comment which is equal to ascii(59) or ;
        assertEquals(true, Printtokens2.is_comment("59"));
        assertEquals(true, Printtokens2.is_comment(";"));

        // Test for error, anything else but comment
        assertEquals(false, Printtokens2.is_comment("70"));
    }
    
    //Test of is_keyword method, of class Printtokens2.
    @Test
    public void testIs_keyword() {
        // Test for keywords which include: and, or, if, xor, lambda, =>
        assertEquals(true, Printtokens2.is_keyword("and"));
        assertEquals(true, Printtokens2.is_keyword("or"));
        assertEquals(true, Printtokens2.is_keyword("if"));
        assertEquals(true, Printtokens2.is_keyword("xor"));
        assertEquals(true, Printtokens2.is_keyword("lambda"));
        assertEquals(true, Printtokens2.is_keyword("=>"));

        // Test for any error other than keyword
        assertEquals(false, Printtokens2.is_keyword("test"));
    }
    
    //Test of is_char_constant method, of class Printtokens2.
    @Test
    public void testIs_char_constant() {
        // Test for char constant which is # followed by only letters
        assertEquals(true, Printtokens2.is_char_constant("#bca"));
        assertEquals(true, Printtokens2.is_char_constant("#c"));

        // Test for error
        assertEquals(false, Printtokens2.is_char_constant("abc"));
    }
    
    //Test of is_num_constant method, of class Printtokens2.
    @Test
    public void testIs_num_constant() {
        // Test for number constants which are only numbers
        assertEquals(true, Printtokens2.is_num_constant("123"));
        assertEquals(true, Printtokens2.is_num_constant("1"));

        // Test for error, anything not a number
        assertEquals(false, Printtokens2.is_num_constant("1b"));
    }
    
    //Test of is_str_constant method, of class Printtokens2.
    @Test
    public void testIs_str_constant() {
        // Test string constants, have to be inside two quotes
        assertEquals(true, Printtokens2.is_str_constant("\"123\""));
        assertEquals(true, Printtokens2.is_str_constant("\"\""));

        // Test for error, anything not enclosed with quotes
        assertEquals(false, Printtokens2.is_str_constant("asd"));  
    }
    
    //Test of is_identifier method, of class Printtokens2.
    @Test
    public void testIs_identifier() {
        // Test identifier, letter followed by letters or numbers
        assertEquals(true, Printtokens2.is_identifier("a1"));
        assertEquals(true, Printtokens2.is_identifier("aa"));

        // Test for error, anything not starting with letter
        assertEquals(false, Printtokens2.is_identifier("1"));  
    }
    
    //Test of print_spec_symbol method, of class Printtokens2.
    @Test
    public void testPrint_spec_symbol() {
        // Set stream variable and test for right parentheses
        ByteArrayOutputStream outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol(")");
        assertEquals("rparen.\n", outContent.toString());

        // Reset stream and test for left parentheses
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol("(");
        assertEquals("lparen.\n", outContent.toString());

        // Reset stream and test for left bracket
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol("[");
        assertEquals("lsquare.\n", outContent.toString());

        // Reset stream and test for right bracket
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol("]");
        assertEquals("rsquare.\n", outContent.toString());

        // Reset stream and test for quotes
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol("'");
        assertEquals("quote.\n", outContent.toString());

        // Reset stream and test bquote
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
        Printtokens2.print_spec_symbol("`");
        assertEquals("bquote.\n", outContent.toString());
    }
    
    //Test of is_spec_symbol method, of class Printtokens2.
    @Test
    public void testIs_spec_symbol() {
        // Test for special symbols which include: 
        //  "(", ")", "[", "]", "/", "`", "," 
        assertEquals(true, Printtokens2.is_spec_symbol('('));
        assertEquals(true, Printtokens2.is_spec_symbol(')'));
        assertEquals(true, Printtokens2.is_spec_symbol('['));
        assertEquals(true, Printtokens2.is_spec_symbol(']'));
        assertEquals(true, Printtokens2.is_spec_symbol('/'));
        assertEquals(true, Printtokens2.is_spec_symbol('`'));
        assertEquals(true, Printtokens2.is_spec_symbol(','));
        assertEquals(false, Printtokens2.is_spec_symbol('{'));
    }
    /*
    //Test of main method, of class Printtokens2.
    @Test
    public void testMain() throws Exception {
        
    }
 */   
}
