package aufgaben.aufgabe3;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import aufgaben.aufgabe3.*;

public class TriangleTest {
@Test
Triangle t1 = new Triangle(3,4,5);

public void circumferenceTest(){
    assertEquals(12, Triangle.circumference());
}
}
