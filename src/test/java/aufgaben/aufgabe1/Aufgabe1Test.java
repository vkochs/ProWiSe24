 package aufgaben.aufgabe1;


import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aufgaben.aufgabe1.Aufgabe1;

import java.io.PrintStream;

public class Aufgabe1Test {
    /* 
    private final ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUp() {
        // Redirect System.out to a ByteArrayOutputStream
        System.setOut(new PrintStream(outputStream));
    }

    @AfterEach
    public void restoreSystemOut() {
        // Restore the original System.out after each test
        System.setOut(originalOut);
    }

    @Test
    public void testIfRhombusWithHeight3AndFilled(){
        var rhombus = new Aufgabe1();
        rhombus.printRhombus(1, true);
        String expectedOutput = " *" + System.lineSeparator()
        + "***" + System.lineSeparator() + " *" + System.lineSeparator() + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
    @Test
    public void testIfRhombusWithHeight3AndUnfilled(){
        var rhombus = new Aufgabe1();
        rhombus.printRhombus(1, false);
        String expectedOutput = " *" + System.lineSeparator()
        + "* *" + System.lineSeparator() + " *" + System.lineSeparator() + System.lineSeparator();
        assertEquals(expectedOutput, outputStream.toString());
    }
    @Test
    public void testIfRhombusWithHeight5AndFilled(){
         var rhombus = new Aufgabe1();
        Aufgabe1.printRhombus(2, true);
        String expectedOutput = "  *" + System.lineSeparator() + " ***" + System.lineSeparator() + "*****" + System.lineSeparator() +
        " ***" + System.lineSeparator() + "  *" + System.lineSeparator() + System.lineSeparator();
         assertEquals(expectedOutput, outputStream.toString());
    }

     @Test
    public void testIfRhombusWithHeight5AndUnfilled(){
         var rhombus = new Aufgabe1();
        Aufgabe1.printRhombus(2, false);
        String expectedOutput = "  *" + System.lineSeparator() + " * *" + System.lineSeparator() + "*   *" + System.lineSeparator() +
        " * *" + System.lineSeparator() + "  *" + System.lineSeparator() + System.lineSeparator();
         assertEquals(expectedOutput, outputStream.toString());

    } 
  @Test
    public void testIfRhombusWithHeight11AndFilled(){
         var rhombus = new Aufgabe1();
        rhombus.printRhombus(5, true);
        String expectedOutput = "     *" + System.lineSeparator() +
         "    ***" + System.lineSeparator() +
         "   *****" + System.lineSeparator() +
         "  *******" + System.lineSeparator() + 
         " *********" + System.lineSeparator() +
         "***********" + System.lineSeparator() +
         " *********"  + System.lineSeparator() +
        "  *******" + System.lineSeparator() +
         "   *****" + System.lineSeparator() +
         "    ***" + System.lineSeparator() +
        "     *" + System.lineSeparator() + System.lineSeparator();
     assertEquals(expectedOutput, outputStream.toString());
    } 

     @Test
    public void testIfRhombusWithHeight11AndUnfilled(){ var rhombus = new Aufgabe1();
        Aufgabe1.printRhombus(5, false);
        String expectedOutput = "     *" + System.lineSeparator() +
         "    * *" + System.lineSeparator() +
        "   *   *" + System.lineSeparator() +
         "  *     *" + System.lineSeparator() + 
         " *       *" + System.lineSeparator() +
        "*         *" + System.lineSeparator() +
         " *       *"  + System.lineSeparator() +
        "  *     *" + System.lineSeparator() +
         "   *   *" + System.lineSeparator() +
         "    * *" + System.lineSeparator() +
        "     *" + System.lineSeparator() + System.lineSeparator();
     assertEquals(expectedOutput, outputStream.toString());

    } 

 */   
}
 