import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3 };
    //int[] input2 = { 2, 3, 4, 5, 6 };
    ArrayExamplesO.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 3 }, input1);
    //ArrayExamplesO.reverseInPlace(input2);
    //assertArrayEquals(new int[]{ 6, 5, 4, 3, 2 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = { };
    int[] input2 = { 2, 3, 4, 5, 6 };
    assertArrayEquals(new int[]{ }, ArrayExamples.reversed(input1));
    assertArrayEquals(new int[]{ 6, 5, 4, 3, 2 }, ArrayExamples.reversed(input2));
  }


  @Test
  public void testAverageWithoutLowest(){
    double[] input1 = { 1 };
    assertEquals(0, ArrayExamples.averageWithoutLowest(input1), 0.001);
  }

}
