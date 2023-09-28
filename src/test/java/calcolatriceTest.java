import org.example.Calcolatrice;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;


public class calcolatriceTest {

    Calcolatrice calc;

    @Before
    public final void setUp(){
        calc = new Calcolatrice();
    }

    @Test
    public void testSomma(){
        assertTrue("somma coretta", calc.somma(2,3) == 5);
    }

    @Test
    public void testSottrazione(){
        assertTrue("sottrazione coretta", calc.sottrazione(2,1)==1);
    }

}