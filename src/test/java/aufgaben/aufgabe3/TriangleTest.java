package aufgaben.aufgabe3;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import aufgaben.aufgabe3.*;

public class TriangleTest {
    
    @Test
    public void circumferenceTest(){
        Triangle t1 = new Triangle(3,4,5);
        assertEquals(12, t1.circumference());
    }

    @Test
    public void areaTest(){
         Triangle t1 = new Triangle(3,4,5);
         assertEquals(6.0, t1.area());
    }

    @Test
    public void equilateralTest(){

        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(5,5,5);
        assertFalse(t1.equilateral());
        assertTrue(t2.equilateral());
    }

     @Test
    public void isoceledsTest(){

        Triangle t1 = new Triangle(3,4,5);
        Triangle t2 = new Triangle(5,5,5);
        Triangle t3 = new Triangle(5,5,4);
        Triangle t4 = new Triangle(5,4,5);
        Triangle t5 = new Triangle(4,5,5);
        assertFalse(t1.isosceles());
        assertTrue(t2.isosceles());
        assertTrue(t3.isosceles());
        assertTrue(t4.isosceles());
        assertTrue(t5.isosceles());
    }

@Test
public void circumferenceSmallerBiggerSameTest() {
    Triangle t1 = new Triangle(5,5,5);
    Triangle t2 = new Triangle(5,5,4);
    Triangle t3 = new Triangle(5,4,5);
    assertFalse(t1.sameCircumference(t2));
    assertTrue(t2.sameCircumference(t3));
    assertFalse(t1.isSmaller(t2));
    assertTrue(t2.isSmaller(t1));
    assertFalse(t2.isSmaller(t3));
    assertTrue(t1.isBigger(t2));
    assertFalse(t2.isBigger(t1));
    assertFalse(t2.isBigger(t3));
}  
}
