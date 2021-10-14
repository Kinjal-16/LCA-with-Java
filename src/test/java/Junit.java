import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;

public class Junit {
    @Test
    void simpleAssertion(){
        LCA ob = new LCA();
        assertEquals(10,ob.checkLCA(6,12));
        assertEquals(10,ob.checkLCA(10,12));
        assertEquals(15,ob.checkLCA(20,6));
        assertEquals(20,ob.checkLCA(18,22));
        assertEquals(30,ob.checkLCA(30,30));

    }
}