package trabajo1;

/**
 * LongestRepetitionTest clase para testear los metodos de LongestRepetition.
 *
 */

import org.junit.Assert;
import org.junit.Test;

import trabajo1.LongestRepetition;

public class LongestRepetitionTest {

  
  /**
   * Prueba repetition.
   * 
   */
  @Test
  public void probarRepetition() {
	String str = "AABEBECDD"; 	
	String res = LongestRepetition.repetition(str);
    String expectedRes = "BE";
    Assert.assertEquals(expectedRes, res); 
    
  }
  
  /**
   * Prueba funcion z.
   * 
   */
  @Test
  public void probarZ() {
	String str = "abacaba";  //[0,0,1,0,3,0,1]	
	int[] res = LongestRepetition.z(str);
	int[] expectedRes = {0,0,1,0,3,0,1};
	Assert.assertArrayEquals( expectedRes, res);     
  }
  
}
