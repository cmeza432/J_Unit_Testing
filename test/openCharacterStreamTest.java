/*
Test file for the open_character_stream method in Printtokens2
By:     Carlos Meza, David Benepe
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.runner.*;
import org.junit.runner.notification.Failure;
import java.util.List;
import junit.testing.Printtokens2;


public class openCharacterStreamTest {
    
    public static void main(String[] args){
        Result result = JUnitCore.runClasses(openCharacterStreamTest.class);
        List<Failure> failures = result.getFailures();
        for(Failure failure : failures){
            System.out.println(failure);
            System.out.println(failure.getTrace());
        }
    }
    
    @Before
    public void setUp() {
    }

    @Test
    public void checkInvalid(){
        Printtokens2 stream = new Printtokens2();
        BufferedReader br;
        br = stream.open_character_stream("MyFile");
        assertEquals(null, output);
    }
    
    @Test
    public void checkNullCorrect(){
    }

    @Test
    public void checkCorrectFile(){

    }

    @After
    public void tearDown() {
    }
}
