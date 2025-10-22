package aufgaben.aufgabe2;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import aufgaben.aufgabe2.Aufgabe2;

public class Aufgabe2Test {
    @Test
    public void testLength0(){
        assertEquals(0, Aufgabe2.lengthOfNumber(0));
    }

    @Test
    public void testLength1(){
        assertEquals(1, Aufgabe2.lengthOfNumber(1));
    } 
@Test
    public void testLength10(){
        assertEquals(2, Aufgabe2.lengthOfNumber(10));
    } 
@Test
    public void testLength1234(){
        assertEquals(4, Aufgabe2.lengthOfNumber(1234));
    } 
@Test
     public void testLength1234n(){
        assertEquals(4, Aufgabe2.lengthOfNumber(-1234));
    }      
@Test
    public void testFirstDigit0(){
        assertEquals(0, Aufgabe2.firstDigit(0));
    }  
@Test
    public void testFirstDigit1(){
        assertEquals(1, Aufgabe2.firstDigit(1));
    }        
@Test
    public void trestFirstDigit10(){
        assertEquals(1, Aufgabe2.firstDigit(10));
    }  
@Test
    public void testFirstDigit1234n(){
        assertEquals(1, Aufgabe2.firstDigit(-1234));
    }
    public void testFirstDigit5678(){
        assertEquals(5, Aufgabe2.firstDigit(5678));
    }  
@Test
    public void testPowerOf10ToN0(){
        assertEquals(1, Aufgabe2.powerOf10ToN(0));
    }
@Test
    public void testPowerOf10ToN1(){
        assertEquals(10, Aufgabe2.powerOf10ToN(1));
    }    
@Test
    public void testPowerOf10ToN3(){
        assertEquals(1000, Aufgabe2.powerOf10ToN(3));
    }       
@Test
    public void testPowerOf10ToN4(){
        assertEquals(10000, Aufgabe2.powerOf10ToN(4));
    }
@Test
    public void testCutFirstDigit0(){
        assertEquals(0, Aufgabe2.cutFirstDigit(0));
    } 
@Test
    public void testCutFirstDigit1(){
        assertEquals(0, Aufgabe2.cutFirstDigit(1));
    }           
@Test
    public void testCutFirstDigit9n(){
        assertEquals(0, Aufgabe2.cutFirstDigit(-9));
    } 
@Test
    public void testCutFirstDigit91(){
        assertEquals(1, Aufgabe2.cutFirstDigit(91));
    } 
@Test
    public void testCutFirstDigit1234(){
        assertEquals(234, Aufgabe2.cutFirstDigit(1234));
    } 
@Test
    public void testCutFirstDigit9999n(){
        assertEquals(-999, Aufgabe2.cutFirstDigit(-9999));
    } 
@Test
    public void testCutFirstDigit1023(){
        assertEquals(23, Aufgabe2.cutFirstDigit(1023));
    }
@Test
    public void testSecondDigitIsZero0(){
        assertTrue(false,Aufgabe2.secondDigitIsZero(0));
    } 
@Test
    public void testSecondDigitIsZero1(){
        assertTrue(false,Aufgabe2.secondDigitIsZero(1));
    }         
@Test
    public void testSecondDigitIsZero9(){
        assertTrue(false,Aufgabe2.secondDigitIsZero(9));
    } 
@Test
    public void testSecondDigitIsZero101(){
        assertTrue(true,Aufgabe2.secondDigitIsZero(101));
    } 
@Test
    public void testSecondDigitIsZero10234n(){
        assertTrue(true,Aufgabe2.secondDigitIsZero(-10234));
    }     
}
