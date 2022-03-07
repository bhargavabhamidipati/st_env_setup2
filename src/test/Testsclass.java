import main.Calculator;
import org.junit.Test;
import static org.junit.Assert.*;

public class Testsclass{


    @Test
    public void testAdd(){
        Calculator obj;
        obj = new Calculator();
        assertEquals(4,obj.add(2,2));
    }
}