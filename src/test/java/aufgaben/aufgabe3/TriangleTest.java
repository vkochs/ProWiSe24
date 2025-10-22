package aufgaben.aufgabe3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aufgaben.aufgabe3.Triangle;

public class TriangleTest {
    @Test
    public void testCircumference1(){
        assertEquals(12,Triangle.circumference(3,4,5));
    }
    @Test
    public void testCircumference2(){
        assertEquals(15,Triangle.circumference(4,4,7));
    }
   @Test
    public void testCircumference3(){
        assertEquals(15,Triangle.circumference(5,5,5));
    } 
    @Test
    public void testCircumference4(){
        assertEquals(15,Triangle.circumference(4,5,3));
    }
    @Test
    public void testCircumference5(){
        assertEquals(15,Triangle.circumference(4,3,5));
    }
    @Test
    public void testArea1(){
        assertEquals(6.0, Triangle.area(3,4,5));
    }
    @Test
    public void testArea2(){
        assertEquals(6.77720855862979, Triangle.area(4,4,7));
    }
@Test
    public void testArea3(){
        assertEquals(10.825317547305483, Triangle.area(5,5,5));
    }
    @Test
    public void testArea4(){
        assertEquals(6.0, Triangle.area(4,5,3));

    }
    @Test
    public void testArea5(){
        assertEquals(6.0, Triangle.area(4,3,5));

    }
}
